package app

/*
Generic juga bisa digunakan pada extension function
Dengan begitu kita bisa memilih jenis generic parameter type apa yang bisa menggunakan extension function tersebut
 */
class Data<T>(val data: T)

// membuat extension
fun Data<String>.cetak() {
    val string = this.data
    println("String value is $string")
}

fun Data<Int>.cetakInteger() {
    val data = this.data
    println("Integer value is $data")
}

fun main() {
    val data1: Data<Int> = Data(1)
    val data2: Data<String> = Data("Syafiq")

    // data1.cetak() // error karena integer
    data2.cetak()
    data1.cetakInteger()
}