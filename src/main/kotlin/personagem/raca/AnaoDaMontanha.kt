package personagem.raca

import personagem.Personagem

class AnaoDaMontanha : Raca {
    override val nomeRaca: String = "Anão da Montanha"
    override var idiomas: List<String> = listOf("Comum", "Anao")
    override var deslocamentoBase: Float = 7.5f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.forca += 2
        personagem.constituicao += 2
    }
}