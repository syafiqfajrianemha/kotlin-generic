package app

/*
Type erasure adalah proses pengecekan generic pada saat compile time, dan menghiraukan pengecekan pada saat runtime
Type erasure menjadikan informasi generic yang kita buat akan hilang ketika kode program kita telah di compile menjadi binary file
Compiler akan mengubah generic parameter type menjadi tipe Any (atau Object di Java)
 */
class TypeErasure<T>(param: T) {
    private val data: T = param
    fun getData(): T = data
}

fun main() {
    val data1 = TypeErasure<String>("Syafiq")
    val dataString: String = data1.getData()
    println(dataString)

    val data2: TypeErasure<Int> = data1 as TypeErasure<Int>
    /*
    Problem Type Erasure
    - Karena informasi generic hilang ketika sudah menjadi binary file
    - Oleh karena itu, konversi tipe data generic akan berbahaya jika dilakukan secara tidak bijak
     */
    val dataInt = data2.getData() // error konversi
    println(dataInt)
}