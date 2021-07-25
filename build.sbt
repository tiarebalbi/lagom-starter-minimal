// Change here with your organization details
organization in ThisBuild := "com.tiarebalbi"
version in ThisBuild := "1.0-SNAPSHOT"

// the Scala version that will be used for cross-compiled libraries
scalaVersion in ThisBuild := "2.13.0"

val macwire = "com.softwaremill.macwire" %% "macros" % "2.4.0" % "provided"
val scalaTest = "org.scalatest" %% "scalatest" % "3.2.9" % Test

lazy val `lagom-starter-minimal` = (project in file("."))
  .aggregate(`core-api`, `core-impl`)

lazy val `core-api` = (project in file("core-api"))
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslApi
    )
  )

lazy val `core-impl` = (project in file("core-impl"))
  .enablePlugins(LagomScala)
  .settings(
    libraryDependencies ++= Seq(
      lagomScaladslKafkaBroker,
      lagomScaladslTestKit,
      macwire,
      scalaTest
    )
  )
  .settings(lagomForkedTestSettings)
  .dependsOn(`core-api`)

// Cassandra disabled by default, review if needed
lagomCassandraEnabled in ThisBuild := false