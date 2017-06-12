
name := "Scala DOM Builder"

scalaVersion in ThisBuild := "2.12.2" // "in ThisBuild" also applies this setting to JS and JVM projects

//val Http4sVersion = "0.15.11a"

lazy val root = project.in(file("."))
  .aggregate(js, jvm)
  .settings(
    publish := {},
    publishLocal := {}
  )

lazy val dombuilder = crossProject.in(file("."))
  .settings(
    organization := "com.raquo.dombuilder",
    normalizedName := "dombuilder",
    version := "0.1-SNAPSHOT",
    crossScalaVersions := Seq("2.11.11", "2.12.2"),
    homepage := Some(url("https://github.com/raquo/scala-dom-builder")),
    licenses += ("MIT", url("https://github.com/raquo/scala-dom-builder/blob/master/LICENSE.txt"))
  )
  .jsConfigure(_.enablePlugins(ScalaJSBundlerPlugin))
  .jsSettings(
    persistLauncher in Test := false,
    requiresDOM in Test := true,
    useYarn := true,
    emitSourceMaps in fastOptJS := false,
    emitSourceMaps in fullOptJS := false,
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % "0.9.1",
      "org.scalatest" %%% "scalatest" % "3.0.1" // % "test" @TODO[API] We have reusable test helpers. Create a separate package for those.
    )
  )
  .jvmSettings(
    //    libraryDependencies ++= Seq(
    //      "org.http4s" %% "http4s-blaze-server" % Http4sVersion,
    //      "org.http4s" %% "http4s-circe" % Http4sVersion,
    //      "org.http4s" %% "http4s-dsl" % Http4sVersion,
    //      "ch.qos.logback" % "logback-classic" % "1.2.1"
    //    )
  )

lazy val js = dombuilder.js
lazy val jvm = dombuilder.jvm
