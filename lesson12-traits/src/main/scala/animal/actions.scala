package animal

trait AnimalName {
  def name: String
}

trait Animal(nameInput:String) extends  AnimalName{
  override def name:String = nameInput
  val meal:String // what is animal eating
  val location:String // where is the animal going
  def sleeping:Int // hours
  def eating():Float // kilos
  def walking():String // location
  def describe():String = {
    s"$name sleeps for $sleeping hours, eats $meal, " +
    s"and walks to $location"
  }
}

trait Action {
  def voice:String
}

class Dog(name:String, animalVoice:String) extends Animal(name) with Action {
  override def voice:String = animalVoice
  override val sleeping: Int = 12
  override val meal:String = "Stake"
  override val location:String = "Park"
  def eating() = 15
  def walking() = s"$name is walking to the $location"
}