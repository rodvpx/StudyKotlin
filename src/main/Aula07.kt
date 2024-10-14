package main

fun main() {

    olaMundo()

}

// funções

fun olaMundo() {
    println("Ola mundo")

    fun subtracao(a: Int, b: Int): Int {
        return a - b
    }

    println(subtracao(356, 50))
}

fun somaNum(a: Int, b: Int): Int {
    return a + b
}

fun subtrair() {
    val resultado = 10 - 5
    println("Estou subtraindo 10 - 5 = $resultado")
}



