package br.com.digitalHouse.faturaInformatica

fun main(){

    val item1 = Item(11,"Mouse",- 8,-55.0)
    val item2 = Item(22,"Teclado", 1,100.00)
    val item3 = Item(33, "Webcam", 2, 40.00)

    val listaItens = mutableListOf<Item> (item1, item2,item3)

    val fatura = Fatura(listaItens)

    println(fatura.getTotalFatura())
}