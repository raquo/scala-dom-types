ThisBuild / scalaVersion := ScalaVersions.v213
ThisBuild / crossScalaVersions := Seq(ScalaVersions.v3RC1, ScalaVersions.v213, ScalaVersions.v212, ScalaVersions.v211)

lazy val domtypes =
  crossProject(JSPlatform, JVMPlatform).in(file("."))
    .settings(
      scalacOptions ~= (_.filterNot(Set(
        "-Wunused:params",
        "-Ywarn-unused:params",
        "-Wunused:explicits"
      ))),
      scalacOptions in (Compile, doc) ~= (_.filter(_.startsWith("-Xplugin"))),
      scalacOptions in (Compile, doc) ++= Seq(
        "-no-link-warnings" // Suppress scaladoc "Could not find any member to link for" warnings
      )
    )
    .jsSettings(
      scalaJSLinkerConfig ~= { _.withSourceMap(false) },
      libraryDependencies ++= Seq(
        ("org.scala-js" %%% "scalajs-dom" % "1.1.0").withDottyCompat(scalaVersion.value)
      )
    )

lazy val noPublish = Seq(
  publishLocal / skip := true,
  publish / skip := true,
  publishTo := Some(Resolver.file("Unused transient repository", file("target/unusedrepo")))
)

lazy val root =
  project.in(file("."))
    .aggregate(domtypes.js, domtypes.jvm)
    .settings(noPublish)
    .settings(
      name := "Scala DOM Types"
    )
