organization := "com.thoughtworks.binding"

name := "FutureBinding"

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.1.2" % Test

libraryDependencies += "com.thoughtworks.binding" %%% "binding" % "12.0.2"

scalacOptions += "-feature"

// Enable SAM type
scalacOptions += "-Xexperimental"
