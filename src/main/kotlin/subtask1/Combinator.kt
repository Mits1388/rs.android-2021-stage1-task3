package subtask1

class Combinator {

    // TODO: Complete the following function
    fun checkChooseFromArray(array: Array<Int>): Int? {

        val posters = array[0]
        val colors = array[1]
        var result: Int? = null

        for (i in 1..colors){
            if(posters <= factorial(colors)/(factorial(colors-i)*factorial(i))){
                result = i
                    break
                }
        }
        return result
    }

    private fun factorial(number: Int): Double{
      var result = 1.0
      if (number != 0) {
          for (i in 1..number){
              result *= i
          }
      }
      return result
  }
}
