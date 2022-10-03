package chapter2

object max {
  def max_s1(a: Int, b: Int) { return }
  def max_s2(a: Int, b: Int) { if(a>b) a else b }
//  def max_s3(a: Int, b: Int): Int { if(a>b) a else b } // 잘못된 상단 구문 선언 (need '=')

  def max_e1(a: Int, b: Int): Int = { return if (a > b) a else b }
  def max_e2(a: Int, b: Int): Int = { if (a > b) a else b }

  def main(args: Array[String]): Unit = {
    max_s1(1,2) // Unit
    max_s2(1,2) // Int
    max_e1(1,2) // Int
    max_e2(1,2) // Int
  }
}

