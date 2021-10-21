import java.util.Scanner;

public class C2S {

    public static void llamarPersona(){
        System.out.println("Ingrese su nombre");
        Scanner scanner = new Scanner(System.in);
        String nombre = scanner.nextLine();
        char letraInicialNombre = nombre.charAt(0);

        System.out.println("Ingrese su apellido");
        String apellido = scanner.nextLine();
        char letraInicialApellido = apellido.charAt(0);

        System.out.println("Ingrese su nombre");
        int edad = scanner.nextInt();

       System.out.println("La letra inicial es "+ letraInicialNombre + ", inicial apellido es "+ letraInicialApellido + ", la edad es"+ edad);
    }
//Ejercicio1
    public static void esDivisible(){
        System.out.println("Escribe el primer número");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        int contadorDivisibles = 1;
        int contadorCiclos = 2;
        while (contadorDivisibles<=1 && contadorCiclos < num1 ){
            if (num1%contadorCiclos==0) ++contadorDivisibles;
            ++contadorCiclos;
        }
        boolean resultado = contadorDivisibles>1 ? false: true;
        System.out.println(resultado);
    }
//Ejercicio2

    public static void maximoEntreTresNumeros() {

        System.out.println("Escribe el primer número");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();

        System.out.println("Escribe el segundo número");
        int num2 = scanner.nextInt();

        System.out.println("Escribe el tercer número");
        int num3 = scanner.nextInt();


        if (num1 > num2 && num1 > num3) {
            System.out.println("El mayor es  " + num1);

        } else if (num2 > num1 && num2 > num3) {

            System.out.println("El mayor es  " + num2);
        } else {
            System.out.println("El mayor es  " + num3);

        }

    }

    //Ejercicio3

    public boolean cadenasDeTextoDistintas(){

        System.out.println("Escribe la primer palabra");
        Scanner scanner = new Scanner(System.in);
        String palabra1 = scanner.nextLine();

        System.out.println("Escribe la segunda palabra");
        String palabra2 = scanner.nextLine();

        boolean comparacion = palabra1.equals(palabra2);
        return comparacion;
    };




}
