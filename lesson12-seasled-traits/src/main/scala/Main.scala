
object Main {
  sealed trait HighSchool {
    val minAge = 16
    val maxAge = 20
  }

  object Jack extends HighSchool {
    val age: Int = 19
  }
  object Jul extends HighSchool

  enum HigSchool {
    case Jack, Jul, Hope
  }

  def main(args: Array[String]): Unit = {
    val yearsInHighSchool: Object = Jack.age - Jack.minAge + " Years"
    println(s"Jack has been in high school for $yearsInHighSchool")
    println(s"${HigSchool.Jack}")
  }

}