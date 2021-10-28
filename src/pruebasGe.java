

public class pruebasGe {

    private String nombre;
    private String apellido;

    public static void fizzBuzz(int n) {
        // Write your code here

        for (int i=1;i<=n;i++){

            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else {

                if (i % 3 == 0) {
                    String fizz = String.valueOf(i);
                    System.out.println("Fizz");
                }

                if (i % 5 == 0) {
                    String buzz = String.valueOf(i);
                    System.out.println("Buzz");

                }
                if(i%3!=0 && i%5!=0){
                    System.out.println(i);
                }


            }
        }





    }

}
