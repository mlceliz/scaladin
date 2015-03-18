import sbt._

object Dependencies {
  val vaadinVersion = "6.8.15"
  val jettyVersion = "7.3.0.v20110203"
  val scalaTestVersion = "2.2.4"
  val junitVersion = "4.9"
  val mockitoVersion = "1.9.5"

  private def scalaReflect(scalaVersion: String) = "org.scala-lang" % "scala-reflect" % scalaVersion
  //val scala = "org.scala-lang" % "scala-library" % BuildSettings.buildScalaVersion
  val vaadin = "com.vaadin" % "vaadin" % vaadinVersion
  val jetty = "org.eclipse.jetty" % "jetty-webapp" % jettyVersion 
  val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion 
  val junitInterface = "com.novocode" % "junit-interface" % "0.7" 
  val mockito = "org.mockito" % "mockito-all" % mockitoVersion
  val scalaXml = "org.scala-lang" % "scala-xml" % "2.11.0-M4"

  def addonDeps(scalaVersion: String) = Seq(
    scalaReflect(scalaVersion),
    scalaXml,
    vaadin,
    scalaTest % "test",
    junitInterface % "test->default",
    mockito % "test"
  )

  val demoDeps = Seq(
    jetty % "container"
  )
}
