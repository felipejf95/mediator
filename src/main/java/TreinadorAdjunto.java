public class TreinadorAdjunto {

    private static TreinadorAdjunto instancia = new TreinadorAdjunto();

    private TreinadorAdjunto() {}

    public static TreinadorAdjunto getInstancia() {
        return instancia;
    }

    public String receberElogioTreinoJogador(String mensagem){
        return "O jogador elogiou o treino de " + mensagem + "\n" + Treinador.getInstancia().receberElogioTreino(mensagem);
    }

    public String receberCriticaTreinoJogador(String mensagem){
        return "O jogador criticou o treino de " + mensagem + "\n" + Treinador.getInstancia().receberReclamacaoTreino(mensagem);
    }
}
