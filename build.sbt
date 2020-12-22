import sbtcrossproject.CrossPlugin.autoImport.crossProject

inThisBuild(Seq(
  name := "Scala DOM Types",
  normalizedName := "domtypes",
  organization := "com.raquo",
  scalaVersion := "2.12.12",
  crossScalaVersions := Seq("2.11.12", "2.12.12", "2.13.4")
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


val baseScalacSettings =
  "-encoding" :: "UTF-8" ::
  "-unchecked" ::
  "-deprecation" ::
  "-explaintypes" ::
  "-feature" ::
  "-language:_" ::
  "-Xfuture" ::
  "-Xlint" ::
  "-Yno-adapted-args" ::
  "-Ywarn-value-discard" ::
  "-Ywarn-unused" ::
  Nil

lazy val scalacSettings = Seq(
  scalacOptions ++= {
    CrossVersion.partialVersion(scalaVersion.value) match {
      case Some((2, 13)) =>
        baseScalacSettings.diff(
          "-Xfuture" ::
          "-Yno-adapted-args" ::
          "-Ywarn-infer-any" ::
          "-Ywarn-nullary-override" ::
          "-Ywarn-nullary-unit" ::
          Nil
        )
      case _ => baseScalacSettings
    }
  }
)

lazy val commonSettings = releaseSettings ++ scalacSettings

lazy val root = project.in(file("."))
  .aggregate(domtypesJS, domtypesJVM)
  .settings(commonSettings)
  .settings(
    skip in publish := true
  )

lazy val domtypes = crossProject(JSPlatform, JVMPlatform).in(file("."))
  .settings(commonSettings)
  .jsConfigure(_.enablePlugins(ScalaJSBundlerPlugin))
  .jsSettings(
    scalaJSLinkerConfig ~= { _.withSourceMap(false) },
    requireJsDomEnv in Test := true,
    useYarn := true,
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "1.0.0"
    )
  )

lazy val domtypesJS = domtypes.js
lazy val domtypesJVM = domtypes.jvm
