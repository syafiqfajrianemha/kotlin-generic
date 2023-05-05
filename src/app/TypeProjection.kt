package app

class Container<T>(var data: T)

/*
- Kadang agak sulit untuk membuat class generic type yang harus covariant atau contravariant,
misal karena memang di class generic tersebut terdapat input dan output generic parameter type
- Namun jika kita membuat function untuk memanipulasi data invariant sangat lah sulit, karena
generic parameter type nya harus selalu sama
- Kita bisa melakukan type projection, yaitu menambahkan informasi covariant atau contravariant
di parameter function, ini memaksa isi function untuk melakukan pengecekan
- Jika covariant, kita tidak boleh mengubah data generic di object
- Jika contravariant, kita tidak boleh ngambil data generic object
 */
fun copyContainer(from: Container<out Any>, to: Container<in Any>) { // bisa in atau out
    to.data = from.data
}

fun main() {
    val container1 = Container("Fajrian")
    val container2: Container<Any> = Container("Emha")

    copyContainer(container1, container2)
    println(container1.data)
    println(container2.data)
}