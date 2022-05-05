class Hero (val id:Int, val name:String, val health:Int, val att:Int, val def:Int, val initiative:Int, val story:String) {
    fun stats(): String{
        return "Heey, I'm $name. My stats are:\nHealth: $health, attack: $att, defense: $def, initiative: $initiative."
    }
    fun whoAmI(): String{
        return "Here's my story:\n$story"
    }
}