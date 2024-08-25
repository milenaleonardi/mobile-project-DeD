package personagem.raca

import personagem.Personagem

open class Anao() : Raca {
    override val nomeRaca: String = "Anão"
    override var idiomas: List<String> = listOf("Comum", "Anão")
    override var deslocamentoBase: Float = 7.5f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.constituicao += 2
    }
}