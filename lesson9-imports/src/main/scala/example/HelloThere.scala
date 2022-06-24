package example

class HelloThere {
  private var name: String = "Jack"
  def helloThere(): Unit = println(s"Hey There $name!")
  protected def changeTheName(newName: String): Unit = {
    name = newName
  }
}