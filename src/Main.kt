fun main() {
    val pets = mutableListOf<String>()

    pets.add("Cat")
    pets.add("Dog")
    pets.add("Koala")
    pets.add("Your mum")
    pets.add("Human")

    while (true) {
        // Show current pets
        show(pets)
        //Get user action
        val action = menu()
        //Act upon it
        when (action) {
            'Q' -> break
            'A' -> getNewPet(pets)
//            'D' -> deletePet(pets)
        }
    }
}
/**
 * Get a pet name from the user and
 * add to the given list of pets
 */
fun getNewPet(pets: MutableList<String>) {
    val newPet = getString("New pet: ")
    pets.add(newPet)
}
    /**
     * Show a menu
     * and get the user's choice. Return this as a Charm
     */
    fun menu(): Char {
        println("[A]dd a new pet")
        println("[D]elete a new pet")
        println("[Q]uit")

        val validChoices = "ADQ"

        while (true) {
            print("Choice: ")
            val input = readln()
            //Type nothing? Try again.
            if (input.isBlank()) continue
            //Grab the first letter
            val choice = input.uppercase().first()
            //Check it is a valid option
            if (validChoices.contains(choice)) return choice


            }
        }


    /**
     * Show a given list with numbered entries (from 1 upwards)
     */

fun show(list: List<Any>) {
    for ((i, item) in list.withIndex()) {
        println("$i: $item")
    }
}
fun getString(prompt: String) : String {
    var userInput: String
    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }
    return userInput
}