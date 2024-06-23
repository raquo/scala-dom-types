/* See https://www.scala-sbt.org/1.x/docs/Testing-sbt-plugins.html */

enablePlugins(DomTypeDefsGeneratorPlugin)
domTypeDefsPackage := "com.example.test"
domTypeDefsConfiguredGenerator := {
  val prev = domTypeDefsConfiguredGenerator.value
  prev.copy(
    typeDefsPackage = "com.example.test2", // so we can test that overriding config works.
    settersPackagePath = Some("com.example.test.setterssss"),
    scalaJsElementTypeParam = Some("EELLEEMM")
  )
}
