package nuevo;
import javax.swing.JOptionPane;



public class Usuario {
    //atributos se encapsulan en private para que no se puedan acceder directamanete
    private String nombre;
    private String contrasenia;
    private int puntosUsuario;
    private int posicion;
    


    //constructor clase usuario
    Usuario(String nombre, String contrasenia, int puntosUsuarios){ //puntos usuario no, porque el nuevo usuario no tiene puntos
        // unimos el nombre recibido con el atributo de la clase
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.puntosUsuario = puntosUsuarios; //arranca en cero, aca no hace falta poner this
        this.posicion = -1;
    }
    public int getPosicion(){
        return this.posicion;
    }

    public void setPosicion(int posicion){//void procedimiento
        this.posicion = posicion;

    } 


    // getters trae lo ingresado por el usuario
    public String getNombre(){
        return nombre;
    }
    public String getContrasenia(){
        return contrasenia;
    }
    public int getPuntosUsuario(){
        return puntosUsuario;

    }
    // setters
    public void setNombre(String nombre){//void procedimiento
        this. nombre = nombre;

    } 
    public void setContrasenia (String contrasenia){
        this.contrasenia = contrasenia;

    }
    public void setPuntosUsuario (int puntosUsuario){
        this.puntosUsuario = puntosUsuario;
    }

    public void sumarPuntos(){
         this.puntosUsuario ++;
    }

    public void imprimirPuntos(){
        JOptionPane.showMessageDialog(null, "Mis puntos son: " + this.puntosUsuario);    
    }

}
