package Clase1011;

public class ImpresoraCannon extends Impresora{


    public ImpresoraCannon(String modelo, String tipoConexion, int hojasDisponibles) {
        super(modelo, tipoConexion, hojasDisponibles);
    }

    String imprimir(){
        return "La cannon está imprimiendo";
    }
    @Override
    boolean necesitaTinta (){
        return (this.getPorcentajeTinta() < 0.0);
    }


}



