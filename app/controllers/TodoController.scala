package controllers

import jakarta.inject.{Inject, Singleton}
import models.Todo
import play.api.libs.json._
import play.api.mvc.{AbstractController, ControllerComponents}


@Singleton
class TodoController @Inject()(controllerComponents: ControllerComponents) extends AbstractController(controllerComponents) {

  implicit val todoJson = Json.format[Todo]

  def getAll() = Action {
    val todo = Todo(1, "Task 1 ", false)
    Ok(Json.toJson(todo))
  }


}

