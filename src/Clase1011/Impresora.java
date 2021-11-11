package Clase1011;

import java.util.Date;

public abstract class Impresora {

    String modelo;
    String tipoConexion;
    Date fechaFabricacion;
    int  hojasDisponibles;
    double porcentajeTinta;


    public Impresora(String modelo, String tipoConexion, int hojasDisponibles) {
        this.modelo = modelo;
        this.tipoConexion = tipoConexion;
        this.hojasDisponibles = hojasDisponibles;
        this.porcentajeTinta = 10.00;
    }

    public double getPorcentajeTinta() {
        return porcentajeTinta;
    }

    boolean tienePapel(){
        boolean resultado = hojasDisponibles > 0 ? true:false;
        return resultado;
    }
    boolean necesitaTinta (){
        return (porcentajeTinta == 0.0);
    }

    abstract String  imprimir();


}
