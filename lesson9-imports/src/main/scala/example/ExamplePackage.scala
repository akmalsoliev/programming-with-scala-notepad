package example

import scala.io.Source

class ExamplePackage {
  def readFileIntoString(filename: String): String =
    Source.fromFile(filename).getLines().mkString("\n")
}
