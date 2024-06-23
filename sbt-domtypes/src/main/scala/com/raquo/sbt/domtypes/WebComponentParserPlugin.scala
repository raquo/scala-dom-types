package com.raquo.sbt.domtypes

import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport.*
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport.*
import sbt.*
import sbt.Keys.*
import upickle.default.*

import java.nio.file.Files
import java.nio.file.NoSuchFileException
import java.nio.file.Path

/** Plugin for parsing a web component library's custom-elements.json (see https://github.com/webcomponents/custom-elements-manifest?tab=readme-ov-file) into
  * scala-domtypes for futher processing.
  */
object WebComponentParserPlugin extends AutoPlugin {

  object autoImport {
    val customElementsJsonFile = settingKey[File](
      "Path to the custom-elements.json file to parse."
    )

    val customElementsManifest = taskKey[CustomElementsManifest](
      "Parse the custom-elements.json file into a CustomElementsManifest for downstream processing."
    )

    // TODO: add useful task(s) to generate scala-domtypes from parsed CustomElementsManifest?
  }

  import autoImport.*

  override def requires: Plugins = ScalaJSPlugin && ScalaDomTypesPlugin

  override def projectSettings: Seq[Setting[_]] = {
    Seq(
      customElementsManifest := {
        try {
          val fileContent = Files.readString(customElementsJsonFile.value.toPath())
          read[CustomElementsManifest](fileContent)
        } catch {
          case err: NoSuchFileException =>
            throw new Exception(
              s"NoSuchFileException: ${err.getMessage} file not found. Make sure the path is correct. Make sure to npm install JS dependencies in the ./js folder."
            )
        }
      }
    )
  }
}
