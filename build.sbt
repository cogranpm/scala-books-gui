name := "scala-books-gui"

version := "0.1"

scalaVersion := "2.13.1"

//scalacOptions += "-Ylog-classpath"

packageOptions += Package.ManifestAttributes(
  "Class-Path" -> "${CLASSPATH}:lib/*"
)

/*
val swt = sys.props("os.name").toLowerCase match {
  case os if os.contains("uni") =>
    "natives-linux"
  case os if os.contains("mac") | os.contains("darwin") =>
    "natives-macos"
  case os if os.contains("win") =>
    "natives-windows"
}

 */

lazy val hello = (project in file("."))
  .settings(
    name := "scala-books-gui",
    resolvers ++= Seq(
    "Typesafe" at "http://repo.typesafe.com/typesafe/releases/",
    "Java.net Maven2 Repository" at "http://download.java.net/maven/2/"
    ),
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.0.8" % "test",
      "org.postgresql" % "postgresql" % "42.1.1",
      "com.typesafe.slick" %% "slick" % "3.3.2",
      "org.slf4j" % "slf4j-nop" % "1.7.26",
      "commons-dbutils" % "commons-dbutils" % "1.7",
      "org.scalikejdbc" %% "scalikejdbc"       % "3.3.5",
      "ch.qos.logback"  %  "logback-classic" % "1.2.3",
      "org.playframework.anorm" %% "anorm" % "2.6.4"
      /*
      "org.eclipse.platform" % "org.eclipse.swt.gtk.linux.x86_64" % "3.114.100",
      "org.eclipse.platform" % "org.eclipse.text" % "3.10.200",
      "com.ibm.icu" % "icu4j" % "67.1",
      "org.eclipse.platform" % "org.eclipse.jface.text" % "3.16.300",
      "org.eclipse.platform" % "org.eclipse.core.databinding" % "1.9.0",
      "org.eclipse.platform" % "org.eclipse.core.databinding.observable" % "1.9.0",
      "org.eclipse.platform" % "org.eclipse.core.databinding.beans" % "1.6.100",
      "org.eclipse.platform" % "org.eclipse.osgi" % "3.15.300",
      "org.eclipse.platform" % "org.eclipse.core.jobs" % "3.10.800",
      "org.eclipse.platform" % "org.eclipse.core.databinding.property" % "1.8.0",
      "org.eclipse.platform" % "org.eclipse.jface.databinding" % "1.11.100",
      "org.eclipse.platform" % "org.eclipse.jface" % "3.20.0",
      "org.eclipse.platform" % "org.eclipse.jface.notifications" % "0.1.0",
      "org.eclipse.platform" % "org.eclipse.swt" % "3.114.100",
      "org.eclipse.platform" % "org.eclipse.core.commands" % "3.9.700",
      "org.eclipse.platform" % "org.eclipse.equinox.common" % "3.12.0"
      */
    )

  )

