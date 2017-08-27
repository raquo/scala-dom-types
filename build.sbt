// @TODO[SBT] How to extract these shared settings into a separate release.sbt file?
val releaseSettings: Seq[Setting[_]] = Seq(
  name := "Scala DOM Types",
  normalizedName := "domtypes",
  organization := "com.raquo",
  scalaVersion in ThisBuild := "2.11.11", // @TODO[WTF] Why exactly do we need `in ThisBuild` here?
  crossScalaVersions in ThisBuild := Seq("2.11.11", "2.12.3"), // @TODO[WTF] Why exactly do we need `in ThisBuild` here?
  homepage := Some(url("https://github.com/raquo/scala-dom-types")),
  licenses += ("MIT", url("https://github.com/raquo/scala-dom-types/blob/master/LICENSE.txt")),
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/raquo/scala-dom-types"),
      "scm:git@github.com/raquo/scala-dom-types.git"
    )
  ),
  developers := List(
    Developer(
      id = "raquo",
      name = "Nikita Gazarov",
      email = "nikita@raquo.com",
      url = url("http://raquo.com")
    )
  ),
  sonatypeProfileName := "com.raquo",
  publishMavenStyle := true,
  publishArtifact in Test := false,
  publishTo := {
    val nexus = "https://oss.sonatype.org/"
    if (isSnapshot.value)
      Some("snapshots" at nexus + "content/repositories/snapshots")
    else
      Some("releases" at nexus + "service/local/staging/deploy/maven2")
  },
  releaseCrossBuild := true,
  pomIncludeRepository := { _ => false },
  useGpg := true,
  releasePublishArtifactsAction := PgpKeys.publishSigned.value
)

lazy val root = project.in(file("."))
  .aggregate(js, jvm)
  .settings(
    publish := {},
    publishLocal := {}
  )

lazy val domtypes = crossProject.in(file("."))
  .settings(releaseSettings)
  .jsConfigure(_.enablePlugins(ScalaJSBundlerPlugin))
  .jsSettings(
    requiresDOM in Test := true,
    useYarn := true,
    emitSourceMaps := false,
    libraryDependencies ++= Seq(
       "org.scala-js" %%% "scalajs-dom" % "0.9.3"
    )
  )
  .jvmSettings()

lazy val js = domtypes.js
lazy val jvm = domtypes.jvm
