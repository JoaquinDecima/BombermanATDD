import bomba.Bomba;
import bomberman.Bomberman;
import juego.Juego;
import org.junit.Test;
import tablero.Mapa;

import static org.junit.Assert.*;

public class BombermanPoneBomba {
    Bomberman bman = new Bomberman();
    Mapa mapa = new Mapa(6); //cuadrado de 6 x 6 , celdas vacias, salvo la (0,0), ocupada por bman
    Juego juego = new Juego(mapa, bman);
    Bomba boom = new Bomba(3); // Se crea bomba de 3 ticks

    @Test
    public void bombermanPoneUnaBombaDe3TicksQueNoExplotoYDespuesDe3TicksExplota() {
        bman.poner(boom);
        boom.tick();

        assertFalse(boom.exploto());

        boom.tick();

        assertFalse(boom.exploto());

        boom.tick();

        assertTrue(boom.exploto());
    }

    @Test
    public void bombermanPoneUnaBombaYRompeLasParedesDeMelamina(){
        bman.poner(boom);
    }
}
