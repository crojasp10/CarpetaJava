package Clase1011.ejercicioGrupal;

public class Controlador {


    public static void main(String[] args) {

        Cliente cliente = new Cliente("1234","Rojas","112233","122ess");
/*
        CuentaCorriente miCuenta = new CuentaCorriente(cliente,1000,200);

        miCuenta.extraerEfectivo(150);
        miCuenta.informar();

     */



        CajaAhorro miCaja = new CajaAhorro(cliente,1.000,0.2);
        miCaja.informar();
        miCaja.depositarEfectivo(1000);
        miCaja.extraerEfectivo(150);
        miCaja.extraerEfectivo(100);
        System.out.println(miCaja.cobrarInteres());
        miCaja.informar();



    }
}
