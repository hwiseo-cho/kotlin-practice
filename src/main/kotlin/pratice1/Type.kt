package pratice1

fun main() {
    val num1 = 3
    val num2: Long = num1.toLong()
    println(num2.toDouble())

    val num3: Int? = 3
    val num4: Long = num3?.toLong() ?: 0
    println(num4)

    printName(Person("asdad"))
    printName2(null)

    // String interpolation / String indexing
    val person = Person("휘서")
    println("안녕 나는 ${person.name}야")

    val ss = """
       ㅁㄴㄹㅇㄹㄴㅇㅁ
       ㄹㄴㅇㄴㅁㄹㅇ
       ${person.name}
       ㄴㅁㅇㄹ
    """.trimIndent()
    println(ss)
    println(ss[0])
}

fun printName(obj: Any) {
    // is, !is
    if (obj is Person) {
        // 1
        val person = obj as Person
        println(person.name)
        // 2 타입 체크가 있다면 코틀린에서 자동으로 캐스팅해줌
        println(obj.name)
    }
}

fun printName2(obj: Any?) {
    // as 뒤에 ? 붙힘
    val person = obj as? Person
    println(person?.name)
}
/**
 * 1. Any 자바의 Object 같은 느낌
 * 2. Unit void 타입
 * 3. Nothing 무조건 예외라는 뜻
 */