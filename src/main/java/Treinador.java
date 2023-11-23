public class Treinador{

    private static Treinador instancia = new Treinador();

    private Treinador() {}

    public static Treinador getInstancia(){
        return instancia;
    }

    public String receberReclamacaoTrino(String mensagem){
        return "O treino de " + mensagem + " sera melhorado";
    }

    public String receberElogioTreino(String mensagem){
        return "O treino de " + mensagem + " sera mantido";
    }



}
