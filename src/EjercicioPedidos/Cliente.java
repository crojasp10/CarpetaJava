package EjercicioPedidos;

import java.text.DecimalFormat;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Cliente {

    String nombre;
    String teleforno;
    String domicilio;
    ArrayList <Item> miLista = new ArrayList();


    public ArrayList getMiLista() {
        return miLista;
    }

    public Item generarItem(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe qué vas a ordenar:");
        System.out.println("1.Comida");
        System.out.println("2.Ropa");
        System.out.println("3.Libros");

        var orden = scanner.nextLine();
        System.out.println("Escribe la cantidad");
        int cantidad = 0;
        cantidad = scanner.nextInt();
        int precio = 0;
        int total = 0;
        String producto = "este";

        switch (orden) {
            case "1":
                producto = "Comida";
                precio = 10;
                total = precio * cantidad;
                break;
            case "2":
                producto = "Ropa";
                precio = 20;
                total = precio * cantidad;
                break;
            case "3":
                producto = "Libros";
                precio = 30;
                total = precio * cantidad;
                break;
        }
        Item miItem = new Item(producto, precio,cantidad,total);
        miLista.add(miItem);
        return miItem;
    }


    public void verPedido() {

         String resultado = "";
         if(miLista.size()==0) System.out.println("No hay nada en la canasta");
         else {
            for (int i = 0; i < miLista.size(); i++) {
                var df = new DecimalFormat("0000");
                String miCodigoString = df.format(i+1);
                Instant fecha = Instant.now();
                Item  item = new Item(miLista.get(i).nombre,miLista.get(i).precio,miLista.get(i).cantidad, miLista.get(i).total);
                Pedido pedido = new Pedido(miCodigoString,fecha,item);
                resultado = String.format("El producto seleccionado es: %s, con código %s la cantidad es: %s" +
                        "  y el valor de su compra es: %s. fecha = %s",pedido.item.nombre,pedido.codigo, pedido.item.cantidad,
                            pedido.item.total,pedido.fecha);
                System.out.println(resultado);
            }
        }

    }


     public void iniciarPedido() {
         Scanner scanner = new Scanner(System.in);
         String opcion;
         do {
             System.out.println("Escribe tu opción:");
             System.out.println("1.Comprar.");
             System.out.println("2.Ver pedido.");
             System.out.println("3.Salir");
             opcion = scanner.nextLine();
             switch (opcion) {
                 case "1":
                     generarItem();
                     break;
                 case "2":
                     verPedido();
                     break;

             }
         }
             while (!opcion.equals("3")) ;

     }



    }



