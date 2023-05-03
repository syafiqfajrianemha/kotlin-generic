package app

class Invariant<T>(var data: T)

/*
Secara default, saat kita membuat generic parameter type, sifat parameter tersebut adalah invariant
Invariant artinya tidak boleh di subtitusi dengan subtype (child) atau supertype (parent)
Artinya saat kita membuat object Contoh<String>, maka tidak sama dengan Contoh<Any>,
begitupun sebaliknya, saat membuat object Contoh<Any>, maka tidak sama dengan Contoh<String>
 */
fun main() {
    val invariantString: Invariant<String> = Invariant("Syafiq")

    // val invariantAny: Invariant<Any> = invariantString // error bisa tetapi
    // invariantAny.data = 100 // bahaya
}