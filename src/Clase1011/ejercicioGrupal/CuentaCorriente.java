package Clase1011.ejercicioGrupal;

public class CuentaCorriente extends Cuenta {
    Integer saldo;
    Integer montoAutorizado;

    public CuentaCorriente(Cliente cliente, Integer saldo, Integer montoAutorizado) {
        super(cliente);
        this.saldo = saldo;
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void depositarEfectivo(Integer deposito) {
        saldo = saldo + deposito;
    }

    @Override
    public void extraerEfectivo(Integer extraccion) {
        if (extraccion < montoAutorizado){
            saldo = saldo -extraccion;
        }
        else{
            System.out.println("No hay saldo disponible");
        }

    }

    @Override
    public void informar() {
        System.out.println(saldo);
    }
}
