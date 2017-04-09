enablePlugins(ScalaJSPlugin)

enablePlugins(ScalaJSBundlerPlugin)

name := "Scala DOM Builder"

normalizedName := "dombuilder"

organization := "com.raquo.dombuilder"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.11.8", "2.12.1")

homepage := Some(url("https://github.com/raquo/scala-dom-builder"))

licenses += ("MIT", url("https://github.com/raquo/scala-dom-builder/blob/master/LICENSE.txt"))

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.1",
  "org.scalatest" %%% "scalatest" % "3.0.1" // % "test" @TODO[Elegance] We have reusable test helpers. Create a separate SnabbdomTestUtils package.
)

persistLauncher in Test := false

useYarn := true

requiresDOM in Test := true

emitSourceMaps in fastOptJS := false
