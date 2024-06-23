package com.raquo.sbt.domtypes

import sbt.*
import sbt.Keys.*

/** Plugin that provides code generation for DOM type definitions. */
object DomTypeDefsGeneratorPlugin extends AutoPlugin {

  override def requires = ScalaDomTypesPlugin

  object autoImport {
    val domTypeDefsGenerate = taskKey[Seq[File]]("Generate dom-types defs")
    val domTypeDefsPackage = settingKey[String]("Package for generated dom-types defs in dot format, e.g. com.example.domtypes")
    val domTypeDefsConfiguredGenerator = settingKey[ConfiguredGenerator]("Configured generator")
  }

  import autoImport.*

  override def projectSettings: Seq[Setting[_]] = Seq(
    domTypeDefsConfiguredGenerator := ConfiguredGenerator(domTypeDefsPackage.value),
    domTypeDefsGenerate := {
      val configuredGenerator = domTypeDefsConfiguredGenerator.value
      val files = configuredGenerator.generateDomTypeDefs(
        (Compile / sourceManaged).value / "scala"
      )
      val log = streams.value.log
      files.foreach { file =>
        log.info(s"Generated ${file.getAbsolutePath}")
      }
      files
    },
    (Compile / sourceGenerators) += domTypeDefsGenerate.taskValue
  )
}
