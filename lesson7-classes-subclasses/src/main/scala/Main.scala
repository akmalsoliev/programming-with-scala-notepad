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

  }

}