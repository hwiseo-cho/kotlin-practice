package practice2

fun main() {
    repeat("asdf")
    repeat("asdf", newLine = false)

    prinAll("a", "b", "c")
    val arr = arrayOf("a", "b")
    // * 붙여야함
    prinAll(*arr)
}

fun max(a: Int, b: Int) = if (a > b) a else b

/**
 * default parameter 깂 설정
 * java의 오버로딩 느낌 가능
 */
fun repeat(
    str: String,
    num: Int = 3,
    newLine: Boolean = true
) {
    for (i in 0..num) {
        if (newLine) {
            println(str)
        } else {
            print(str)
        }
    }
}

// 가변인자
fun prinAll(vararg strs : String) {
    for (s in strs) {
        println(s)
    }
}