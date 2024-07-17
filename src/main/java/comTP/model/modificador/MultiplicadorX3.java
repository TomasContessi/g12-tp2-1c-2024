package comTP.model.modificador;

public class MultiplicadorX3 implements Multiplicador{
    @Override
    public Puntaje multiplicar(Puntaje puntaje){
        return puntaje.multiplicarseCon(new Puntaje(3));
    }
}
