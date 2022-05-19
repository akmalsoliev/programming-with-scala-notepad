import com.sun.beans.editors.ShortEditor

object Main extends App{
//  class Person(name:String, age:Int){
//    def presentYourself = {
//      println(s"Helly my name is $name and I am $age years old")
//    }
//  }
//
//  val jack = new Person("Jack", 2)
//  jack.presentYourself

  val randomFactoryNumber = scala.util.Random.between(0, 100)
  class Factory(val factoryName:String=s"Factory Number $randomFactoryNumber"){
    val product = "Water"
    def makeProduct():Unit = println(s"Making $product")
  }

  class ShoeFactory(override val factoryName:String=s"Factory Number $randomFactoryNumber") extends Factory(factoryName){
    override val product: String = "Shoes"
  }

  val Nike = new ShoeFactory("Nike1")
  println(Nike.factoryName)
  println(Nike.product)
  Nike.makeProduct()

}