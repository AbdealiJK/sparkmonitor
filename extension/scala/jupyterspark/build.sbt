name := "jupyterspark"

version := "1.0"

scalaVersion := "2.11.8"

organization := "sparkmonitor"

val sparkVersion = "2.1.1"

libraryDependencies ++= List(
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "net.sf.py4j" % "py4j" % "0.10.4"
)
