name := "scala-books-gui"

version := "0.1"

scalaVersion := "2.13.0"

//scalacOptions += "-Ylog-classpath"

packageOptions += Package.ManifestAttributes(
  "Class-Path" -> "${CLASSPATH}:lib/*"
)

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
    )

  )

