package app

/*
- Kadang ada kasus kita tidak peduli dengan generic parameter type pada object
- Misal kita hanya ingin mengambil panjang data Array<T>, dan kita tidak peduli dengan isi data T nya
- Jika kita mengalami kasus seperti ini, kita bisa menggunakan Star Projection
- Star projection bisa dibuat dengan mengganti generic parameter type dengan karakter * (star, bintang)
 */
fun displayLength(array: Array<*>) {
    println("Total array is ${array.size}")
}

fun main() {
    val arrayInt: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val arrayString: Array<String> = arrayOf("Syafiq", "Fajrian", "Emha")

    displayLength(arrayInt)
    displayLength(arrayString)
}