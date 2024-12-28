import VersionHelper.{versionFmt, fallbackVersion}

// Lets me depend on Maven Central artifacts immediately without waiting
ThisBuild / resolvers ++= Resolver.sonatypeOssRepos("public")
ThisBuild / resolvers ++= Resolver.sonatypeOssRepos("snapshots")


// Makes sure to increment the version for local development
ThisBuild / version := dynverGitDescribeOutput.value
  .mkVersion(out => versionFmt(out, dynverSonatypeSnapshots.value), fallbackVersion(dynverCurrentDate.value))

ThisBuild / dynver := {
  val d = new java.util.Date
  sbtdynver.DynVer
    .getGitDescribeOutput(d)
    .mkVersion(out => versionFmt(out, dynverSonatypeSnapshots.value), fallbackVersion(d))


}

(ThisBuild / scalaVersion) := Versions.Scala_2_12

(ThisBuild / crossScalaVersions) := Seq(
  Versions.Scala_3,
  Versions.Scala_2_13,
  Versions.Scala_2_12
)

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
  (Test / parallelExecution) := false,
  (Test / publishArtifact) := false,
  pomIncludeRepository := { _ => false },
  sonatypeCredentialHost := "s01.oss.sonatype.org",
  sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
)

lazy val noPublish = Seq(
  publishLocal / skip := true,
  publish / skip := true
)

lazy val root = project.in(file("."))
  .aggregate(domtypesJVM, domtypesJS) // order is important: first, generate sample traits, then try to compile them on the frontend
  .settings(commonSettings)
  .settings(noPublish)

lazy val domtypes = crossProject(JSPlatform, JVMPlatform).in(file("."))
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % Versions.ScalaTest % Test
    )
  )
  .settings(
    scalacOptions ++= Seq(
      "-feature",
      "-language:higherKinds"
    ),
    scalacOptions ~= (_.filterNot(Set(
      "-Wunused:params",
      "-Ywarn-unused:params",
      "-Wunused:explicits"
    ))),
    (Compile / doc / scalacOptions) ~= (_.filter(_.startsWith("-Xplugin"))), // https://github.com/DavidGregory084/sbt-tpolecat/issues/36
    (Compile / doc / scalacOptions) ++= Seq(
      "-no-link-warnings" // Suppress scaladoc "Could not find any member to link for" warnings
    ),
    (Test / scalacOptions) ~= { options: Seq[String] =>
      options.filterNot { o =>
        o.startsWith("-Ywarn-unused") || o.startsWith("-Wunused")
      }
    }
  )
  .jsSettings(
    scalaJSLinkerConfig ~= { _.withSourceMap(false) },
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-dom" % Versions.ScalaJsDom,
      "com.raquo" %%% "ew" % Versions.Ew % Test
    ),
    scalacOptions ++= {
      val sourcesUrl = s"https://raw.githubusercontent.com/raquo/scala-dom-types/${git.gitHeadCommit.value.get}"
      val sourcesOptionName = if (scalaVersion.value.startsWith("2.")) "-P:scalajs:mapSourceURI" else "-scalajs-mapSourceURI"
      Seq(
        s"${sourcesOptionName}:${file("js").toURI}->$sourcesUrl/js/",
        s"${sourcesOptionName}:${file("shared").toURI}->$sourcesUrl/shared/"
      )
    }
  )

lazy val domtypesJS = domtypes.js
lazy val domtypesJVM = domtypes.jvm
