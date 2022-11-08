package chapter29.normal

import chapter29.entity.{Apple, Cream, Food, FruitSalad, Orange, Recipe, Sugar}

object SimpleDatabase {
  def allFoods = List(Apple, Orange, Cream, Sugar)

  def foodNamed(name: String): Option[Food] =
    allFoods.find(_.name == name)

  def allRecipes: List[Recipe] = List(FruitSalad)

  case class FoodCateGory(name: String, foods: List[Food])

  private var categories = List(
    FoodCateGory("fruits", List(Apple, Orange)),
    FoodCateGory("misc", List(Cream, Sugar)))

  def allCategoreis = categories
}