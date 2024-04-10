ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.13"

lazy val root = (project in file("."))
  .settings(
    name := "intellij-property-key-inspection-issue"
  )

libraryDependencies += "org.jetbrains" % "annotations" % "24.1.0"
