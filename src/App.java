import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class App {

        public static void main(String[] args) throws Exception {
/*
            System.out.println("Hello, World!");

            Empleado Empleado1 = new Empleado("Bojana", "llamar");
            System.out.println(Empleado1.presentarse());
            System.out.println(Empleado1.Edad());

            C2S.llamarPersona();
            C2S.esDivisible();
            C2S.maximoEntreTresNumeros();

            C2S c2s = new C2S();
            System.out.println(c2s.cadenasDeTextoDistintas());


            Clase3Java ejercicioPrueba = new Clase3Java();

            System.out.println(ejercicioPrueba.salario(50));


            List<Long> a = new ArrayList<Long>(5) ;
            a.add(1000000001L);
            a.add(1000000002L);
            a.add(1000000003L);
            a.add(1000000004L);
            a.add(1000000005L);

            System.out.println(Clase3Java.aVeryBigSum(a));
            List<Integer> arr = List.of(1, 1, 0, -1,-1);

            Clase3Java.plusMinus(arr);


            pruebasGe.fizzBuzz(15);
            var  Empleado1 = new Empleado("Bojana", "llamar");
*/





            UsuarioJuego miUsuario = new UsuarioJuego("Jhon","abcdj1233");



            miUsuario.aumentarNivel();
            miUsuario.aumentarNivel();
            miUsuario.aumentarPuntaje();
            miUsuario.aumentarPuntaje();
            miUsuario.bonus(5);
            System.out.println(miUsuario.getNivel());
            System.out.println(miUsuario.getPuntaje());


        }
}
