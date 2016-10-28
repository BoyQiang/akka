name := "akka-sample-remote-scala"

version := "2.4.12"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.4.12",
  "com.typesafe.akka" %% "akka-remote" % "2.4.12"
)

licenses := Seq(("CC0", url("http://creativecommons.org/publicdomain/zero/1.0")))
