package Clase1011.ejercicioGrupal;

public class CajaAhorro extends Cuenta{

    Double saldo;
    Double tasaInteres;

    public CajaAhorro(Cliente cliente, Double tasaInteres,Double saldo) {
        super(cliente);
        this.tasaInteres = tasaInteres;
    }


    public void depositarEfectivo(Integer deposito) {
        this.saldo =  saldo + deposito;
         System.out.println(saldo);
    }


    @Override
    public void extraerEfectivo(Integer extraccion) {
        saldo = saldo - extraccion;
        System.out.println(saldo);
    }

    Double cobrarInteres(){

        Double intereses =  saldo * tasaInteres;
        Integer interes = intereses.intValue();
        System.out.println("El interés es:"+interes);
        return saldo;
    }

    @Override
    public void informar() {
        System.out.println(this.saldo);
    }








}
