package tablero;

public class Celda {

    public int x;
    public int y;
    private EstadoCelda estado;

    public Celda(int x , int y){
        this.x = x;
        this.y = y;
        estado = EstadoCelda.VACIA;
    }

    public EstadoCelda getEstado(){
        return estado;
    }

    public void setEstado(EstadoCelda e){
        this.estado = e;
    }


}
