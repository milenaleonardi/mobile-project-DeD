package personagem.raca

import personagem.Personagem

class HalflingRobusto: Raca {
    override val nomeRaca: String = "Halfling Robusto"
    override var idiomas: List<String> = listOf("Comum")
    override var deslocamentoBase: Float = 0f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.constituicao += 1
    }
}