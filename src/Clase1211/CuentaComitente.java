package Clase1211;

public class CuentaComitente extends Cuenta{

    String cnv;

    public CuentaComitente(Cliente titular, Double saldo, String cnv) {
        super(titular, saldo);
        this.cnv = cnv;
    }

    public void depositar (Double monto, String moneda){
        Double montoNeto = monto*(99/100);
        Double saldo = this.getSaldo();
        saldo += montoNeto;
        this.setSaldo(saldo);

    }

    @Override
    public void extraer(Double monto) {

    }

    public void extraer(Double monto, String clave ) {
        if (clave.equals(cnv)){
            if (getSaldo()>0){
                Double saldo = getSaldo();
                setSaldo(saldo -= monto);
            }
        }else{
            Double saldo = getSaldo();
            Double saldoPermitido = saldo*(5/100);
            setSaldo(saldo-saldoPermitido);
        }


    }
}
