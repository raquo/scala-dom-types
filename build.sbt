inThisBuild(Seq(
  name := "Scala DOM Types",
  normalizedName := "domtypes",
  organization := "com.raquo",
  scalaVersion := "2.12.5",
  crossScalaVersions := Seq("2.11.12", "2.12.5")
))

// @TODO[WTF] Why can't this be inside releaseSettings?
releaseCrossBuild := true

// @TODO[SBT] How to extract these shared settings into a separate release.sbt file?
lazy val releaseSettings = Seq(
  homepage := Some(url("https://github.com/raquo/scala-dom-types")),
  licenses += ("MIT", url("https://github.com/raquo/scala-dom-types/blob/master/LICENSE.md")),
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
  publishTo := sonatypePublishTo.value,
  releaseCrossBuild := true,
  pomIncludeRepository := { _ => false },
  useGpg := false,
  releasePublishArtifactsAction := PgpKeys.publishSigned.value
)

lazy val scalacSettings = Seq(
  scalacOptions ++=
    "-encoding" :: "UTF-8" ::
    "-unchecked" ::
    "-deprecation" ::
    "-explaintypes" ::
    "-feature" ::
    "-language:_" ::
    "-Xfuture" ::
    "-Xlint" ::
    "-Ypartial-unification" ::
    "-Yno-adapted-args" ::
    "-Ywarn-infer-any" ::
    "-Ywarn-value-discard" ::
    "-Ywarn-nullary-override" ::
    "-Ywarn-nullary-unit" ::
    "-Ywarn-unused" ::
    Nil,

  scalacOptions ++= {
    CrossVersion.partialVersion(scalaVersion.value) match {
      case Some((2, 12)) =>
        "-Ywarn-extra-implicit" ::
        Nil
      case _ =>
        Nil
    }
  }
)

lazy val commonSettings = releaseSettings ++ scalacSettings

lazy val root = project.in(file("."))
  .aggregate(js, jvm)
  .settings(commonSettings)
  .settings(
    skip in publish := true
  )

lazy val domtypes = crossProject.in(file("."))
  .settings(commonSettings)
  .jsConfigure(_.enablePlugins(ScalaJSBundlerPlugin))
  .jsSettings(
    requiresDOM in Test := true,
    useYarn := true,
    emitSourceMaps := false,
    libraryDependencies ++= Seq(
       "org.scala-js" %%% "scalajs-dom" % "0.9.5"
    )
  )
  .jvmSettings()

lazy val js = domtypes.js
lazy val jvm = domtypes.jvm
