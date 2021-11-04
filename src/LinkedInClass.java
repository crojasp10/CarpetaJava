import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class LinkedInClass {




  public static void formateandoInicialmente(){

    var doubleValue = 10_000_000.53;

    var numF = NumberFormat.getNumberInstance();
      System.out.println("Number: " + numF.format(doubleValue));

    var intf = NumberFormat.getIntegerInstance();
      System.out.println("Number: " + intf.format(doubleValue));

    var locale = Locale.getDefault();
    var localeFormatter = NumberFormat.getNumberInstance(locale);
      System.out.println(localeFormatter.format(doubleValue));



      var df = new DecimalFormat("$00.00");
      System.out.println(df.format(1));

    }

    public void formateandoValores() {

      var item = "shirt";
      var size = "M";
      var price = 20.000;
      var color = "rojo";

      var template = "Clothing item: %s, size %s, color %s, $%f";
      var itemString = String.format(template,item,size,color,price);

      System.out.println(itemString);
  }


  public static void crearMap(){
        Map<Integer,String> items = new HashMap<>();

        items.put(2,"Carro");
        items.put(3,"Moto");
        items.put(4,"Camión");
        items.put(5,"Bus");
        items.put(6,"Bici");

        var keys = items.keySet();
        for (Integer key: keys
             ) {
            System.out.println(items.get(key));
        }


    }



}
