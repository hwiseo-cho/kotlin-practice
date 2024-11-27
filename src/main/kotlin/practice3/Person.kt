package practice3

fun main() {
    val p = Person("asd", 12)
    println(p.name) // getter
    p.age = 1 // setter
    println(p.age)
    println(p.isAdult)
    Person()
}

class Person(
    // 주 생성자
    name: String,
    var age: Int = 3
) {
    var name = name
        set(value) {
            field = value
        }

    init {
        if (age <= 0) {
            throw IllegalArgumentException()
        }
    }

    constructor(name: String): this(name, 5) {
        // body부도 생성 가능
    }
    constructor(): this("asdf")

    fun isAdult(): Boolean {
        return this.age >= 20
    }

    val isAdult: Boolean
        get() = this.age >= 20


}