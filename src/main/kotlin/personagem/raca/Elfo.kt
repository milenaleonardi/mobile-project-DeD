package personagem.raca

import personagem.Personagem

open class Elfo() : Raca {
    override val nomeRaca: String = "Elfo"
    override var idiomas: List<String> = listOf("Comum")
    override var deslocamentoBase: Float = 0f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.destreza += 2
    }
}