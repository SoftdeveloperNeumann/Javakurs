package de.wbs.kotlindemo

fun main(){
    println("Hallo Welt! ")
    val wert : String = "Hallo"
    val wert2 = "Welt"
    val zahl = 3
    val zahl2 : Int

    zahl2=3
    println(zahl2)
    println("$zahl ist Number: ${zahl is Number} und toString ${zahl.toString()}")
//    print(zahl is String)
//    wert = "Welt"
    var zahl3:Int = 22
    zahl3 += 3
    println(zahl3)

    var name: String = "Frank"
//    name = null null kann nicht dem Typ String zugewiesen werden, ABER...
    var name2:String? = "Frank"
    name2 = null
    println(name2?.length)

    if(name2!=null){
        println(name2.length)
    }

//    println(name2!!.length) //ich behaupte, name2 ist niemals null

    var length_ : Int

    if(name2!= null){
        length_ = name2.length
    }else{
        length_= -1
    }
    length_ = if(name2 != null) name2.length else -1

    length_ = name2?.length ?: -1

    var alter = 0
    when(alter){
        0 -> println("Alter ist 0")
        1,2,3,4,33-> println("Alter ist 1,2,3,33 oder 4")
        in 5..9 -> println("Alter ist zwischen 5 und 9 (inklusive)")
        in 10 until 20 ->println("Alter ist zwischen 10 und 20")
        20 -> println("Alter ist 20")
    }
    println(when(alter){
        0 -> "Alter ist 0"
        1,2,3,4,33-> "Alter ist 1,2,3,33 oder 4"
        in 5..9 -> "Alter ist zwischen 5 und 9 (inklusive)"
        in 10 until 20 ->"Alter ist zwischen 10 und 20"
        20 -> "Alter ist 20"
        else->"Wert nicht vorhanden"
    })
    var value = when{
        alter == 20 ->20
        alter == 30 ->"Hallo"
        name=="Fred" -> 45.55
        else -> null
    }

}