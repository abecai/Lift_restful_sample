name := "starting_point"

scalaVersion := "2.9.1"

seq(webSettings :_*)

scalacOptions += "-deprecation"


libraryDependencies ++= Seq(
  "net.liftweb" %% "lift-webkit" % "2.4-M4" % "compile->default",
  "net.liftweb" %% "lift-mapper" % "2.4-M4" % "compile->default"
)

libraryDependencies ++= Seq(
  "junit" % "junit" % "4.8" % "test->default",
  "org.eclipse.jetty" % "jetty-webapp" % "8.0.2.v20111006" % "container",
  "javax.servlet" % "servlet-api" % "2.5" % "provided->default",
  "com.h2database" % "h2" % "1.2.138",
  "ch.qos.logback" % "logback-classic" % "0.9.26" % "compile->default"
)
