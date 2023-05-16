fun main() {
    println("Insira um número romano:")
    val numeroRomano: String? = readLine()?.uppercase()

    if (numeroRomano == null || numeroRomano == "") {
        println("Entrada inválida. Por favor, insira um valor.")
        return
    } else {
        val numerosRomanos = mapOf(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000
        )

        var resultado = 0

        for (i in numeroRomano!!.indices) {
            val atual = numerosRomanos.getValue(numeroRomano[i])
            val proximo = when (i + 1) {
                numeroRomano.length -> 0
                else -> numerosRomanos.getValue(numeroRomano[i + 1])
            }

            if (atual < proximo) {
                resultado -= atual
            } else {
                resultado += atual
            }
        }
        println("O número $numeroRomano em algarismos arábicos é $resultado.")
    }
}