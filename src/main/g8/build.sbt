name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "$scala_version$"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
 
libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.2-SNAPSHOT"

libraryDependencies += "org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"

libraryDependencies += "org.specs2" %% "specs2" % "1.14" % "test"

libraryDependencies += "com.typesafe.slick" %% "slick" % "1.0.1"