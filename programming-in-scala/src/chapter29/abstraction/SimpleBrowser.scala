package chapter29.abstraction

import chapter29.entity.Database

object SimpleBrowser extends Browser {
  override val database: Database = SimpleDatabase
}
