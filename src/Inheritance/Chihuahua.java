package Inheritance;

public class Chihuahua extends Dog{
    String name;

    public Chihuahua(int paws, String sound, int speedd, String name) {
        super(paws, sound, speedd);
        this.name = name;
    }

    public String howManyPaws(){
        return String.format("The chihuahua has %s paws, it's called %s, its speed is: %s, and makes like %s",paws,name,speed,sound);
    }



}
