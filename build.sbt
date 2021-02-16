scalaVersion in ThisBuild := Versions.Scala_2_13

crossScalaVersions in ThisBuild := Seq(Versions.Scala_2_13, Versions.Scala_2_12, Versions.Scala_2_11)

// @TODO Does this need to be here too?
releaseCrossBuild := true

lazy val commonSettings = Seq(
  name := "Scala DOM Types",
  organization := "com.raquo",
  normalizedName := "domtypes",
  homepage := Some(url("https://github.com/raquo/scala-dom-types")),
  licenses += ("MIT", url("https://github.com/raquo/scala-dom-types/blob/master/LICENSE.md")),
  scmInfo := Some(
    ScmInfo(url("https://github.com/raquo/scala-dom-types"), "scm:git@github.com/raquo/scala-dom-types.git")
  ),
  developers := List(
    Developer(id = "raquo", name = "Nikita Gazarov", email = "nikita@raquo.com", url = url("https://github.com/raquo"))
  ),
  sonatypeProfileName := "com.raquo",
  publishMavenStyle := true,
  publishArtifact in Test := false,
  publishTo := sonatypePublishToBundle.value,
  releaseCrossBuild := true,
  pomIncludeRepository := { _ => false },
  releasePublishArtifactsAction := PgpKeys.publishSigned.value
)

releaseProcess := {
  import ReleaseTransformations._
  Seq[ReleaseStep](
    checkSnapshotDependencies,
    inquireVersions,
    runClean,
    runTest,
    setReleaseVersion,
    commitReleaseVersion,
    tagRelease,
    releaseStepCommandAndRemaining("+publishSigned"),
    releaseStepCommand("sonatypeBundleRelease"),
    setNextVersion,
    commitNextVersion,
    pushChanges
  )
}

lazy val noPublish = Seq(
  publishLocal / skip := true,
  publish / skip := true,
  publishTo := Some(Resolver.file("Unused transient repository", file("target/unusedrepo")))
)

lazy val root = project.in(file("."))
  .aggregate(domtypesJS, domtypesJVM)
  .settings(commonSettings)
  .settings(noPublish)

lazy val domtypes = crossProject(JSPlatform, JVMPlatform).in(file("."))
  .settings(commonSettings)
  .settings(
    scalacOptions ~= (_.filterNot(Set(
      "-Wunused:params",
      "-Ywarn-unused:params",
      "-Wunused:explicits"
    ))),
    scalacOptions in (Compile, doc) ~= (_.filter(_.startsWith("-Xplugin"))), // https://github.com/DavidGregory084/sbt-tpolecat/issues/36
    scalacOptions in (Compile, doc) ++= Seq(
      "-no-link-warnings" // Suppress scaladoc "Could not find any member to link for" warnings
    )
  )
  .jsSettings(
    scalaJSLinkerConfig ~= { _.withSourceMap(false) },
    libraryDependencies ++= Seq(
      ("org.scala-js" %%% "scalajs-dom" % Versions.ScalaJsDom).withDottyCompat(scalaVersion.value)
    )
  )

lazy val domtypesJS = domtypes.js
lazy val domtypesJVM = domtypes.jvm
