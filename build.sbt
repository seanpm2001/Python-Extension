enablePlugins(org.nlogo.build.NetLogoExtension)

enablePlugins(org.nlogo.build.ExtensionDocumentationPlugin)

netLogoVersion := "6.0.2"

netLogoClassManager := "org.nlogo.py.PythonExtension"

netLogoExtName := "py"

netLogoZipSources := false

netLogoTarget := org.nlogo.build.NetLogoExtension.directoryTarget(baseDirectory.value)

scalaVersion := "2.12.2"

scalaSource in Compile := baseDirectory.value / "src"

libraryDependencies += "org.msgpack" % "msgpack-core" % "0.8.13"
