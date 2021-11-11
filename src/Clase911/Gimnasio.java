package Clase911;

public class Gimnasio {
    public static void main(String[] args) {
        System.out.println("En la main");

        Socio miSocio = new Socio("0011","Roque",1.500,"Economista");
        System.out.println(miSocio);


         var miSocio2 = new SocioHabilitado("002","Rojas",1.200,"IngSoftware",1.100);
            miSocio2.setHabilitado(true);
        System.out.println(miSocio2.CostoMensual());


    }


}
