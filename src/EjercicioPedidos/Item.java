package EjercicioPedidos;

public class Item {

    String nombre;
    Integer precio;
    Integer total;
    Integer cantidad;

    public Item(String nombre, Integer precio, Integer cantidad,Integer total) {
        this.nombre = nombre;
        this.precio = precio;
        this.total = total;
        cantidad = cantidad;
    }
}
