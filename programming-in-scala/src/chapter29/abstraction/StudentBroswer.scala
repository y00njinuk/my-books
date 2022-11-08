package chapter29.abstraction

import chapter29.entity.Database

object StudentBroswer extends Browser {
  override val database: Database = StudentDatabase
}
