import scala.reflect.runtime.universe._

abstract class Parent
object Parent {
  def apply[T](input: T): Parent = Child(input)
  def applyTag[T: TypeTag](input: T): Parent = Child.applyTag(input)
}

case class Child(str: String) extends Parent {
  override def toString: String = str
}

case class Case1(opt: String)
case class Case2(opt: String)

object Child {
  def apply[T](input: T): Child = {
    input match {
      case t: String => Child("String:" + t)
      case t: Int => Child("Int:" + t.toString)
      case t: Seq[String] => Child("Seq[String]:" + t.toString)
      case t: Seq[Int] => Child("Seq[Int]:" + t.toString)
      case t: Case1 => Child("Case1(Case1):" + t.opt)
      case t: Case2 => Child("Case2(Case1):" + t.opt)
      case _ => Child("Nothing")
    }
  }

  def applyTag[T: TypeTag](input: T): Child = {
    typeOf[T] match {
      case t if t =:= typeOf[String] => Child("String:" + input.asInstanceOf[String])
      case t if t =:= typeOf[Int] => Child("Int:" + input.asInstanceOf[Int])
      case t if t =:= typeOf[Seq[String]] => Child("Seq[String]:" + input.asInstanceOf[Seq[String]])
      case t if t =:= typeOf[Seq[Int]] => Child("Seq[Int]:" + input.asInstanceOf[Seq[Int]])
      case t if t =:= typeOf[Case1] => Child("Case1(Case1):" + input.asInstanceOf[Case1].opt)
      case t if t =:= typeOf[Case2] => Child("Case2(Case1):" + input.asInstanceOf[Case2].opt)
      case _ => Child("Nothing")
    }
  }
}

object TypeParamTest {
  def main(args: Array[String]): Unit = {
    val a1 = Parent("1")
    val b1 = Parent(1)
    val c1 = Parent(Seq("1"))
    val d1 = Parent(Seq(1))
    val e1 = Parent(Case1("1"))
    val f1 = Parent(Case2("1"))

    println(a1.toString)   // String:1
    println(b1.toString)   // Int:1
    println(c1.toString)   // Seq[String]:List(1)
    println(d1.toString)   // Seq[String]:List(1) => Why?
    println(e1.toString)   // Case1(Case1):1
    println(f1.toString)   // Case2(Case1):1

    println("========================================")

    val a2 = Parent.applyTag("1")
    val b2 = Parent.applyTag(1)
    val c2 = Parent.applyTag(Seq("1"))
    val d2 = Parent.applyTag(Seq(1))
    val e2 = Parent.applyTag(Case1("1"))
    val f2 = Parent.applyTag(Case2("1"))

    println(a2.toString)   // String:1
    println(b2.toString)   // Int:1
    println(c2.toString)   // Seq[String]:List(1)
    println(d2.toString)   // Seq[Int]:List(1)
    println(e2.toString)   // Case1(Case1):1
    println(f2.toString)   // Case2(Case1):1
  }
}
