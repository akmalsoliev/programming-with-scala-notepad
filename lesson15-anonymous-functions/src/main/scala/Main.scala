import calculator.*

object Main {
    def main(args: Array[String]) = {
        val calc = Calculator
        println(calc.concat("Hello", " World!"))
        println("Example of inverse concat: " + calc.inverseConcat("Hello ", "World!"))
        println("Multiple: " + calc.multiple("Hello ", 2))
        println("My Long Func: " + calc.myLongFunc("Hello"))
    }
}