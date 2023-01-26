import sbtcrossproject.CrossPlugin.autoImport.{crossProject, CrossType}

parallelExecution in Global := false

lazy val FutureBinding =
  crossProject(JSPlatform, JVMPlatform).crossType(CrossType.Pure).build

organization in ThisBuild := "com.thoughtworks.binding"

publish / skip := true
