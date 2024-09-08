package pratice1

fun main() {

    var str: String? = null
    println(str?.length) // Safe call
    println(str?.length ?: 0) // Elvis 연산자

    //println(startWithA4(null)) // NullPointerException

    var p = Person("myName")
    // println(startWithA(p.name)) // 자바의 Nullable 데이터는 불가

}

fun startWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException()
}

fun startWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun calculate(num: Long?): Long {
    // early return
    num ?: return 0
    return num
}

fun startWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}