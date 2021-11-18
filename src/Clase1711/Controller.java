package Clase1711;

public class Controller {
    public static void main(String[] args) {

        Capitan capitan = new Capitan("Carlos","Rojas","abcd111");

        Yate yate = new Yate (capitan,1000.2,200.5,2022,3,10);
        Yate yate2 = new Yate (capitan,1000.2,200.5,2022,3,10);



        System.out.println(yate.compareTo(yate2));







    }
}
