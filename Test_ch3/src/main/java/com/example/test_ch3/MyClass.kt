package com.example.test_ch3

// 최고 상위 영역
val name = "이상용"
val name2:String ="이상용2"
val num1 = 10

lateinit var data:String
val data2 : Int by lazy {
    println("by lazy 실행")
    10
}

val data3 : String by lazy  {
    println("by lazy 실행2 : String")
    "by lazy 실제 할당 값"
}

val data4 : Boolean by lazy {
    println("by lazy 실행3: Boolean")
    true
}
class MyClass {
    var name = "이상용3"
    var age = 40
    val name2= "이상용4"

    var dataa : Int = 10
    var dataa2 : Int? = null


}

fun main() {
    var myClass2 = MyClass()
    println(myClass2.age)
    println(myClass2.name)
    println(myClass2.name2)

    println("hello world")

    data = "lateinit, 초기화 미루기"
    println(data)
    println(data2 + 10)
    println(data3)
    println(data4)

    myClass2.dataa = myClass2.dataa + 10
    println(myClass2.dataa)
    println(myClass2.dataa.plus(10))

    val str1 = "hi \n yong"
    val str2 = """
        hi
        world
        """
    println("str1 : $str1")
    println("str2 : $str2")

    fun sum(no:Int) :Int {
        var sum =0
        for (i in 1..no) {
            sum+= i
        }
        return sum
    }

    println("name : $name , sum : ${sum(10)}, plus : ${10+20}")

}