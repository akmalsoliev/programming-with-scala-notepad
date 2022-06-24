import animal.{Animal, Dog, Action}

object main extends App {
  val sparky = Dog("Sparky", "woof woof")
  println(sparky.describe())
  println(sparky.walking())
  def bark(noise: Action): Unit = {
    println(s"${noise.voice}")
  }
  bark(sparky)
}