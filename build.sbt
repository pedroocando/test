name := """test"""
organization := "test"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.5"

libraryDependencies += guice
