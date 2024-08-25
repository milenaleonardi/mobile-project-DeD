package personagem.raca

import personagem.Personagem

class AnaoDaColina: Raca {
    override val nomeRaca: String = "Anão da Colina"
    override var idiomas: List<String> = listOf("Comum", "Anao")
    override var deslocamentoBase: Float = 7.5f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.sabedoria += 1
    }
}