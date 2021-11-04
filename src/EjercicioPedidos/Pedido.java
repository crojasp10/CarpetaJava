package EjercicioPedidos;

import java.time.Instant;
import java.util.Date;

public class Pedido {

    String codigo;
    Instant fecha;
    Item item;

    public Pedido(String codigo, Instant fecha, Item item) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.item = item;
    }
}
