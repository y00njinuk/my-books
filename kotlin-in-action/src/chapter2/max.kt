package chapter2

// using statement
fun max_s1(a: Int, b: Int) { return }
//fun max_s2(a: Int, b: Int) { return if(a>b) a else b }       // Type mismatch: inferred type is Int but Unit was expected
fun max_s3(a: Int, b: Int): Int { return if(a>b) a else b }
//fun max_s4(a: Int, b: Int) { if(a>b) a else b }              // A 'return' expression required in a function with a block body ('{...}')
//fun max_s5(a: Int, b: Int): Int { if(a>b) a else b }         // A 'return' expression required in a function with a block body ('{...}')

// using expression
fun max_e1(a: Int, b: Int) = if(a>b) a else b
fun max_e2(a: Int, b: Int) = { -> if(a>b) a else b }
fun max_e3(a: Int, b: Int): ()->Unit = { if(a>b) a else b }
//fun max_e4(a: Int, b: Int): Int = { if(a>b) a else b }      // Inferred type is a function type, but a non-function type Int was expected.
                                                             // Use either '= ...' or '{ ... }', but not both.

fun main() {
    max_s1(1,2) // Unit
    max_s3(1,2) // Int
    max_e1(1,2) // Int
    max_e2(1,2) // ()->Unit
    max_e3(1,2) // ()->Unit
}