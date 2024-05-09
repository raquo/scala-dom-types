logLevel := Level.Warn

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.16.0")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject" % "1.2.0")

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.11")

addSbtPlugin("com.github.sbt" % "sbt-git" % "2.0.1")

// #TODO[Scala3] - removed pending https://github.com/typelevel/sbt-tpolecat/issues/102
// addSbtPlugin("io.github.davidgregory084" % "sbt-tpolecat" % "0.4.1")
