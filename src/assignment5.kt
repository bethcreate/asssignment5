fun main (){
var beth= Human("mercy", 20, 50 )
    beth.eat(9)

    beth.speak("jane")
    beth.birthday()

    var john= User("John", "Kamau", "john@gmail.com", "0720223344", "Johnk")
    println(john.firstName)
    println(john.lastName)
}
class Human(var name: String, var age: Int, var weight: Int) {


    fun eat(foodWeight: Int) {
        println("I am eating $foodWeight kgs of food")
    }
        fun speak(speech: String) {
            println("$speech")
        }
            fun birthday(){
                age++
                println (age)


        }
    }
data class User(var firstName: String, var lastName: String,var email: String, var phoneNumber: String, var password: String){

}
