//  The Main Story
fun main() {
    initStory()
}


var heroesList = mutableListOf<Hero>()
fun initHeroes(){
    var hector = Hero("Hector", 17, 15, 18, 12, "I'm Hector, son of Priam")
    heroesList.add(hector)
    var irina = Hero("Irina", 11, 17, 15, 20, "My name is Irina" )
    heroesList.add(irina)
}

fun showHeroes(list: List<Hero>){
    for(hero in list){
        println(hero.story)
    }
}

var goOn = false
fun initStory(){
    println("Hello, welcome in this epic battle program, do you want to begin ?")
    println("O:N")
    var beginAnswer = readln().lowercase()
    if(beginAnswer == "o" || beginAnswer == "n"){
        println("Let's go !!!")
        goOn = true
    } else {
        println("It's your choice, as you like...")
    }

}

fun testGoOn(){
    if(goOn == true){

    }
}