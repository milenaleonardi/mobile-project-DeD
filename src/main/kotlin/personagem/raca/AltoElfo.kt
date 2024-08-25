package personagem.raca

import personagem.Personagem

class AltoElfo: Raca {
    override val nomeRaca: String = "Alto Elfo"
    override var idiomas: List<String> = listOf("Comum")
    override var deslocamentoBase: Float = 0f

    override fun AprimorarAtributos(personagem: Personagem) {
        personagem.inteligencia += 1
    }
}