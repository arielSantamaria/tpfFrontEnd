package nuevo;



import java.io.File;
import java.util.Random;
import java.util.Scanner;



public class Preg {

    public static Boolean preguntaDos(Usuario usuario, File listaUsuarios) {
        
    
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num;    
        int opcion; 
        int contUsuario = 0;
        String eleccion;
          
        
            
                    System.out.println ("Bienvenido a Preguntados. Empecemos!!");
                    System.out.println("#######################################");
                    System.out.println("Te puede tocar entre cinco categorias");

         do{             
                      
                    num =random.nextInt(5);
                    switch (num){
                        case 1:
                            System.out.println("TE TOCO RESPONDER GEOGRAFIA");
                            num =random.nextInt(3);
                            switch(num){
                                case 1:

                            
                                    System.out.println("¿Cual es el idioma que mas se habla en el mundo ? ");
                                    System.out.println( " 1: Ingles ");
                                    System.out.println( " 2: Mandarin ");
                                    System.out.println( " 3: Español");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==2){
                                        System.out.println(" Has ganado, el idioma mas hablado en el mundo es el mandarin " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, has perdido, el idioma mas hablado es el mandarin "); 
                                    } break;
                                
                                case 2:

                            
                                    System.out.println("¿Cual es el pais mas grande deL mundo ? ");
                                    System.out.println( " 1: Brasil ");
                                    System.out.println( " 2: China ");
                                    System.out.println( " 3: Rusia");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==3){
                                        System.out.println(" Has ganado, el pais mas grande del mundo es Rusia " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, has perdido, el pais mas grande es Rusia ");
                                    } break;

                                default:

                            
                                    System.out.println("¿Cual es el pais mas visitado de el mundo ? ");
                                    System.out.println( " 1: Francia ");
                                    System.out.println( " 2: Estados Unidos ");
                                    System.out.println( " 3: Italia");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==1){
                                        System.out.println(" Has ganado, el pais mas visitado del mundo es Francia " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, has perdido, el pais mas visitado del mundo es Francia "); 
                                    } break;                  
            
                            }

                    break;
                        case 2:
                        System.out.println("TE TOCO RESPONDER DEPORTE");
                        num =random.nextInt(3);
                            switch(num){
                                case 1:


                                    System.out.println("¿Quien es el ultimo campeon de Roland Garros ? ");
                                    System.out.println( " 1: Novak Djokovic ");
                                    System.out.println( " 2: Carlos Alcaraz ");
                                    System.out.println( " 3: Rafael Nadal");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==1){
                                        System.out.println(" Has ganado, el ultimo ganador de Roland Garros Novak Djokovic " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, el ultimo ganador de Roland Garros Novak Djokovic  "); 
                                    } break;
                    
                                case 2 :

                            
                                    System.out.println("¿En que deporte se  utiliza un solo guante para atrapar la pelota ? ");
                                    System.out.println( " 1: Futbol ");
                                    System.out.println( " 2: Rugby ");
                                    System.out.println( " 3: Beisbol");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==3){
                                        System.out.println(" Has ganado, el deporte que se utiliza un solo guante para agarrar la pelota en el Beisbol " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, el deporte que se utiliza un solo guante para agarrar la pelota en el Beisbol  ");
                                    } break;

                                default :

                            
                                    System.out.println("¿Quien convirtio el ultimo penal para Argentina en la final del mundial en Qatar ? ");
                                    System.out.println( " 1: Messi ");
                                    System.out.println( " 2: Montiel ");
                                    System.out.println( " 3: Maradona");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==2){
                                        System.out.println(" Has ganado, el ultimo penal para Argentina en Qatar lo patio Montiel " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, el ultimo penal para Argentina en Qatar lo patio Montiel  ");
                                    } break;
                            } 
                    break;
                    
                        case 3:
                        System.out.println("TE TOCO RESPONDER ARTE");
                        num =random.nextInt(3);
                            switch(num){   
                                case 1 :  
                                
                                
                                    System.out.println("¿Que pintor es el autor de Guernica ? ");
                                    System.out.println( " 1: Salvador Dali ");
                                    System.out.println( " 2: Pablo Picasso ");
                                    System.out.println( " 3: Leonardo Da Vinci");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==2){
                                        System.out.println(" Has ganado, el autor de GUernica es Pablo Picasso " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, el autor de GUernica es Pablo Picasso ");
                                    } break;

                                case 2 :        
                                    System.out.println("¿Cual es el nombre del caballo de Don Quijote de la Mancha ? ");
                                    System.out.println( " 1: Pegaso ");
                                    System.out.println( " 2: Platero ");
                                    System.out.println( " 3: Rocinante");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==3){
                                        System.out.println(" Has ganado, el caballo de Don Quijote se llamaba Rocinante " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);      
                                    }else{ 
                                        System.out.println("Lo lamento, el caballo de Don Quijote se llamaba Rocinante ");
                                    } break;

                                default :
                                
                                
                                    System.out.println("¿Que tipo de instrumento es una citara ? ");
                                    System.out.println( " 1: de cuerda ");
                                    System.out.println( " 2: de percusion ");
                                    System.out.println( " 3: de viento");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==1){
                                        System.out.println(" Has ganado, la citara es un instrumento de cuerda " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);   
                                    }else{ 
                                        System.out.println("Lo lamento, la citara es un instrumento de cuerda ");
                                    } break;
                            } 
                    break;

                        case 4:
                        System.out.println("TE TOCO RESPONDER HISTORIA");
                        num =random.nextInt(3);

                            switch(num){  
                                case 1 :
                                
                                
                                    System.out.println("¿Como se conocia la primer guerra mundial antes que estallara la segunda guerra ? ");
                                    System.out.println( " 1: La gran guerra ");
                                    System.out.println( " 2: El holocausto ");
                                    System.out.println( " 3: La caida imperiosa");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==1){
                                        System.out.println(" Has ganado,la primera guerra mundial fue llamada La gran guerra ");
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, la primera guerra mundial fue llamada La gran guerra ");
                                    }  break;
                    
                                case 2 : 
                                
                                
                                    System.out.println("¿Que suceso marca la era antigua con el inicio de la edad media ? ");
                                    System.out.println( " 1: La civilizacion Romana ");
                                    System.out.println( " 2: El desarrollo del idioma latin ");
                                    System.out.println( " 3: La caida del Imperio Romano");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==3){
                                        System.out.println(" Has ganado, el suceso que marca ambos tiempos es La caida del Imperio Romano" );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, el suceso que marca ambos tiempos es La caida del Imperio Romano ");
                                    }  break;
                    
