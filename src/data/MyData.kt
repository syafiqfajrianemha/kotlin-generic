package data

/*
Generic type adalah class atau interface yang memiliki parameter type
Nama generic parameter type yang umum digunakan:
- E -> Element (biasa digunakan di collection atau struktur data)
- K -> Key
- N -> Number
- T -> Type
- V -> Value
- S,U,V etc. -> 2nd, 3rd, 4th types

Parameter type di Generic type boleh lebih dari satu
Namun harus menggunakan nama type berbeda
Ini sangat berguna ketika kita ingin membuat generic parameter type yang banyak
 */
class MyData<T, U> (val firstData: T, val secondData: U) {
    fun printData() = println("Data first is: $firstData, data second is $secondData")

    fun getData(): T = firstData

    fun getSecond(): U = secondData
}