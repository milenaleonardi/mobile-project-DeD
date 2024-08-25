package personagem.raca

import personagem.Personagem

class Gnomo: Raca {
    override val nomeRaca: String = "Gnomo"
    override var idiomas: List<String> = listOf("Comum")
    override var deslocamentoBase: Float = 0f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.inteligencia += 2
    }
}