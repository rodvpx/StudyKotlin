package tutorial

fun main(args: Array<String>) {

    var idade: Int? = null//difinivo uma variavel sem valor inicial
    idade = 32

    val dono = Human()
    dono.name = "Mario"

    val dog = Dog("Lulu", "Dalmata", "Preto", 10)
    dog.owner = dono

    dog.sayHi()
}

