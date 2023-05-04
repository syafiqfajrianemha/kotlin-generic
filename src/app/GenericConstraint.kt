package app

interface CanSayHello {
    fun sayHello(name: String)
}

open class Employee

class Manager : Employee()

class VicePresident : Employee(), CanSayHello {
    override fun sayHello(name: String) {
        println("Hello $name, I'm vice president")
    }
}

/*
Kadang kita ingin membatasi data yang boleh digunakan di generic parameter type
Kita bisa menambahkan constraint di generic parameter type dengan menyebutkan tipe yang diperbolehkan
Secara otomatis, type data yang bisa digunakan adalah type yang sudah kita sebutkan, atau class-class turunannya
Secara default, constraint type untuk generic parameter type adalah Any, sehingga semua tipe data bisa digunakan

Secara default, hanya satu tipe data yang bisa digunakan untuk membatasi generic parameter type
Jika kita ingin menggunakan lebih dari satu tipe data, kita bisa menggunakan kata kunci where
 */
// : employee dan class turunannya
class Company<T>(val employee: T) where T : Employee, T : CanSayHello

fun main() {
    // val data1 = Company(Employee()) // error CanSayHello
    // val data2 = Company(Manager()) // error CanSayHello
    VicePresident().sayHello("Emha")
    val data3 = Company(VicePresident())
    // val data4 = Company("String") // error not Employee
}