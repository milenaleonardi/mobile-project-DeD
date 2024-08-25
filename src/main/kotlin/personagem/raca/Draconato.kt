package personagem.raca

import personagem.Personagem

class Draconato: Raca {
    override val nomeRaca: String = "Draconato"
    override var idiomas: List<String> = listOf("Comum")
    override var deslocamentoBase: Float = 0f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.forca += 2
        personagem.carisma += 1
    }
}