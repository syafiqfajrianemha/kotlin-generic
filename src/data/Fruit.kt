package data

/*
Sebelumnya kita sudah tahu bahwa operator perbandingan == dan != akan menggunakan metode equals sebagai implementasinya.
Bagaimana dengan operator perbandingan lainnya? Seperti > >= < <= ?
Operator perbandingan tersebut bisa kita lakukan, jika object kita mewariskan interface generic Comparable
 */
class Fruit(val name: String, val quantity: Int): Comparable<Fruit> {
    override fun compareTo(other: Fruit): Int {
        return quantity.compareTo(other.quantity)
    }
}