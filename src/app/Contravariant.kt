package app

/*
Contravariant artinya kita bisa melakukan subtitusi supertype (parent) dengan subtype (child)
Tidak semua jenis class generic yang mendukung contravariant,
hanya class generic yang menggunakan generic parameter type sebagai parameter function
Artinya saat kita membuat object Contoh<Any>, maka bisa disubtitusi menjadi Contoh<String>
Untuk memberitahu bahwa generic parameter type tersebut adalah contravariant,
kita perlu menggunakan kata kunci in
 */
class Contravariant<in T> {
    fun sayHello(name: T) {
        return println("Hello $name")
    }

    // tidak boleh
    /*fun getData(): T {
        return data
    }*/
}

fun main() {
    val contravariantAny: Contravariant<Any> = Contravariant()
    val contravariantString: Contravariant<String> = contravariantAny

    // contravariantString.getData() // error
    contravariantString.sayHello("Emha")
}