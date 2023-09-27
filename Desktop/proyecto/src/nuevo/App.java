package nuevo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class App { //Clase app 
    public static void menuUsuario(File listaUsuarios, List<Usuario> usuarios, Scanner sc) {
        JOptionPane.showMessageDialog(null, 
                "BIENVENIDO A LA APP DE JUEGOS DE SIN CODIFICAR\n"); // Pantalla que lanza un mensaje por ventana mas no por consola

        String[] options = {"CREAR USUARIO", "INICIAR SESION", "SALIR"};
        int opcion = JOptionPane.showOptionDialog(null, "Seleccione una opción:", "Menú Usuario", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
        // Pantalla con ventana con interaccion directo con el usuario
        switch (opcion) { 
            case 0:
                crearUsuario(listaUsuarios, usuarios, sc); //Procedimientos
                menuUsuario(listaUsuarios, usuarios, sc); // Procedimentos
                break;
            case 1:
                Usuario usuarioConectado = iniciarSesion(listaUsuarios, usuarios, sc);
                if (usuarioConectado != null) {// Si usuario conectado (Creado) es diferente a null me permitira ingresar al mune de juegos
                    menuJuegos(listaUsuarios, usuarios, usuarioConectado, sc);// Procedimientos que da opciones para poder ingresar a los juegos
                } else { 
                    JOptionPane.showMessageDialog(null, "No se ha podido iniciar sesión");//Pantalla que lanza un mensaje por ventana
                    menuUsuario(listaUsuarios, usuarios, sc);
                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Gracias por usar la App de juegos, nos vemos luego");
                System.exit(0);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta");
                menuUsuario(listaUsuarios, usuarios, sc);
                break;
        }
    }

    public static void crearUsuario(File listaUsuarios, List<Usuario> usuarios, Scanner sc) {
     //   JOptionPane.showMessageDialog(null, "Entraste a Crear Usuario");

       String nombre = JOptionPane.showInputDialog(null, "Nombre:"); //Guarda el nombre ingresado por usuario mediante una ventana 


        if(nombre != null){
        String contrasenia = JOptionPane.showInputDialog(null, "Ingresá una Contraseña:");// Ingresa contrasena por ventana

            if(contrasenia!=null){
                usuarios.add(new Usuario(nombre, contrasenia, 0)); 
                //puntos en cero por ser usuario nuevo

                if(nombre.length()>0 && contrasenia.length()>0){
                    // Crear un metodo donde le pasamos el nombre como variable y devuelve un booleano si 
                    // el usuario ya se encuentra devuelve true, sino sevuelve false y lo crea.
 
                    archivoUsuarios(listaUsuarios, usuarios);// Un procedimiento donde lee el Txt. guardado
                    JOptionPane.showMessageDialog(null, "Usuario creado correctamente. Bienvenida/o " + nombre);
                }else {
                    JOptionPane.showMessageDialog(null, "No se puede crear un usuario con nombre o contraseña vacios");
                }
            }
        }

    }

    public static Usuario iniciarSesion(File listaUsuarios, List<Usuario> usuarios, Scanner sc) {
      //  JOptionPane.showMessageDialog(null, "Entraste a Iniciar Sesión");

        String nombre = JOptionPane.showInputDialog(null, "Nombre:");
        String contrasena = JOptionPane.showInputDialog(null, "Contraseña:");
        int pos = -1;

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getNombre().equals(nombre)) {
                pos = i;
            }
        }

        if (pos == -1) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            return null;
        } else {
            if (usuarios.get(pos).getContrasenia().equals(contrasena)) {
                JOptionPane.showMessageDialog(null, "Sesión iniciada");
                usuarios.get(pos).setPosicion(pos);
                return usuarios.get(pos);
            } else {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                return null;
            }
        }
    } 

    public static void menuJuegos(File listaUsuarios, List<Usuario> usuarios, Usuario usuarioConectado, Scanner sc) {
        boolean jugar = false;

        do {
            //JOptionPane.showMessageDialog(null, "MENU JUEGOS\n");

            String[] options = {"RULETA", "PREGUNTADOS", "PIEDRA / PAPEL / TIJERA", "CONSULTAR MIS PUNTOS" , "REINICIAR CONTADOR", "CERRAR SESION"};
            int opcion = JOptionPane.showOptionDialog(null, "MENU JUEGOS ¿Qué te gustaría jugar?", "Menú Juegos", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);

            switch (opcion) {
                case 0:
                    jugar = Rulet.ruletaSuerte(usuarioConectado,listaUsuarios);
                    break;
                case 1:
                    jugar = Preg.preguntaDos(usuarioConectado,listaUsuarios);
                    break;
                case 2:
                    jugar = Ppt.piedraPapelTijera(usuarioConectado,listaUsuarios);
                    break;
                case 3:
                    // Consultar mis puntos
                    usuarioConectado.imprimirPuntos();
                    break;
                case 4:
                    // Borrar puntos
                    usuarioConectado.setPuntosUsuario(0);
                    Archivo.modificarPuntos(usuarioConectado, listaUsuarios);
                    JOptionPane.showMessageDialog(null, "Se ha reiniciado tus puntos.");
                    break;
                case 5:
                    App.menuUsuario(listaUsuarios, usuarios, sc);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
                    break;
            }
        } while (!jugar);
    }

    public static void archivoUsuarios(File listaUsuarios, List<Usuario> usuarios) {
        try {
            FileWriter lectorarchivo = new FileWriter(listaUsuarios);
            for (Usuario usuario : usuarios) {
                lectorarchivo.write(usuario.getNombre() + "," + usuario.getContrasenia() + "," + usuario.getPuntosUsuario() + "\n");
            }
            lectorarchivo.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al crear el archivo " + e);
        }
    }


    public static void borrar() {
        // Ruta al archivo de texto
        String rutaArchivo = "carpetaUsuarios\\listadoUsuarios.txt";

        try {
            // Abre el archivo en modo de escritura
            FileWriter writer = new FileWriter(rutaArchivo);

            // Escribe una cadena vacía
            writer.write("");

           
            writer.close();

          //  System.out.println("Contenido del archivo borrado correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al intentar borrar el contenido del archivo: " + e.getMessage());
        }
    }



    public static List<Usuario> traerListaUsuarios(File listaUsuarios) {
        List<Usuario> listaPorAhora = new ArrayList<Usuario>();

        try {
            Scanner sc = new Scanner(listaUsuarios);

            while (sc.hasNextLine()) {
                String datos = sc.nextLine();
                String[] atributoUsuarios = datos.split(",");
                //convierto el dato de puntaje a int para escribirlo
                int puntos = Integer.parseInt(atributoUsuarios[2]);
                listaPorAhora.add(new Usuario(atributoUsuarios[0], atributoUsuarios[1], puntos));
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }

        return listaPorAhora;
    }

    public static void main(String[] args) throws Exception {
        File folder = new File("carpetaUsuarios");
        boolean folderNuevo = folder.mkdir();

        File listaUsuarios = new File("carpetaUsuarios\\listadoUsuarios.txt");
        boolean fileCreated = listaUsuarios.createNewFile();

        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios = traerListaUsuarios(listaUsuarios);
        Scanner sc = new Scanner(System.in);
        App.menuUsuario(listaUsuarios, usuarios, sc);
    }

    @Override
    public String toString() {
        return "App []";
    }
}
