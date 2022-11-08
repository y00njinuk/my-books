package chapter29.traits

import chapter29.entity.{Database, Recipe}

object SimpleDatabase extends Database with SimpleFoods with SimpleRecipes