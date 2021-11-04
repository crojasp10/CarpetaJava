package Inheritance;

public class Dog extends Mammals{

    int speed;
    public static final String SOUND = "guau";

    public Dog(int paws, String sound, int speed) {
        super(paws, sound);
        this.speed = speed;
    }



    @Override
    public String howManyPaws() {
        return "The dog has "+ paws ;
    }






}
