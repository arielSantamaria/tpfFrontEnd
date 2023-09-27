package nuevo;
import java.util.List;
import java.util.ArrayList;
import java.io.File;




public class Archivo {
 
    public static void modificarPuntos(Usuario usuario, File listaUsuarios){ 
        //creamos metodo para modificar los datos de los usuarios
        
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = App.traerListaUsuarios(listaUsuarios);
        //Busco del arreglo de usuarios [usuario1,usuario2], busco el usuario por posicion
         //ejemplo usuario2 y le modifico el puntaje 
        usuarios.get(usuario.getPosicion()).setPuntosUsuario(usuario.getPuntosUsuario());
        App.borrar();
        //borramos App
        App.archivoUsuarios(listaUsuarios, usuarios);
    }
}
 