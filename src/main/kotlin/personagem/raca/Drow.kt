package personagem.raca

import personagem.Personagem

class Drow: Raca {
    override val nomeRaca: String = "Drow"
    override var idiomas: List<String> = listOf("Comum")
    override var deslocamentoBase: Float = 0f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.carisma += 1
    }
}