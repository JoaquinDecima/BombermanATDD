package bomba;

import bomberman.Posicion;

public class Bomba {
    int tick;
    public Posicion pocicion;
    boolean explocion = false;

    // Se crea bomba.Bomba
    public Bomba(int ticks){
        tick = ticks;
    }

    // Recibe un tick
    public void tick(){
        tick -= 1;
        if (tick == 0){
            this.explotar();
        }
    }

    // Retorna ture si la bomba exploto
    public boolean exploto(){
        return (explocion);
    }

    // Explota
    private void explotar(){
        explocion = true;
    }
}
