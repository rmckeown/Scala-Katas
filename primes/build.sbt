organization := "com.mckeown"

name := "Primes"

version := "1.0"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "sonatype-releases" at "https://oss.sonatype.org/content/repositories/releases/"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
    "org.scalatest"       %% "scalatest"      % "2.2.6" % "test"
)