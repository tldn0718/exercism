import kotlin.math.pow

object ArmstrongNumber {
    fun toDigitsHelper(input: Int, digits: MutableList<Int>): MutableList<Int> {
        if (input == 0)
            return digits
        digits.add(input % 10)
        return toDigitsHelper(input / 10, digits)
    }

    fun toDigits(input: Int): MutableList<Int> {
        val digits = mutableListOf<Int>()
        if (input == 0) {
            digits.add(0)
            return digits
        }

        return toDigitsHelper(input, digits)
    }

    fun check(input: Int): Boolean {
        val digits = toDigits(input)
        val numOfDigits = digits.size
        return input == digits.sumOf { it.toDouble().pow(numOfDigits).toInt() }
    }
}
