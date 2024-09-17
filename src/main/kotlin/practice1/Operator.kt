package practice1

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = JavaMoney(1_000L)

    // 자동으로 compareTo 호출
    if (money1 > money2) {
        println("크다")
    }

    val money3 = JavaMoney(1_000L)
    val money4 = money3
    val money5 = JavaMoney(1_000L)

    println(money3 == money4)
    println(money3 == money5)

    println(money3 === money4)
    println(money3 === money5)

}