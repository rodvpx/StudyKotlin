package main

fun main() {

    // var e val

    var num1 = 25
    var num2 = 45
    var num3 = num1 + num2
    val idade = "15"

    println("var variavel mutavel, ou seja muda seu valor de acordo com as operações")
    println("Exemplo: somando num1 + num2 e atribuindo a num3 \n" + num3)
    println("val variavel imutavel, ou seja permanece o valor padrão atribuido")
    println("Exemplo: " + idade)

    // TODO: a fazer

    //para ver o tipo da variavel usa ::class

    println(num1::class) //int
    println(idade::class) //string

    //tipagem de variaveis

    var nome: String
    var n_idade: Int
    var altura: Double
    var telefone: Long

    nome = "Plinio"
    n_idade = 25
    altura = 1.75
    telefone = 64999998888

    println("Nome: " + nome + "\nIdade: " + idade + " \nAltura: " + altura + "\nTelefone: " + telefone)

    // Tipos inteiros

    val byte: Byte = 8 // armazena 8 bits
    val short: Short = 16 // armazena 8 bits
    val int: Int = 32 // armazena 32 bits
    val long: Long = 64 // armazena 64 bits

    // Tipos flutuantes

    val float: Float = 32.0f // armazena 32 bits, precisa do f no final
    val double: Double = 64.0 // armazena 64 bits

    // Tipos de caracteres
    val char: Char = 'c' // armazena letra
    val string: String = "texto" // armazena texto

    // Tipo logico

    val boolean: Boolean = true // true ou false

    // Converter tipos

    val mediaPreco: Double = 22.4
    val resultado: Long = mediaPreco.toLong()

}