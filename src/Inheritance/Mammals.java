package Inheritance;

public class Mammals implements Animal{

    int paws;
    String sound;


    public Mammals(int paws, String sound) {
        this.paws = paws;
        this.sound = sound;
    }

    public String howManyPaws(){
        var itemString = String.format("La cantidad de patas son %s y el sonido es: %s",paws,sound);
        return itemString;
    }


    public String whatSound(){
        return "the animal does like: " + sound;
    }


    @Override
    public void characteristic() {
        System.out.println("Drink milk");
    }
}
