name := "csv-validator-core"

version := "1.0"

organization := "uk.gov.tna.dri"

scalaVersion := "2.10.0"

publishTo := Some("Artifactory Realm" at "http://wb-d-tfs2.web.local:8081/artifactory/libs-release-local")

credentials += Credentials("Artifactory Realm", "wb-d-tfs2.web.local", "admin", "Swansong7")

publishMavenStyle := true

resolvers += "artifactory-external-releases" at "http://wb-d-tfs2.web.local:8081/artifactory/ext-release-local"

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2" % "1.12.3" % "test",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)

libraryDependencies ++= Seq(
  "net.sf.opencsv" % "opencsv" % "2.3",
  "org.scalaz" %% "scalaz-core" % "6.0.4",
  "net.liftweb" %% "lift-json-scalaz" % "2.5-M4"
)



