
object Main {
  def main(args: Array[String]): Unit = {
    class MissingValue(msg:String) extends Exception(msg)

    def checkFile(): Int = {
      try {
        throw new MissingValue("The value you're looking for is missing!")
        2
      }
      catch {
        case ex: MissingValue =>
          println(s"Never mind the exception $ex")
          5
      }
    }

    def toBoolean(input: String): Boolean = {
      // NOTE: Do not use Any in a real life scenario
      try {
        input.toBoolean
      }
      catch {
        case error: IllegalArgumentException =>
          println(s"This input cannot be converted into boolean. \n$error")
          false
      }
    }

    toBoolean("Hello")
  }
}