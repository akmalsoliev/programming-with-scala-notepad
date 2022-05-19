
object Main extends App {

//
//  val customerTotal = 1300
//
//  def applyDiscount(total: Int): Any = {
//    if (total.isValidInt && total < 200) {
//      "No discount is applied"
//    } else if (total > 500) {
//      (total * .8).toInt
//    } else {
//      (total * .6).toInt
//    }
//  }

  // Looping
  val word = "djgkldhsfagkljsdlk"
  def findLettersInWord(word:String): Unit = {
//    for (index <- 0.until(word.length.toInt)){
//      println(index)
//      Thread.sleep(1000)
//    }
    0.until(word.length.toInt).map{
      x =>
        println(s"The index number is: $x")
        Thread.sleep(1000)
    }
  }
  findLettersInWord(word)
}
