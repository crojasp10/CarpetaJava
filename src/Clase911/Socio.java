package Clase911;

public class Socio {

    private String numeroSocio;
    private String nombre;
    private Double cuotaMensual;
    private String actividad;


    public Socio(String numeroSocio, String nombre, Double cuotaMensual, String actividad) {
        this.numeroSocio = numeroSocio;
        this.nombre = nombre;
        this.cuotaMensual = cuotaMensual;
        this.actividad = actividad;
    }

    public  Double CostoMensual(){
        return cuotaMensual;
    };

    @Override
    public String toString() {
        return "Socio{" +
                "numeroSocio='" + numeroSocio + '\'' +
                ", nombre='" + nombre + '\'' +
                ", cuotaMensual=" + cuotaMensual +
                ", actividad='" + actividad + '\'' +
                '}';
    }
}
