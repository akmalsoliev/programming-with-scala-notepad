object Main extends App {
  def evenOrOdd(n:Int):String = {
    if (n%2 == 0) {
      "even"
    }else if (n%2 == 1) {
      "odd"
    } else {
      "invalid number"
    }
  }
  
  println(evenOrOdd(14))
  println("test line")

}
