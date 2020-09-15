package br.com.digitalHouse.controleEstoque

fun main(){
    val racao = Estoque("Special Dog",16,15)
    println(racao.mostra())
    println(racao.precisaRepor())
    racao.mudarNome("Special Dog Carne")
    racao.mudarQtdMinima(17)
    println(racao.precisaRepor())
    racao.repor(5)
    racao.darBaixa(1)
}