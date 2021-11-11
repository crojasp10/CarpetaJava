package Clase1011;

public class ImpresoraEpson extends Impresora{


    public ImpresoraEpson(String modelo, String tipoConexion, int hojasDisponibles) {
        super(modelo, tipoConexion, hojasDisponibles);
    }

    String imprimir(){
        return "La Epson está imprimiendo";
    }


}
