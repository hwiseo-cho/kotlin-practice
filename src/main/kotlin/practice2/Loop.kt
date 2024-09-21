package practice2

fun main() {
    val numbers = listOf(1, 2, 3)

    for (n in numbers) {
        println(n)
    }

    for (i in 0..2) {
        println(numbers[i])
    }

    for (i in 2 downTo 0) {
        println(numbers[i])
    }

    for (i in 1..5 step 2) {
        println(i)
    }
}