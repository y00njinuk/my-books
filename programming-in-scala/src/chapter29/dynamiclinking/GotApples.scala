package chapter29.dynamiclinking

import chapter29.abstraction.{Browser, StudentDatabase}
import chapter29.entity.Database
import chapter29.traits.SimpleDatabase

object GotApples {
  def main(args: Array[String]): Unit = {
    val db: Database =
      if(args(0) == "student")
        StudentDatabase
      else
        SimpleDatabase

    object browser extends Browser {
      val database = db
    }

    val apple = SimpleDatabase.foodNamed("Apple").get

    for(recipe <- browser.recipesUsing(apple))
      println(recipe)
  }
}
