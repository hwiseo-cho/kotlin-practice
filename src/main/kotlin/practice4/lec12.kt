package practice4

fun main() {
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    // 익명 함수
    moveSomething(object : Movable {
        override fun move() {
            println("move")
        }

        override fun fly() {
            println("fly")
        }
    })
}

class Person private constructor(
    var name: String,
    var age: Int
) {
    // static 대신 companion object
    // @JvmStatic java에서 접근 가능
    companion object Factory : Log{
        private val MIN_AGE = 1
        // const 컴파일 시 변수가 할당
        const val MAX_AGE = 1
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 클래스의 동행객체 Factory에요")
        }
    }
}

object Singleton {
    var a: Int = 0
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}











