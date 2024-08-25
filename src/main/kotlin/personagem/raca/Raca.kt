package personagem.raca

import personagem.Personagem

interface Raca {
    val nomeRaca: String
    var idiomas : List<String>
    var deslocamentoBase : Float

    fun AprimorarAtributos(personagem: Personagem)
}