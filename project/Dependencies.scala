import sbt._

object Dependencies {
  private val catsVersion = "2.6.1"
  private val catsEffectVersion = "3.2.2"
  private val scalatestVersion = "3.2.9"
  private val enumeratumVersion = "1.6.1"
  private val grpcJavaVersion = "1.39.0"
  private val scalapbRuntimeGrpcVersion = "0.11.5"

  val cats = "org.typelevel" %% "cats-core" % catsVersion
  val catsEffect = "org.typelevel" %% "cats-effect" % catsEffectVersion

  val enumeratum = "com.beachape" %% "enumeratum" % enumeratumVersion

  val scalatest = "org.scalatest" %% "scalatest" % scalatestVersion

  val grpcJava = "io.grpc" % "grpc-netty" % grpcJavaVersion
  val scalapbRuntimeGrpc = "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapbRuntimeGrpcVersion
}