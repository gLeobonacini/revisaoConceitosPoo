package br.com.digitalHouse.registroEscola

class Professor(override val nome: String, override val sobrenome: String, val RD: Long): Pessoa {

    fun darAula(curso: Curso){
        val aulaMinistrada = curso.listaAula.removeAt(0)
        println("$nome $sobrenome está dando aula de ${aulaMinistrada.materia.nome}")
    }

    fun fazerChamada(curso: Curso){
        println("$nome $sobrenome está fazendo chamada")
        curso.listaAluno.forEach(){
            println("${it.nome} ${it.sobrenome} está presente?")
        }
    }
}