package Abstract;

public abstract class AbstractPerro {

    private String nombre;
    private String edad;

    public String ladrar() {
        var respuesta = String.format("El perro tiene %s años, su nombre es %s y está ladrando ",edad,nombre);
        return respuesta;
    }
    public abstract String jugar();


}
