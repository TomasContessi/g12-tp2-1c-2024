package comTP.model.modificador;

public class Exclusividad {
    public int calcularExclusividad(int vecesActivadasEnEstaRonda,int jugadoresContestaronBien){
        if(jugadoresContestaronBien > 1){
            return 0;
        }
        return 2*vecesActivadasEnEstaRonda;
    }
}
