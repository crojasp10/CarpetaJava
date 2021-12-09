package Clase2311;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

    private List<Contenedor> listaContenedor ;


    void mostrarContenedores(){

        this.listaContenedor.sort(null);

        }

    void ingresarContenedor(Contenedor contenedor){
        this.listaContenedor.add(contenedor);
    }

    void cantidadContenedore (){
        this.listaContenedor.size();
    }



}
