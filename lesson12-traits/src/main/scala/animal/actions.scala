package animal

trait Animal(name:String) {
  val meal:String
  val location:String
  def sleeping:Int // hours
  def eating():Float // kilos
  def walking():String // location
  def describe():String = {
    s"$name sleeps for $sleeping hours, eats $meal, " +
    s"and walks to $location"
  }
}

class Dog(name:String) extends Animal(name) {
  override val sleeping: Int = 12
  override val meal:String = "Stake"
  override val location:String = "Park"
  def eating() = 15
  def walking() = s"The dog is walking to the $location"
}