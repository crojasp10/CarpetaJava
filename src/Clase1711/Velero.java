package Clase1711;

public class Velero extends Embarcacion {

    Integer cantidadMastiles;

    public Velero(Capitan capitan, Double precioBase, Double valorAdicional, int agnoFabricacion, Integer eslora, Integer cantidadMastiles) {
        super(capitan, precioBase, valorAdicional, agnoFabricacion, eslora);
        this.cantidadMastiles = cantidadMastiles;
    }

    public Double montoAlquiler(){
        Double resultado;
        if (agnoFabricacion > 2020){
            resultado = precioBase + valorAdicional;
        }else{
            resultado = precioBase;
        }
        return resultado;
    }

    Boolean esGrande(){
        return eslora>4;
    }


}
