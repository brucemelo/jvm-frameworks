import zio.*
import zio.http.*
import zio.json.*


object main extends ZIOAppDefault {
  private val student: Student = Student(name = "Zio")
  private val routes =
    Routes(
      Method.GET / Root -> handler(Response.json(student.toJson)),
    )

  def run = Server.serve(routes).provide(Server.default)
}