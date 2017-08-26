
name := "Scala DOM Types"

scalaVersion in ThisBuild := "2.11.11" // "in ThisBuild" also applies this setting to JS and JVM projects

lazy val root = project.in(file("."))
  .aggregate(js, jvm)
  .settings(
    publish := {},
    publishLocal := {}
  )

lazy val domtypes = crossProject.in(file("."))
  .settings(
    organization := "com.raquo",
    normalizedName := "domtypes",
    version := "0.1-SNAPSHOT",
    crossScalaVersions := Seq("2.11.11", "2.12.3"),
    homepage := Some(url("https://github.com/raquo/scala-dom-types")),
    licenses += ("MIT", url("https://github.com/raquo/scala-dom-types/blob/master/LICENSE.txt"))
  )
  .jsConfigure(_.enablePlugins(ScalaJSBundlerPlugin))
  .jsSettings(
    requiresDOM in Test := true,
    useYarn := true,
    emitSourceMaps in fastOptJS := false,
    emitSourceMaps in fullOptJS := false,
    libraryDependencies ++= Seq(
       "org.scala-js" %%% "scalajs-dom" % "0.9.3"
    )
  )
  .jvmSettings()

lazy val js = domtypes.js
lazy val jvm = domtypes.jvm
