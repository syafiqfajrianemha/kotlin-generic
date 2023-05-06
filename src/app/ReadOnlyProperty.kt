package app

import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

/*
- Sebelumnya kita sudah belajar tentang delegate di Kotlin
- Di Kotlin, ada sebuah interface generic yang bisa digunakan sebagai delegate property yang
sifatnya readonly, alias val (immutable), namanya ReadOnlyProperty
- ReadOnlyProperty bisa digunakan sebagai delegate, sehingga sebelum data kita kembalikan, kita
bisa melakukan sesuatu, atau bahkan mengubah value si property
 */
class LogReadOnlyProperties(val data: String): ReadOnlyProperty<Any, String> {
    override fun getValue(thisRef: Any, property: KProperty<*>): String {
        println("Access property ${property.name} with value $data")
        return data.toUpperCase()
    }
}

class NameWithLog(param: String) {
    // delegated
    val name: String by LogReadOnlyProperties(param)
}

fun main() {
    val name = NameWithLog("Syafiq")

    println(name.name)
    println(name.name)
}