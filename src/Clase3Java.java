import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Clase3Java {

    String cualGana() {

        int puntajeJugador1 = 0;
        int puntajeJugador2 = 0;
        String opcionDeseada;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escrtibe el nombre del jugador 1");
        String jugador1 = scanner.nextLine();

        System.out.println("Escrtibe el nombre del jugador 2");
        String jugador2 = scanner.nextLine();

        do {
            System.out.println();
            System.out.println("Selecciona la opción deseada");
            System.out.println("1.Jugar piedra, papel, tijera o spock");
            System.out.println("2.Ver puntaje");
            System.out.println("3.Salir del juego");
            opcionDeseada = scanner.nextLine();
            int testear = Integer.parseInt(opcionDeseada);
            if (testear>4 || testear<=0) System.out.println("Comando erróneo, sigue jugando");
            System.out.println();
            switch (opcionDeseada){
                case "1":
                    System.out.println("juega "+jugador1);
                    System.out.println("1.Piedra");
                    System.out.println("2.Papel");
                    System.out.println("3.Tijera");
                    System.out.println("4.Spock");
                    String seleccionJugador1 = scanner.nextLine();

                    System.out.println("juega "+jugador2);
                    System.out.println("1.Piedra");
                    System.out.println("2.Papel");
                    System.out.println("3.Tijera");
                    System.out.println("4.Spock");
                    String seleccionJugador2 = scanner.nextLine();

                    if (seleccionJugador1.equals("1") && seleccionJugador2.equals("2")){
                        ++puntajeJugador2;
                    }
                    else if ( seleccionJugador1.equals("1") && seleccionJugador2.equals("3")){
                        ++puntajeJugador1;
                    }
                    else if ( seleccionJugador1.equals("2") && seleccionJugador2.equals("3")){
                        ++puntajeJugador2;
                    }
                    else if ( seleccionJugador1.equals("2") && seleccionJugador2.equals("1")){
                        ++puntajeJugador1;
                    }
                    else if ( seleccionJugador1.equals("3") && seleccionJugador2.equals("2")){
                        ++puntajeJugador1;
                    }
                    else if ( seleccionJugador1.equals("3") && seleccionJugador2.equals("1")){
                        ++puntajeJugador2;
                    }
                    else if ( seleccionJugador1.equals("4") && seleccionJugador2.equals("1")){
                        ++puntajeJugador1;
                    }
                    else if ( seleccionJugador1.equals("1") && seleccionJugador2.equals("4")){
                        ++puntajeJugador2;
                    }
                    else if ( seleccionJugador1.equals("4") && seleccionJugador2.equals("2")){
                        ++puntajeJugador2;
                    }
                    else if ( seleccionJugador1.equals("2") && seleccionJugador2.equals("4")){
                        ++puntajeJugador1;
                    }
                    else if ( seleccionJugador1.equals("4") && seleccionJugador2.equals("3")){
                        ++puntajeJugador1;
                    }
                    else if ( seleccionJugador1.equals("3") && seleccionJugador2.equals("4")){
                        ++puntajeJugador2;
                    }

                    break;
                case "2":
                    System.out.println("El puntaje de " + jugador1 +" es "+ puntajeJugador1);
                    System.out.println("El puntaje de " + jugador2 +" es "+ puntajeJugador2);

                    if (puntajeJugador1>puntajeJugador2)
                        System.out.println("Va ganando " + jugador1);
                    else if(puntajeJugador2>puntajeJugador1)
                        System.out.println("Va ganando " + jugador2);
                    else System.out.println("Van empatados");

                    break;

            }
        } while (!opcionDeseada.equals("3"));

        return "";
    }


public static void numerosPrimos(){

    Scanner scanner = new Scanner(System.in);
    int numeroIngresado = scanner.nextInt();


}


Integer salario(int cantidadHoras){

    int precioHora = 875;
    int salarioNeto = 0;
    if (cantidadHoras>40){
          int basico = 40 * precioHora;
          int horasExtras = (cantidadHoras-40)*(precioHora/2);
          salarioNeto = basico + horasExtras;
      }
    else if (cantidadHoras<=40){
        salarioNeto = precioHora * cantidadHoras;
    }
    return  salarioNeto;

}

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Integer jugador1 = 0;
        Integer jugador2 = 0;
        // Write your code here

        for (int i = 0; i <= 2; i++) {
            if (a.get(i) == b.get(i)) {
                jugador1 += 0;
                jugador2 += 0;
            } else if (a.get(i) > b.get(i)) {
                ++jugador1;
            } else {
                ++jugador2;
            }
        }
 List<Integer> listaResultado = new ArrayList<Integer>();
        listaResultado.add(jugador1);
        listaResultado.add(jugador2);
        return listaResultado;
    }


    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long resultado = 0000000000;
        for (Long i : ar) {
        resultado = resultado + i;

        }

        return resultado;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int resultado = 0;
        for (int i=0; i<=0;i++){

           int diagonalIzquierda = arr.get(i).get(0) +arr.get(i+1).get(1) +arr.get(i+2).get(2);
           int diagonalDerecha = arr.get(i).get(2) +arr.get(i+1).get(1) +arr.get(i+2).get(0);

            resultado = diagonalIzquierda-diagonalDerecha;

        }

        return Math.abs(resultado);
    }





    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float resultado1= 0f;
        float resultado2= 0f;
        float resultado3= 0f;

for (int i= 0;i< arr.size();i++) {

    if (arr.get(i) == 0) {
        ++resultado3;
    }
    if (arr.get(i) > 0) {
        resultado1 = resultado1+1;
    }
    if (arr.get(i) < 0) {
        ++resultado2;
    }
}
int tamanoList = arr.size();
float proporcionMayoresACero = ((resultado1/tamanoList));
float proporcionMenoresACero = ((resultado2/tamanoList));
float proporcionIgualesACero = ((resultado3/tamanoList));


        DecimalFormat formatter = new DecimalFormat("0.000000");


        System.out.println(formatter.format(proporcionMayoresACero));
        System.out.println(formatter.format(proporcionMenoresACero));
        System.out.println(formatter.format(proporcionIgualesACero));

    }










}







