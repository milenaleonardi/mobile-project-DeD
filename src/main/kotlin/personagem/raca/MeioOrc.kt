package personagem.raca

import personagem.Personagem

class MeioOrc: Raca {
    override val nomeRaca: String = "Meio-orc"
    override var idiomas: List<String> = listOf("Comum")
    override var deslocamentoBase: Float = 0f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.forca += 2
        personagem.constituicao += 1
    }
}