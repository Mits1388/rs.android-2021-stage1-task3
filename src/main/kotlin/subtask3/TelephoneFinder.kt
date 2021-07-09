package subtask3


class TelephoneFinder {

    // TODO: Complete the following function
    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {

        if (number.toInt() < 0) return null

        val result = arrayListOf<String>()

        number.forEachIndexed { index, c ->
            neighborsNumbers(c).forEach {
                result.add(number.substring(0,index)+it+number.substring(index+1))
            }

        }
        return result.toTypedArray()

    }

    fun neighborsNumbers(number: Char) = when (number) {
            '0' -> arrayOf('8')
            '1' -> arrayOf('2', '4')
            '2' -> arrayOf('1', '3', '5')
            '3' -> arrayOf('2', '6')
            '4' -> arrayOf('1', '5', '7')
            '5' -> arrayOf('2', '4', '6', '8')
            '6' -> arrayOf('3', '5', '9')
            '7' -> arrayOf('4', '8')
            '8' -> arrayOf('5', '7', '9', '0')
            '9' -> arrayOf('6', '8')
            else -> arrayOf()
        }


}