public class Bomberman {

    private Posicion posicionActual; // Debería ser del tipo Celda.
    private EstadoBomberman estado;

    // Esto debería retornar una Celda.
    public Posicion getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(Posicion posicion) {
        this.posicionActual = posicion;
    }

    public void setEstado(EstadoBomberman estado){
        this.estado = estado;
    }

    public EstadoBomberman getEstado(){
        return this.estado;
    }

    public Bomba ponerBomba(Integer duracionDeLaBomba)
    {
        return new Bomba(duracionDeLaBomba, this.posicionActual);
    }
}