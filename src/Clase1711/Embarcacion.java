package Clase1711;

public class Embarcacion {
    Capitan capitan;
    Double precioBase;
    Double valorAdicional;
    int agnoFabricacion;
    Integer eslora;

    public Embarcacion(Capitan capitan, Double precioBase, Double valorAdicional, int agnoFabricacion, Integer eslora) {
        this.capitan = capitan;
        this.precioBase = precioBase;
        this.valorAdicional = valorAdicional;
        this.agnoFabricacion = agnoFabricacion;
        this.eslora = eslora;
    }
    public Double montoAlquiler(){
            return precioBase;
    }





}
