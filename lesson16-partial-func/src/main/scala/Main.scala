
object Main {
  def main(args: Array[String]) = {
    val x: Int = 22
    
    val divisibleByTwo: PartialFunction[Int, String] = {
      case x if x % 2 == 0 => "Divisible"
    }
    
    val notMetCase: PartialFunction[Int, String] = {
      case _ => "Not divisible by two"
    }

    val printResults: PartialFunction[String, Unit] = {
      case a => println(a)
    }

    // def twoDivide(n: Int): String = divisibleByTwo.orElse(notMetCase)(n)
    // def showResults(r: Int) = twoDivide.andThen(printResults)(r)
    
    // showResults(x)
    
    // Throwing an exception:
    class notDivisible(msg: String) extends Exception(msg)
    // TODO: EXPECTION HANDLING
  }
}