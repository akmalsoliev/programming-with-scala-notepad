package Person

class Person(val name: String, val firstWord: String)

object Person {
  def mostTalkative(student1: Person, student2: Person) = {
    val word1 = student1.firstWord.length
    val word2 = student2.firstWord.length
    if (word1>word2) student1 else student2
  }
}

