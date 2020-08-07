organization := "com.thoughtworks.binding"

name := "FutureBinding"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.2.1" % Test

libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "12.0.0"

scalacOptions += "-feature"

// Enable SAM type
scalacOptions += "-Xexperimental"
