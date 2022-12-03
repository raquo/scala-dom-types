package com.raquo.domtypes.codegen

import java.io.{File, FileOutputStream, PrintStream}
import java.nio.file.{Files, Paths}

class CanonicalCache(
  cacheFileDirectoryPath: String = ".",
  lineSeparator: String = "\n"
) {

  val fileName: String = "lastScalaDomTypesVersion.txt"

  def filePath: String = Paths.get(cacheFileDirectoryPath + "/" + fileName).normalize().toString

  def log(str: String): Unit = println(str)

  /** Read version from cache, run `generate` if it does not match, then write new version to cache. */
  def triggerIfCacheKeyUpdated(requiredDomTypesVersion: String, forceOnEverySnapshot: Boolean)(generate: String => Unit): Unit = {
    log("> Scala DOM Types code generation")
    val lastSdtVersion = readCurrentKey()
    if (lastSdtVersion != requiredDomTypesVersion || (forceOnEverySnapshot && lastSdtVersion.contains("SNAPSHOT"))) {
      log(s"> Generating code for SDT version $requiredDomTypesVersion now.")
      generate(requiredDomTypesVersion)
      log(s"> DONE – Generated code for SDT version $requiredDomTypesVersion.")
      saveNewKey(requiredDomTypesVersion)
      log(s"> Scala Dom Types version `${requiredDomTypesVersion}` written into ${filePath}.")
    } else {
      log(s"> Nothing to generate – code already generated from SDT version ${requiredDomTypesVersion}.")
      log(s"> You can delete or clear `${filePath}` to force regeneration.")
    }
  }

  def readCurrentKey(): String = {
    val file = new File(filePath);
    if (file.exists()) {
      if (file.isFile) {
        val cachedKeyLines = Files.readAllLines(Paths.get(filePath))
        cachedKeyLines.toArray.mkString(lineSeparator)
      } else {
        throw new Exception(s"Can't read file `${filePath}` – it's not a file (must be a directory?)")
      }
    } else {
      ""
    }
  }

  def saveNewKey(newKey: String): Unit = {
    val file = new File(filePath)
    if (file.exists()) {
      if (!file.isFile) {
        throw new Exception(s"Can't write to file `${filePath}` – it's not a file (must be a directory?)")
      }
    } else {
      if (!file.getParentFile.exists()) {
        val directoryCreated = file.getParentFile.mkdirs()
        if (!directoryCreated) {
          throw new Exception(s"Can't create directory to write into file `${filePath}`")
        }
      }
    }
    val outputPrintStream = new PrintStream(new FileOutputStream(file))
    outputPrintStream.print(newKey)
    if (outputPrintStream.checkError()) {
      throw new Exception(s"Can't write into file `${filePath}` - output stream in error state")
    }
    outputPrintStream.close()
  }

  def deleteCacheFile(): Unit = {
    val file = new File(filePath);
    if (file.exists()) {
      if (file.isFile) {
        file.delete()
      } else {
        throw new Exception(s"Can't delete file `${filePath}` – it's not a file (must be a directory?)")
      }
    }
  }

}
