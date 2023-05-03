package data

/*
Generic parameter type tidak hanya bisa digunakan pada class atau interface
Kita juga bisa menggunakan generic parameter type di function
Generic parameter type yang kita deklarasikan di function, hanya bisa diakses di function tersebut,
tidak bisa digunakan di luar function
Ini cocok jika kita ingin membuat generic function, tanpa harus mengubah deklarasi class
 */
class Function(val name: String) {
    fun <T> sayHello(param: T) {
        println("Hello $param, My Name is $name")
    }
}