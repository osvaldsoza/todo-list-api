package models

import play.api.data.Form
import play.api.data.Forms.{boolean, mapping, nonEmptyText}

object TodoForm {
  val form = Form(
    mapping(
      "name" -> nonEmptyText,
      "isComplete" -> boolean
    )(TodoFormData.apply)(TodoFormData.unapply)
  )
}
