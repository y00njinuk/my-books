package chapter1

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
    val persons = listOf(Person("영희"), Person("철수", age=29))
    val oldest = persons.maxByOrNull { it.age ?: 0 }
    println("나이가 가장 많은 사람 : $oldest")
}

/*
    @Deprecated("Use maxByOrNull instead.", ReplaceWith("this.maxByOrNull(selector)"))
    @DeprecatedSinceKotlin(warningSince = "1.4", errorSince = "1.5", hiddenSince = "1.6")
    public inline fun <T, R : Comparable<R>> Iterable<T>.maxBy(selector: (T) -> R): T? {
        return maxByOrNull(selector)
    }
*/