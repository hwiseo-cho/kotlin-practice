package practice2

import java.io.BufferedReader
import java.io.FileReader
import java.lang.NumberFormatException

fun main() {
    paresIntThrow("asd")
    paresIntThrow2("asd")
}

fun paresIntThrow(str: String): Int {
    try {
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("${str} is not number")
    }
}

fun paresIntThrow2(str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

fun readFile(path: String) {
    // java의 try with resources -> use 사용
    BufferedReader(FileReader(path)).use { reader ->
        println(reader)
    }
}

/**
 * kotlin은 모두 unchecked exception
 */









