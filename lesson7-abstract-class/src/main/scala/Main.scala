
object Main extends App{
  abstract class Mammal(name:String, speciesAge:Int){
    def information():Unit
    }

  class Animal(name:String, speciesAge:Int) extends Mammal(name, speciesAge){
    override def information():Unit = {
      println(s"I am a $name and I'm $speciesAge centuries old.")
    }
  }

  val monkey = new Animal("Monkey", 2300)
  monkey.information()
}