abstract class Parent
object Parent {
  def apply[T](input: T): Parent = Child(input)
}

case class Child(str: String) extends Parent {
  override def toString: String = str
}

object Child {
  def apply[T](input: T): Child = {
    input match {
      case s: String => Child("String:" + s)
      case i: Int => Child("Int:" + i.toString)
      case _ => Child("Nothing")
    }
  }
}

object TypeParamTest {
  def main(args: Array[String]): Unit = {
    val a = Parent("1")
    val b = Parent(1)

    println(a.toString) // String: 1
    println(b.toString) // Int: 1
  }
}
