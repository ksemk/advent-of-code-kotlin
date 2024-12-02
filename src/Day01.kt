import java.io.File
import kotlin.math.abs

fun main() {
    val firstNum = mutableListOf<Int>()
    val secondNum = mutableListOf<Int>()

    File("src/Day01.txt").forEachLine { line ->
        val numbers = line.split("   ").map { it.toInt() }
        firstNum.add(numbers[0])
        secondNum.add(numbers[1])
    }

    firstNum.sort()
    secondNum.sort()

    var result = 0
    for (i in firstNum.indices) {
        result += abs(firstNum[i] - secondNum[i])
    }

    println(result)
}