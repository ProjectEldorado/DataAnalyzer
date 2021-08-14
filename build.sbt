import Dependencies._

lazy val root = project
  .in(file("."))
  .settings(commonSettings: _*)
  .settings(
    name := "DataAnalyzer",
    libraryDependencies ++= Seq(
      cats,
      catsEffect,
      enumeratum,
      scalatest,
      grpcJava,
      scalapbRuntimeGrpc
    )
  )
  .enablePlugins(Fs2Grpc)

lazy val commonSettings = Seq(
  organization := "com.project.eldorado",
  scalaVersion := "2.13.6"
)

Compile / PB.targets := Seq(
  scalapb.gen() -> (Compile / sourceManaged).value / "scalapb"
)