name := "MyFirstApp"

version := "1.0"

scalaVersion := "2.11.8"

// additional libraries
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.0.0" % "provided"
)

