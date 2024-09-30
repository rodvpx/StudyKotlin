package main

fun main() {
    //condições if else

    val idade = 59

    if (idade < 16) {
        println("Não pode votar com $idade")
    } else if (idade in 16..17 || idade in 60..100) {
        println("Voto opcional com $idade")
    } else if (idade in 18..59) {
        println("Voto obrigatório com $idade")
    } else {
        println("Idade inválida")
    }

    /*Usamos o in para verificar se o valor pertence ao intervalo
    * os .. serve para dizer o intervalo contando com
    * inicio e fim*/

}
