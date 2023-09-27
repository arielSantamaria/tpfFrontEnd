package nuevo;




import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class Ppt {
    

    // funciona porque es una funcion estatica, permite este metodo ser llamado en el main sin crear una instacia de 
    // Ppt, en este caso se utiliza manejo de errores entonces es indispensable usar ty catch del otro lado sino rompe
    public static Boolean piedraPapelTijera(Usuario usuario, File listaUsuarios){  
        //Boolean para que devuelva true o false para seguir jugando o ir al menu de juegos
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int eleccionCompu;
        
        String opcionUsuario;
        String eleccionCompuTexto;  // Convertir la elección de la computadora a una cadena de texto va a servir para el switch
        String seguir;
        
        do{
            int contUsuario = 0; 
            int contCompu = 0;
            
                    System.out.println( "      BIENVENIDO AL FAMOSO JUEGO");
                    System.out.println("========================================");
                    System.out.println("||       PIEDRA PAPEL O TIJERA        ||");
                    System.out.println("========================================");


                    System.out.println("¿Estás preparado? Jugamos al mejor de tres");
                    System.out.println("Escribi salir para volver al menu principal");
                    
                while (contUsuario < 3 && contCompu < 3) { // Jugar al mejor de tres

                    
                        System.out.println("Elige PIEDRA, PAPEL o TIJERA: "); // Le pedimos la opcion al usuario
                        opcionUsuario = sc.nextLine().toUpperCase(); //El usuario ingresa la opcion y la convierte a mayusculas por si se ingresa en minusculas
                        System.out.println("Elegiste " + opcionUsuario);

                        // Verificar que la elección del usuario sea válida + opcion para volver al menu de juegos
                        if (!opcionUsuario.equals("PIEDRA") && !opcionUsuario.equals("SALIR") && !opcionUsuario.equals("PAPEL") && !opcionUsuario.equals("TIJERA")) {
                            System.out.println("Elección inválida. Debes elegir PIEDRA, PAPEL o TIJERA.");
                            continue; // Si está todo bien continúa el programa.
                        } 

                        if( opcionUsuario.equals("SALIR")){
                            System.out.println("Hasta luego");
                            return false; // si la opcion es SALIR el Boolean retorna falso y vuelve al menu de juegos
                        }

                    // Generar la elección de la computadora
                    eleccionCompu = random.nextInt(3); // 1 = piedra, 2 = papel, 3 = tijera
                    
                    switch (eleccionCompu) {
                        case 1:
                            eleccionCompuTexto = "PIEDRA";
                            break;
                        case 2:
                            eleccionCompuTexto = "PAPEL";
                            break;
                        default:
                            eleccionCompuTexto = "TIJERA";
                    }
                    System.out.println("La computadora eligió: " + eleccionCompuTexto);

                    // Determinar el ganador de la partida
                    if (opcionUsuario.equals(eleccionCompuTexto)) {
                        System.out.println("Empate.");
                        
                    } else if ((opcionUsuario.equals("PIEDRA") && eleccionCompuTexto.equals("TIJERA")) ||
                            (opcionUsuario.equals("PAPEL") && eleccionCompuTexto.equals("PIEDRA")) ||
                            (opcionUsuario.equals("TIJERA") && eleccionCompuTexto.equals("PAPEL"))) {
                        System.out.println("¡GANASTE!");


                    contUsuario++;
                    usuario.sumarPuntos();
                    Archivo.modificarPuntos(usuario, listaUsuarios);



                        System.out.println("Usuario " + (contUsuario) + " Compu "+ (contCompu));
                    } else {
                        System.out.println("La computadora ganó la partida :( ");
                    contCompu++;
                    
                    System.out.println("Usuario " + (contUsuario) + " Compu "+ (contCompu));
                    }

                }

                // Informar el resultado del juego
                if (contUsuario > contCompu) {
                    System.out.println("¡Ganaste el juego!");
                } else {
                    System.out.println("La computadora ganó el juego.");
                }
                
                do{
                    System.out.println("¿Querés jugar de nuevo? S / N");
                    seguir = sc.nextLine().toUpperCase();
                    
                            if (!seguir.equals("S") && !seguir.equals("N")){
                                System.out.println("Elección inválida. Debes elegir S o N.");
                            }

                        } while (!seguir.equals("S") && !seguir.equals("N"));
                    
                         
                        
                        if (!seguir.equals("S")){
                            System.out.println("Gracias por jugar");
                            
                            return false; // si la opcion es N el Boolean retorna falso y vuelve al menu de juegos
                            
                                       
                        }
                        
                        
                    
                       
        }while (seguir.equals("S"));         
        return true; //Si la opcion es S retorna true y se ejecuta nuevamente el juego.
    }   
}
