package br.com.digitalHouse.faturaInformatica

class Fatura(val numerItem: Int, val descricaoItem: String, var quantidadeVendida: Int, private var precoUnitario: Double) {
    init{
        when(quantidadeVendida < 0){
            true -> quantidadeVendida = 0
        }
        when(precoUnitario < 0.0){
            true -> precoUnitario = 0.0
        }
    }

    fun getTotalFatura(): Double{
        return quantidadeVendida*precoUnitario
    }
}