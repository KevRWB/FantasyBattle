class Monster(val name:String, val health: Int, val att:Int, val def:Int, val initiative:Int, val story:String){
    fun whoAmI(){
        println("Heey, I'm $name. My stats are:\nHealth: $health, attack: $att, defense: $def, initiative: $initiative.")
        println("Here's my story:\n$story")
    }
}