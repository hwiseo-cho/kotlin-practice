package practice4

fun main() {
    val d1 = PersonDto("asdf", 100)
    val d2 = PersonDto("asdf", 200)
    println(d1.name.equals(d2.name))
}

//fun hadleC(country: Country) {
//    when(country) {
//        Country.KOREA -> println()
//    }
//}

// Data class (DTO)
data class PersonDto(
    val name: String,
    val age: Int
)

// Enum class
enum class Country(
    private val code: String
) {
    KOREA("KO"),
    USA("US")
}