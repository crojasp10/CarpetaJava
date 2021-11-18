package Clase1711;

public class Yate extends Embarcacion implements Comparable{

    Integer cantidadCamarotes;


    public Yate(Capitan capitan, Double precioBase, Double valorAdicional, int agnoFabricacion, Integer eslora, Integer cantidadCamarotes) {
        super(capitan, precioBase, valorAdicional, agnoFabricacion, eslora);
        this.cantidadCamarotes = cantidadCamarotes;
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


    @Override
    public int compareTo(Object o) {
        Yate yate = (Yate)o ;
        if (this.cantidadCamarotes > yate.cantidadCamarotes){
            return 1;
        }
        if (this.cantidadCamarotes < yate.cantidadCamarotes){
            return -1;
        }
        return 0;
    }
}
