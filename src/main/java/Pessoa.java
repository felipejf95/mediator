public class Pessoa {

    String elogiarTreino(String mensagem){
        return TreinadorAdjunto.getInstancia().receberElogioTreinoJogador(mensagem);
    }

    String criticarTreino(String mensagem){
        return TreinadorAdjunto.getInstancia().receberCriticaTreinoJogador(mensagem);
    }

}
