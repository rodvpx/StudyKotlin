package main

fun main(args: Array<String>) {

    //Funções
    //para chamar uma função
    val a = 5
    val b = 7
    val resultado = somar(a, b)
    mensagem("A soma de $a + $b = $resultado")
}

//para definir uma função usa a palavra fun

fun somar(n1: Int, n2: Int): Int {
    return n1 + n2
    //função que recebe Vaca números e retorna a soma deles
}

//nem todas as funções possuem retorno
fun imprimir(texto: String): Unit{ //usa o Unit para indicar que não tem retorno
    println(texto)

}
//porem podemos omitir o Unit que o Kotlin entende que não tem retorno
fun mensagem(texto: String) {
    println(texto)
}

//funções de expressão unica
//esse recurso simplifica a definição de uma função quando ela possui apenas uma linha
fun subtrair(n1: Int, n2: Int) = n1 - n2
fun imprimir2(texto: String) = println(texto)