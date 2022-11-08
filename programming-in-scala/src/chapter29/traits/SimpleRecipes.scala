package chapter29.traits

import chapter29.entity.{Apple, Recipe}

trait SimpleRecipes {
  /**
   * 셀프 타입은 클래스 안에서 사용하는 모든 this의 타입이 어떤 것인지를 가정하는 것이다.
   * 실용적인 측면에서 볼 때, 셀프 타입은 트레이트가 섞여 들어갈 구체적 클래스를 제한한다.
   * 만약 어떤 트레이트가 또 다른 트레이트나 트레이트들과 함께 섞어야만 한다면,
   * 이렇게 함께 사용해야 하는 다른 트레이트를 가정했음을 기술해야 한다.
   *
   * 아래 코드에서는 Pear라는 참조는 암시적으로 this.Pear로 간주된다.
   * 왜냐하면, SimpleRecipes를 믹스인한 구체적인 클래스라면 또한 SimpleFoods의 서브타입이어야 하기 때문이다.
   * 이는 곧 Pears가 멤버라는 이야기이다.
  */
  this: SimpleFoods => // A) Using "self type"
  object FruitSalad extends Recipe("fruit salad",

    // Q) How to find "Pear" in trait "SimpleFoods"?
    List(Apple, Pear),
    "Mix it all together.")

  def allRecipes = List(FruitSalad)
}
