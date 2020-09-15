package br.com.digitalHouse.registroEscola

class Aluno(override val nome: String, override val sobrenome: String, val RA: Long):Pessoa {
    fun assistirAula(){
        println("$nome $sobrenome está assistindo a aula")
    }
    fun fazerLicaoCasa(){
        println("$nome $sobrenome está fazendo lição de casa")
    }
}