import com.chinmay.User

fun main(args:Array<String>){
    var user1 = User()
    user1.name="Alice"
    user1.display()

    var employee = Employee("JJ")
    employee.display()

    //String interpolation
    println("The name of the user is ${user1.name}")

}



class Employee(var name: String){
    fun display(){
        println(this.name)
    }
}