//  The Main Story

import kotlin.system.exitProcess

// MAIN FUNCTION -----------------------------------------
fun main() {
    initHeroes()
    initMonsters()
    while(true){
        initStory()
        showHeroes(heroesList)
        while(heroSelection == false){
            selectHero()
        }

        }
    }

// Init Monsters List Function -----------------------
var monstersList = mutableListOf<Monster>()
fun initMonsters(){
    var zombie = Monster(1, "Zombie", 12, 6, 8, 2, "A classic Zombie")
    monstersList.add(zombie)
    var wolf = Monster(2, "Wolf", 6, 6, 4, 10, "A lambda wolf from the woods")
    monstersList.add(wolf)
}

// Init Hero Lists -----------------------------------------
var heroesList = mutableListOf<Hero>()
var heroesIdList = mutableListOf<String>()
var heroesNameList = mutableListOf<String>()
fun initHeroes(){
    var hector = Hero(1,"Hector", 17, 15, 18, 12, "I'm Hector, son of Priam")
    heroesList.add(hector)
    heroesIdList.add((hector.id).toString())
    heroesNameList.add((hector.name).lowercase())
    var irina = Hero(2,"Irina", 11, 17, 15, 20, "My name is Irina" )
    heroesList.add(irina)
    heroesIdList.add((irina.id).toString())
    heroesNameList.add((irina.name).lowercase())
}

// Begin the story -----------------------------------
fun initStory(){
    println("Hello, welcome in this epic battle program, do you want to begin ?")
    println("O:N")
    var beginAnswer = readln().lowercase()
    if(beginAnswer == "o" || beginAnswer == "n"){
        if(beginAnswer == "o"){
            println("Let's go !!!")
        } else {
            println("As you like... Bye")
            exitProcess(1)
        }
    } else {
        println("Don't understand your answer, please enter O or N")
    }
}

//  Show heroes Function ---------------------------------
fun showHeroes(list: List<Hero>){
    println("It's time to chose a hero in the list :")
    for(hero in list){
        println("${hero.id}/ ${hero.stats()}")
    }
    println("Your choice :")
}

//  Select Hero function ------------------------------
var heroSelected: Hero? = null
var heroSelection = false
fun selectHero(){
    var choice = readln().lowercase()
    if(heroesIdList.contains(choice)){
        heroSelected = heroesList[choice.toInt()]
        heroSelection = true
    } else {
        println("Please enter a valid id for your hero")
    }
}

//Show hero selected function
var variable = String()






