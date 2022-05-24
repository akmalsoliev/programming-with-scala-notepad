import example.{ExamplePackage, HelloThere}


object Main extends App {
//  val exampleClassImport = new ExamplePackage
//  val output = exampleClassImport.readFileIntoString("test.csv")
  val hello = new HelloThere
  hello.helloThere()
  class NameHello extends HelloThere {
    changeTheName("John")
    helloThere()
  }
  new NameHello
}
