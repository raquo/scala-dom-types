package com.raquo.sbt.domtypes

import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport.*
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport.*
import sbt.*
import sbt.Keys.*

object WebComponentParserPlugin extends AutoPlugin {

  object autoImport {
    val domtypesVersion = settingKey[String](
      "Version of domtypes library to use. Provided by the plugin."
    )
  }

  import autoImport.*

  override def requires: Plugins = ScalaJSPlugin

  private def readDomtypesVersion: String = {
    val stream =
      getClass.getClassLoader.getResourceAsStream("domtypes-version.properties")
    val properties = new java.util.Properties()
    properties.load(stream)
    properties.getProperty("domtypes.version")
  }

  override def globalSettings: Seq[Setting[_]] = Seq(
    domtypesVersion := readDomtypesVersion
  )

  override def projectSettings: Seq[Setting[_]] = {
    Seq(
      libraryDependencies += "com.raquo" %% "domtypes" % domtypesVersion.value
    )
  }
}
