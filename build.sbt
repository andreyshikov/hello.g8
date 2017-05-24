lazy val root = (project in file(".")).
  aggregate($name$App).
  settings(inThisBuild(List(
      organization := "com.example",
      scalaVersion := "$scala_version$"
    )),
    name := "$name$-root"
  )

lazy val $name$App = (project in file("$name;format="lower"$")).
  settings(
    name := "$name$"
  )
