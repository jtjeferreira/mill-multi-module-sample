// build.sc
import mill._, scalalib._

object root extends ScalaModule {
  def scalaVersion = "2.12.10"
  override def moduleDeps = Seq(core, util) ++ x
}

object core extends ScalaModule {
  def scalaVersion = "2.12.10"
  override def ivyDeps = Agg(
    ivy"org.apache.spark::spark-core:2.4.4"
  )
}

object util extends ScalaModule {
  def scalaVersion = "2.12.10"
  override def ivyDeps = Agg(
    ivy"org.apache.spark::spark-core:2.4.4"
  )
}

object x1 extends MyScalaModule
object x2 extends MyScalaModule
object x3 extends MyScalaModule
object x4 extends MyScalaModule
object x5 extends MyScalaModule
object x6 extends MyScalaModule
object x7 extends MyScalaModule
object x8 extends MyScalaModule
object x9 extends MyScalaModule
object x10 extends MyScalaModule
object x11 extends MyScalaModule
object x12 extends MyScalaModule
object x13 extends MyScalaModule
object x14 extends MyScalaModule
object x15 extends MyScalaModule
object x16 extends MyScalaModule
object x17 extends MyScalaModule
object x18 extends MyScalaModule
object x19 extends MyScalaModule
object x20 extends MyScalaModule

lazy val x = Seq(x1,x2,x3,x4,x5,x6,x7,x8,x9,x10,x11,x12,x13,x14,x15,x16,x17,x18,x19,x20)

trait MyScalaModule extends ScalaModule {
  def scalaVersion = "2.12.10"
  override def moduleDeps = Seq(core, util)
}
//  Project(s"x$i", file(s"modules/module$i"))
//    .settings(
//      name := s"x$i",
//    )
//    .settings(csrConfigurationSettings())
//    .dependsOn(core, util)
