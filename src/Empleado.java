import java.io.Console;
import java.util.Scanner;

public class Empleado {
    String nombre;
    String labor;
    String respuesta;

    public Empleado(String nombre, String labor) {
        this.nombre = nombre;
        this.labor = labor;
    }

    public String presentarse() {
        return "Mi nombre es " + nombre + " y mi cargo es " + labor;
    }

    public String Edad() {
        System.out.println("Cuál es la edad del empleado?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 20) respuesta = " Es un gecho";
         else {
            respuesta = "Es una persona joven";
        }
        return respuesta;
    }
}

