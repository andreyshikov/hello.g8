lazy val root = (project in file(".")).
  aggregate($name$).
  settings(inThisBuild(List(
      organization := "com.example",
      scalaVersion := "$scala_version$"
    )),
    name := "$name$-root"
  )

lazy val app = (project in file("$name$")).
  settings(
    name := "$name$"
  )
