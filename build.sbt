import sbtcrossproject.CrossPlugin.autoImport.crossProject

val scala213Version = "2.13.4"
val scala212Version = "2.12.12"
val scala211Version = "2.11.12"
val scala3Version = "3.0.0-RC1-bin-20210113-8345078-NIGHTLY"

inThisBuild(Seq(
  name := "Scala DOM Types",
  normalizedName := "domtypes",
  organization := "com.raquo",
  scalaVersion := scala3Version, //scala213Version,
  crossScalaVersions := Seq(scala3Version, scala213Version, scala212Version, scala211Version)
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

lazy val adjustScalacOptions = { options: Seq[String] =>
  options.filterNot(
    Set(
      "-Wdead-code",
      "-Wunused:implicits",
      "-Wunused:explicits",
      "-Wunused:imports",
      "-Wunused:params"
    )
  )
}


lazy val scalacSettings = Seq(
  scalacOptions ~= adjustScalacOptions,
//  scalacOptions ++= (CrossVersion.partialVersion(scalaVersion.value) match {
//      case Some((3, _)) =>
//        Seq.empty
//      case _ =>
//        Seq(
//          "-Ymacro-annotations"
//        )
//    }),
)

lazy val commonSettings = releaseSettings ++ scalacSettings

lazy val root = project.in(file("."))
  .aggregate(domtypesJS, domtypesJVM)
  .settings(commonSettings)
  .settings(
    name := "Scala DOM Types",
    skip in publish := true
  )

lazy val domtypes = crossProject(JSPlatform, JVMPlatform).in(file("."))
  .settings(commonSettings)
  .jsConfigure(_.enablePlugins(ScalaJSBundlerPlugin))
  .jsSettings(
    scalaJSLinkerConfig ~= { _.withSourceMap(false) },
    requireJsDomEnv in Test := true,
    useYarn := true,
    libraryDependencies ++= (CrossVersion.partialVersion(scalaVersion.value) match {
      case Some((3, _)) => Seq("org.scala-js" %%% "scalajs-dom" % "1.2.0.3M3-SNAPSHOT")
      case Some((2, _)) => Seq("org.scala-js" %%% "scalajs-dom" % "1.1.0")
      case _ => Seq.empty
    })
  )

lazy val domtypesJS = domtypes.js
lazy val domtypesJVM = domtypes.jvm
