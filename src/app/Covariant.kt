package app

/*
Covariant artinya kita bisa melakukan subtitusi subtype (child) dengan supertype (parent)
Tidak semua jenis class generic yang mendukung covariant,
hanya class generic yang menggunakan generic parameter type sebagai return type function
Artinya saat kita membuat object Contoh<String>, maka bisa disubtitusi menjadi Contoh<Any>
Untuk memberitahu bahwa generic parameter type tersebut adalah covariant,
kita perlu menggunakan kata kunci out
 */
class Covariant<out T>(val data: T) {
    // error -> tidak boleh membuat function dengan input generic covariant
    /*fun setData(param: T) {
        data = param
    }*/

    // jadi hanya bisa untuk return value atau keluar
    fun data(): T {
        return data
    }
}

fun main() {
    val covariantString: Covariant<String> = Covariant("Syafiq")
    val covariantAny: Covariant<Any> = covariantString

    println(covariantAny.data())

    // covariantAny.setData(100) tidak boleh
}