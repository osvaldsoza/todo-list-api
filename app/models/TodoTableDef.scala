package models

import slick.lifted.Tag
import slick.model.Table

import scala.reflect.internal.util.NoPosition.column


class TodoTableDef (tag:Tag) extends Table[Todo](tag, "todo"){
  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)

  def name = column[String]("name")

  def isComplete = column[Boolean]("isComplete")

  override def * = (id, name, isComplete) <> (Todo.tupled, Todo.unapply)
}
