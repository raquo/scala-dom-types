ThisBuild / organization := "com.raquo"
ThisBuild / homepage := Some(url("https://github.com/raquo/scala-dom-types"))
ThisBuild / licenses += "MIT" -> url("https://github.com/raquo/scala-dom-types/blob/master/LICENSE.md")
ThisBuild / scmInfo := Some(ScmInfo(url("https://github.com/raquo/scala-dom-types"), "scm:git@github.com/raquo/scala-dom-types.git"))
ThisBuild / developers += Developer("raquo", "Nikita Gazarov", "nikita@raquo.com", url("http://raquo.com"))
ThisBuild / sonatypeProfileName := "com.raquo"
ThisBuild / publishArtifact in Test := false
ThisBuild / publishTo := sonatypePublishToBundle.value
