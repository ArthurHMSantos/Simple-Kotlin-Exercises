data class Pais(var habitantes: Double, val taxaCrescimento: Double) {
    fun crescerPopulacaoAnual() {
        habitantes *=(1 + taxaCrescimento/100)
    }
}

fun main() {
    println("Insira a quantidade de habitantes do país A:")
    val habitantesPaisA = readLine()!!.toDouble();
    println("Insira a quantidade de habitantes do país B:")
    val habitantesPaisB = readLine()!!.toDouble();
    val paisA = Pais(habitantesPaisA, taxaCrescimento = 3.0)
    val paisB = Pais(habitantesPaisB, taxaCrescimento = 1.5)

    var quantidadeAnos = 0
    while (paisA.habitantes < paisB.habitantes) {
        paisA.crescerPopulacaoAnual()
        paisB.crescerPopulacaoAnual()
        quantidadeAnos++
    }

    println("De acordo com a taxa de crescimento levaria aproximadamente $quantidadeAnos anos")
}