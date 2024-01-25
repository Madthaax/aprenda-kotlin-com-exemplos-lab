// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Matrícula realizada com sucesso para ${usuario.nome} na formação $nome.")
    }
}

fun main() {
    // Criando alguns objetos para simular cenários de teste
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 60)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin", 90)
    val conteudo3 = ConteudoEducacional("Desenvolvimento Android com Kotlin", 120)

    val formacaoKotlin = Formacao("Formação Kotlin", listOf(conteudo1, conteudo2, conteudo3))

    // Simulando matrículas
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)

    // Exibindo inscritos na formação
    println("Inscritos na formação ${formacaoKotlin.nome}: ${formacaoKotlin.inscritos.map { it.nome }}")
}
