package Clase911;

public class SocioHabilitado extends Socio{

    Double costoPileta;
    boolean habilitado;

    public SocioHabilitado(String numeroSocio, String nombre, Double cuotaMensual, String actividad,Double costoPileta) {
        super(numeroSocio, nombre, cuotaMensual, actividad);
        this.costoPileta= costoPileta;
        this.habilitado= false;
    }

    @Override
    public Double CostoMensual() {
        return super.CostoMensual()+costoPileta;
    }


    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}
