package app

import kotlin.properties.Delegates
import kotlin.properties.ObservableProperty
import kotlin.reflect.KProperty

/*
- Generic interface delegate yang sebelumnya kita gunakan (ReadOnlyProperty dan
ReadWriteProperty) kita perlu mengatur value datanya secara manual
- Kadang kita hanya butuh melakukan sesuatu sebelum dan setelah data nya diubah
- Untuk kasus seperti ini, kita bisa menggunakan generic class ObservableProperty
 */
class LogObservableProperty<T>(data: T) : ObservableProperty<T>(data) {
    override fun beforeChange(property: KProperty<*>, oldValue: T, newValue: T): Boolean {
        println("Before change value from $oldValue to $newValue")
        return true
    }

    override fun afterChange(property: KProperty<*>, oldValue: T, newValue: T) {
        println("After change value from $oldValue to $newValue")
    }
}

class Car(brand: String, year: Int) {
    // delegated
    var brand: String by LogObservableProperty<String>(brand)
    var year: Int by LogObservableProperty<Int>(year)

    // object delegates
    // ReadWriteProperty yang nilai awal bisa null, namun error jika masih null
    var owner: String by Delegates.notNull<String>()

    // ObservableProperty dengan beforeChange
    var description: String by Delegates.vetoable("") { property, oldValue, newValue ->
        println("Before change value from $oldValue to $newValue")
        true
    }

    // ObservableProperty dengan afterChange
    var other: String by Delegates.observable("") { property, oldValue, newValue ->
        println("After change value from $oldValue to $newValue")
    }
}

fun main() {
    val car = Car("Toyota", 2020)

    car.brand = "Wuling"
    println(car.brand)

    car.year = 2023
    println(car.year)

    car.owner = "Syafiq"
    println(car.owner)

    car.description = "Desc"
    println(car.description)

    car.other = "Other"
    println(car.other)
}