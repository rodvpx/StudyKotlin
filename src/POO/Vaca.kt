package POO

open class Vaca {
    //atributos devem ser iniciados
    var nome: String = ""
    var raca: String = ""
    var cor: String = ""
    var idade: Int = 0

    //metodos em uma classe
    fun view() {
        println("Vaca: $nome\t Raça: $raca\t Cor: $cor\t Idade: $idade ")
    }

    fun comer() {
        println("Vaca: $nome, esta comendo!")
    }
}