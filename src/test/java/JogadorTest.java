import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogadorTest {

    @Test
    void deveElogiarTreino(){
        Jogador jogador = new Jogador();
        assertEquals("O jogador elogiou o treino de finalizacao\nO treino de finalizacao sera mantido", jogador.elogiarTreino("finalizacao"));
    }

    @Test
    void deveCriticarTreino(){
        Jogador jogador = new Jogador();
        assertEquals("O jogador criticou o treino de finalizacao\nO treino de finalizacao sera melhorado", jogador.criticarTreino("finalizacao"));
    }

}