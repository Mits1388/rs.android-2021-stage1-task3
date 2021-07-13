package subtask2

import kotlin.math.sqrt

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {

    val square = Math.pow(number.toDouble(), 2.0)
        val list = decompose(square, number -1 )
        return list?.toTypedArray()
    }

         private fun decompose(square: Double, position: Int): ArrayList<Int>?{


             for(i in position downTo 1){

                 val squareI = Math.pow(i.toDouble(), 2.0)
                     if(square - squareI == 0.0){
                     return arrayListOf(i)
                 }
                 if (square - squareI < 0) {
                     return null
                 }

                 var positionNew = sqrt(square - squareI).toInt()
                 if (positionNew >= i) {
                     positionNew = i - 1
                 }

                 val result = decompose(square - squareI, positionNew)
                 if (result != null) {
                     result.add(i)
                     return result
                 }

             }
             return null
    }
}
