lazy val root = project
  .in(file("."))
  .enablePlugins(PlayJava)

sourceDirectory in Test := baseDirectory.value / "tests"

scalaSource in Test := baseDirectory.value / "tests"

javaSource in Test := baseDirectory.value / "tests"

resolvers ++= DefaultOptions.resolvers(snapshot = true)

resolvers += "scalaz-releases" at "http://dl.bintray.com/scalaz/releases" // specs2 depends on scalaz-stream

PlayKeys.playOmnidoc := false
