fun main(args:Array<String>){
    var user1 = User()
    user1.name="Alice"
    user1.display()

    var employee = Employee("JJ")
    employee.display()
}

class User{

    var name:String=""
    fun display(){
        println(name)
    }
}

class Employee(name:String){
    var name:String=name
    fun display(){
        println(this.name)
    }
}