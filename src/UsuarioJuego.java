public class UsuarioJuego {

    private String nombre;
    private String clave;
    private Double puntaje = 0.0;
    private Integer nivel = 0;


    public UsuarioJuego(String name, String password){
        nombre=name;
        clave = password;
    }

    public void aumentarPuntaje(){puntaje++;}
    public void  aumentarNivel(){nivel++;}
    public void bonus (int valor){puntaje += valor;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public String getClave() {return clave;}
    public void setClave(String clave) {this.clave = clave;}

    public Double getPuntaje() {return puntaje;}
    public void setPuntaje(Double puntaje) {this.puntaje = puntaje;}

    public Integer getNivel() {return nivel;}
    public void setNivel(Integer nivel) {this.nivel = nivel;}

}