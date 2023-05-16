object ReceitaFederal {
    fun calcularImposto(salario: Double): Double {
        val aliquota = when {
            salario >= 0 && salario <= 1100 -> 0.05
            salario > 1100 && salario <= 2500 -> 0.10
            else -> 0.15
        }
        return aliquota * salario
    }
}

fun main() {

    println("Insira o salário do funcionário:")
    val valorSalario = readLine()!!.toDouble()

    println("Insira o valor dos benefícios:")
    val valorBeneficios = readLine()!!.toDouble()

    val valorImposto = ReceitaFederal.calcularImposto(valorSalario)
    val salarioTransferido = valorSalario - valorImposto + valorBeneficios


    println(String.format("Salario a ser transferido: R\$%.2f", salarioTransferido))
}