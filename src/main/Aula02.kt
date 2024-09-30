package main

fun main() {
    //pode usar o _ para ficar melhor a visualisação do numero
    val milhao = 1_000_000
    val mil = 1_200

    // \n quebra de texto
    // \t espaça o texto

    println("QUEBRA DE LINHA:")
    println("Ana\nFlavia")
    println("ESPAÇAMENTO DE LINHA:")
    println("Ana\tFlavia")

    // fução que muda o comportamento do objeto String

    val nome: String = "Plinio Machado"
    val tamanho = nome.length //tamanho da string com o espaço
    val nomeMaiusculo = nome.uppercase() // em capslook
    val nomeMinusculo = nome.lowercase() // em minusculo

    println("Texto: " + nome)
    println("Tamanho: " + tamanho)
    println("Maiusculo: " + nomeMaiusculo)
    println("Minusculo: " + nomeMinusculo)


    // Formatação de textos

    //usar aspas triplas """

    val texto = """
        Testando a formatação
        de forma diferente, com 3 aspas
        muito bom!!
    """.trimIndent() // usando trim para formatar
    //da pra usar outros .trim
    println(texto)

    //topicos - tabelas
    val textoTopico = """
        Ana
        Fernando
        Ricardo
    """.replaceIndent("*")
    println(textoTopico)

    // modelo convecional
    val name = "Ricardo"
    val idade = 22
    println("Olá, " + name + ". Sua idade é " + idade)

    // modelo sortificado
    println("Olá, $name. Sua idade é $idade")

    //com expressão direto no print
    val nota1 = 25.56
    val nota2 = 35.5
    val nota3 = 51.25
    println("A média das notas $nota1, $nota2, $nota3")
    println("É ${nota1 + nota2 + nota3 / 3}")


}