fun main(args: Array<String>) {

    fun calculator(a: Int, b: Int, sign: Char): Int {
        return when (sign) {
            '+' -> {
                a + b
            }

            '-' -> {
                a - b
            }

            '*' -> {
                a * b
            }

            '/' -> {
                a / b
            }

            else -> throw IllegalArgumentException("Error !!")
        }
    }

    val a = 24
    val b = 15
    val sign = '-'
    val count = calculator(a, b, sign)
    println(count)

}