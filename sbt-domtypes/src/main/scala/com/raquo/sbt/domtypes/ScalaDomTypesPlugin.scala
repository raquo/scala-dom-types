package com.raquo.sbt.domtypes

import sbt.*
import sbt.Keys.*

/** Core Scala Dom Types plugin depended upon by other plugins */
object ScalaDomTypesPlugin extends AutoPlugin {

  object autoImport {
    val domtypesVersion = settingKey[String](
      "Version of domtypes library to use. Provided by the plugin."
    )
  }

  import autoImport.*

  private def readDomtypesVersion: String = {
    val stream =
      getClass.getClassLoader.getResourceAsStream("domtypes-version.properties")
    val properties = new java.util.Properties()
    properties.load(stream)
    properties.getProperty("domtypes.version")
  }

  override def buildSettings: Seq[Setting[_]] = Seq(
    libraryDependencies += "com.raquo" %% "domtypes" % domtypesVersion.value
  )

  override def globalSettings: Seq[Setting[_]] = Seq(
    domtypesVersion := readDomtypesVersion
  )
}
