ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.5"

lazy val root = (project in file("."))
  .settings(
    name := "scala-zio"
  )

libraryDependencies += "dev.zio" %% "zio-http" % "3.1.0"
libraryDependencies += "dev.zio" %% "zio-json" % "0.7.39"