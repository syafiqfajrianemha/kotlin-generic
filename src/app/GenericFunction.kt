package app

import data.Function

fun main() {
    val function = Function("Syafiq")

    function.sayHello<String>("Budi")
    function.sayHello("Joko")

    function.sayHello(19)
    function.sayHello<Int>(30)
}