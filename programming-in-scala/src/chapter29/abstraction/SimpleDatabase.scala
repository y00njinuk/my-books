package chapter29.abstraction

import chapter29.entity.{Apple, Cream, Database, Food, FruitSalad, Orange, Recipe, Sugar}

object SimpleDatabase extends Database {
  override def allFoods: List[Food] = List(Apple, Orange, Cream, Sugar)

  override def allRecipes: List[Recipe] = List(FruitSalad)

  private var categories = List(
    FoodCategory("fruits", List(Apple, Orange)),
    FoodCategory("misc", List(Cream, Sugar))
  )

  override def allCategories: List[SimpleDatabase.FoodCategory] = categories
}
