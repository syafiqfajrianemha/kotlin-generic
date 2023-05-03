package app

import data.MyData

fun main() {
    val myDataString: MyData<String, Int> = MyData<String, Int>("Syafiq", 19)
    myDataString.printData()

    val myDataInt = MyData(19, "Emha")
    myDataInt.printData()
}