fun main(){
    val name="Ivy"
    sayHello(name)
    var x=modulus(5.0,4)
    println(x)
    var y= addSum(5,7,9,9)
    println(y)
    val sentence =("I am a friendly person")
    println(sentence)
}
fun sayHello (name:String){
    println("Hello $name")
}
fun modulus(num1:Double, num2 :Int):Double{
    var division=num1%num2
    return(division)

}
fun addSum(num1:Int,num2:Int,num3:Int,num4:Int ): Int {
    var sum=num1+num2+num3+num4
    return(sum)
}
fun factsAboutMe(sentence:String):String{
    return (sentence)

}


