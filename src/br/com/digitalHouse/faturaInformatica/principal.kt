package br.com.digitalHouse.faturaInformatica

fun main(){
    val mouse = Fatura(1,"Mouse com fio",100,20.50)
    val teclado = Fatura(2,"Teclado com fio",50,50.00)
    val caboUSB = Fatura(3,"Carregador de celular",-1,10.00)
    val webcam = Fatura(4,"Câmera para computador",10,-5.00)

    println(mouse.getTotalFatura())
    println(teclado.getTotalFatura())
    println(caboUSB.getTotalFatura())
    println(webcam.getTotalFatura())
}