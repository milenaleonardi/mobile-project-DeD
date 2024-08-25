import personagem.Atributos
import personagem.DistribuicaoDeAtributos
import personagem.Personagem
import personagem.classe.Guerreiro
import personagem.raca.AnaoDaMontanha

fun main(args: Array<String>) {

    //Criando Personagem
    val anaoDaMontanha = AnaoDaMontanha()
    val guerreiro = Guerreiro() //Unica classe implemetada no momento

    val personagem = Personagem(
        nomePersonagem = "Bruneor",
        raca = anaoDaMontanha,
        classe = guerreiro
    )

    //Atribuindo Pontos de Vida Inicial
    personagem.AtribuirPontosDeVidaInicial(guerreiro.tipoDadoDeVida)
    println("***********************")
    println("Pontos de Vida Inicial: ${personagem.getPontosDeVida}")
    println("***********************")

    //Atribuir valores de habilidades por padrão de pontos
    val atributos = Atributos()
    atributos.Distribuir(personagem)

    //Atribuir valores de habilidades por escolha de raça
    anaoDaMontanha.AprimorarAtributos(personagem)
    atributos.mostrarAtributos(personagem)

    val distribuicaoDeAtributos = DistribuicaoDeAtributos()
    distribuicaoDeAtributos.escolherValores(personagem)
    atributos.mostrarAtributos(personagem)

    println("\nCarregando ficha do personagem...")
    Thread.sleep(5000)
    personagem.fichaDePersonagem()
}