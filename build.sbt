name := "hotel-management"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.6"

//libraryDependencies += "org.scalatest" %% "scalatest" % "2.2.4" % "test"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.0"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

/*
*  If our tests are properly designed, and can run independently, we can execute all of them in parallel by adding an SBT definition file
*  */
testForkedParallel in Test := true
