package Clase911.ejercicioSala;

public class Nave extends Objeto{
    double velocidad;
    int vida;

    public Nave(int posx, int posy, char direccion, double velocidad, int vida) {
        super(posx, posy, direccion);
        this.velocidad = velocidad;
        this.vida = vida;
    }

    @Override
    public void irA(int x, int y, char direccion) {
        super.irA(x, y, direccion);
    }

    public void girar(char direccion){





    }

    public void restaVida (int valor){

    }




}
