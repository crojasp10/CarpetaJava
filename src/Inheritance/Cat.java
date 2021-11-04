package Inheritance;

public class Cat extends Mammals{

    boolean climb;

    public Cat(int paws, String sound, boolean climb) {
        super(paws, sound);
        this.climb = climb;
    }

    public String whatSound(){
        return "The cat does like " + sound;
    }



}
