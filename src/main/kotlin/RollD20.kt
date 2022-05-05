import com.sun.jdi.IntegerValue

fun rollD20(): Int{
    var result = (Math.random()*21).toInt()
    println("Roll D20 score: $result")
    return result
}