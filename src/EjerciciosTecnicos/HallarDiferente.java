package EjerciciosTecnicos;

import java.util.ArrayList;
import java.util.List;

public class HallarDiferente {


    public static void numeroDistinto(List lista){
        List noRepetido = new ArrayList();
        for (int i = 0; i <lista.size() ; i++) {
            Integer contador = 0;
            for (int j = 0; j < lista.size(); j++) {
                if(lista.get(i)==lista.get(j)){
                    contador +=1;
                }
            }
            if (contador == 1){
                noRepetido.add(lista.get(i));
            }
            }
        System.out.println("El diferente es " + noRepetido);
       }


    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add(1);
        lista.add(5);
        lista.add(8);
        lista.add(7);
        lista.add(7);
        lista.add(8);
        lista.add(5);


        HallarDiferente.numeroDistinto(lista);

    }



}
