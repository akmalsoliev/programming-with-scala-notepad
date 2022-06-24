package calculator

// Used as a scratchpad: 
// def multiply(s: String, n: Int): Int = s.length * n
// def toDoulbe(n: Int): Double = n.toDouble

object Calculator {
    val multiple: (String, Int) => Int = {(a, b) => a.length * b}
    val toDoulbe = {(a: Int) => a.toDouble}
    val concat: (String, String) => String = {_ + _}
    val inverseConcat = {(x: String, y: String) => x + y}
    val myLongFunc: (String) => String = {
        a => {
            val length = a.length
            a.reverse * length
        }
    }
}