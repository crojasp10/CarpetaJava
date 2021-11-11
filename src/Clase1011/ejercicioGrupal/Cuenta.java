package Clase1011.ejercicioGrupal;

public abstract class  Cuenta {

    private Cliente cliente;

    public Cuenta(Cliente cliente) {
        this.cliente = cliente;
    }

    public void depositarEfectivo(Integer deposito){};
    public void extraerEfectivo (Integer extraccion){}
    public void informar(){};






}
