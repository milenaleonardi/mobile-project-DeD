package personagem.raca

import personagem.Personagem

class Halfling() : Raca {
    override val nomeRaca: String = "Halfling"
    override var idiomas: List<String> = listOf("Comum")
    override var deslocamentoBase: Float = 0f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.destreza += 2
    }
}