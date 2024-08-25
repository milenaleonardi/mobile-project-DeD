package personagem.raca

import personagem.Personagem

class MeioElfo: Raca{
    override val nomeRaca: String = "Meio-elfo"
    override var idiomas: List<String> = listOf("Comum")
    override var deslocamentoBase: Float = 0f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.carisma += 2
    }
}