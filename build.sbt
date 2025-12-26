ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.7.4"

lazy val root = (project in file("."))
  .settings(
    name := "intellij-property-key-inspection-issue"
  )

libraryDependencies += "org.jetbrains" % "annotations" % "26.0.2-1"
