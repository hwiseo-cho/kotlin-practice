package practice2

fun main() {
    validate(1)
    println(validate2(70))
    println(validate3(40))
    println(validate4(55))
}

fun validate(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("error result = ${score}")
    }
}

// Expression
fun validate2(score: Int): String {
    return if (score >= 50) {
        "P"
    } else {
        "F"
    }
}

fun validate3(score: Int): String {
    return if (score in 50..100) {
        "P"
    } else {
        "F"
    }
}

fun validate4(score: Int): String {
    return when (score) {
        in 90..100 -> "A"
        in 70..89 -> "B"
        in 50..69 -> "C"
        else -> "D"
    }
}

fun startWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

fun isNum(num: Int): Boolean {
    return when (num) {
        1, 8 -> true
        else -> false
    }
}