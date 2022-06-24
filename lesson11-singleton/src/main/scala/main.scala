import Person.{Person}

object main extends App {

  object grade1 {
    val jack:Person = Person("Jack", "wrersfa")
    val jul:Person = Person("Jul", "truck")
  }

  println(s"The most talkative kid is: ${Person.mostTalkative(grade1.jul, grade1.jack).name}")
}