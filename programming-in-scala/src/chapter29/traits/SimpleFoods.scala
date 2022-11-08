package chapter29.traits

import chapter29.entity.{Apple, Food}

trait SimpleFoods {
  object Pear extends Food("Pear")

  def allFoods = List(Apple, Pear)
  def allCategories = Nil
}
