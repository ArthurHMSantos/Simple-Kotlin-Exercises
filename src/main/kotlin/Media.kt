fun main() {
    println("Insira a média do aluno:")
    val media = readLine()?.toDoubleOrNull()

    if (media != null) {
        when {
            media < 0 -> println("Entrada inválida. Por favor, insira um valor positivo.")
            media < 5 -> println("Reprovado")
            media < 7 -> println("Recuperação")
            media <= 10 -> println("Aprovado")
            else -> println("Entrada inválida. Por favor, insira um valor menor ou igual a 10.")
        }
    } else {
        println("Entrada inválida. Por favor, insira um valor numérico.")
    }
}