                                default :        
                                    System.out.println("¿En que año se disolvio la Union Sovietica ? ");
                                    System.out.println( " 1: 1991 ");
                                    System.out.println( " 2: 1975 ");
                                    System.out.println( " 3: 1967");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==1){
                                        System.out.println(" Has ganado, la Union Sovietica se disolvio en el año 1991 " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);  
                                    }else{ 
                                        System.out.println("Lo lamento,  la Union Sovietica se disolvio en el año 1991 ");
                                    }  break;
                            } 

                    break;

                        default:
                        System.out.println("TE TOCO RESPONDER CIENCIA");
                        num =random.nextInt(3);

                            switch(num){ 
                                case 1 :      
                                
                                
                                    System.out.println("¿cuales son los primeros 4 decimales de un nro PI ? ");
                                    System.out.println( " 1: 1210 ");
                                    System.out.println( " 2: 1415 ");
                                    System.out.println( " 3: 1417 ");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==2){
                                        System.out.println(" Has ganado, los 4 primero decimales de un nro PI son 1415 " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, los 4 primero decimales de un nro PI son 1415  ");
                                    } break;

                                case 2 :   
                            
                            
                                    System.out.println("¿Cual es la velocidad de la luz ? ");
                                    System.out.println( " 1: 300.000 KM/H ");
                                    System.out.println( " 2: 250.000 KM/h ");
                                    System.out.println( " 3: 100.000 KM/H ");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==1){
                                        System.out.println(" Has ganado, la velocidad de la luz es de 300.000 KM/H " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, la velocidad de la luz es de 300.000 KM/H  ");
                                    } break;
                                    
                                default :        
                                    System.out.println("¿Como se le llama a la ciencia que estudia la sangre ? ");
                                    System.out.println( " 1: Hematograma ");
                                    System.out.println( " 2: Hemorragia ");
                                    System.out.println( " 3: Hematologia ");
                                    opcion=sc.nextInt();
                                    sc.nextLine();
                                    if (opcion==3){
                                        System.out.println(" Has ganado,la ciencia que se dedica al estudio de la sangre es llamada hematologia " );
                                        contUsuario++;
                                        usuario.sumarPuntos();
                                        Archivo.modificarPuntos(usuario, listaUsuarios);
                                    }else{ 
                                        System.out.println("Lo lamento, la ciencia que se dedica al estudio de la sangre es llamada hematologia  ");
                                    } break;
                            }       
                    break;
                    
                    }       
                        do{
                    
                            System.out.println("¿Queres seguir jugando? S / N");
                                eleccion = sc.nextLine().toUpperCase();
                                
                    
                                    if (!eleccion.equals("S") && !eleccion.equals("N")){
                                    System.out.println("Elección inválida. Debes elegir S o N");
                                    }

                        } while (!eleccion.equals("S") && !eleccion.equals("N"));
                    
                            if(!eleccion.equals("S")) {
                                    System.out.println("Gracias por jugar");
                                    return false;
                                
                    
                                }                   
        } while (eleccion.equals("S"));              
        return true;         
            
               

                


    }
    
}


