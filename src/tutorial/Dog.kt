package tutorial

class Dog constructor(
    private val name: String,
    private val raca: String,
    private val cor: String,
    private val idade: Int
) {
    var owner: Human? = null


    fun sayHi() {
        println("Hi my name is $name, and my owner is ${owner?.name}")
    }

    fun status() {
        println("Nome: $name")
        println("Raça: $raca")
        println("Cor: $cor")
        println("Idade: $idade")
    }

}