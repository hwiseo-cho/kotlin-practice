package practice4
/*
* public:    모든 곳에서 접근 가능
* protected: 선언된 클래스 or 하위 클래스
*            파일(최상단)에는 사용불가
* internal:  같은 모듈에서 접근 가능
* private:   선언된 클래스 내
*
* Internal은 바이트 코드 상 public -> java에서 kotlin 가져올 수 있음
* */

fun main() {
    // StringUtilsKt.idDirectoryPath("/")
}

val a = 3

fun add(a: Int, b: Int): Int {
    return a+b
}

// 클래스에 접근 제어 할라면 constructor 붙여야함
class Cat private constructor(

)

class Car(
    internal val name: String,
    private val owner: String,
    _price: Int
) {
    var price = _price
}