val scala3Version = "++3.0.0!"

lazy val root = project
  .in(file("."))
  .settings(
    name := "lesson7-classes-subclasses",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test
  )
