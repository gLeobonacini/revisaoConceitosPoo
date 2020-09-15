package br.com.digitalHouse.faturaInformatica

class Fatura(var itens: MutableList<Item>) {

    fun getTotalFatura():Double{
        var totalFatura = 0.0

        for(i in 0..itens.size-1){
            totalFatura += itens[i].qtdItemComp * itens[i].precoUnItem
        }
        return totalFatura
    }
}