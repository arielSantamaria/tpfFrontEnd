package nuevo;  
import java.io.File;
import java.util.Random;
import java.util.Scanner;


public class Rulet {
    
    public static Boolean ruletaSuerte(Usuario usuario, File listaUsuarios){ 
        int num, maq, misFichas, fichas;
        String rta="si";
        
        Random r= new Random();
        misFichas=1000;
        int contUsuario = 0;
         
        Scanner miescaner = new Scanner(System.in);
        
        do {
              
            do{
             maq =r.nextInt (37);
              System.out.println("########################################################");
              System.out.println("BIENVENIDO A LA FABULOSA RULETA VIRTUAL ¡¡MUCHA SUERTE!!");
              System.out.println("########################################################");
              System.out.println(maq);
              //podemos ver el numero que sale 
              System.out.println("Tiene " + misFichas + " para apostar" );

              if(misFichas < 0 || misFichas ==0 ){
                System.out.println("Ha perdido el juego lamentablemente, no puede apostar mas" );
                return false;               
              }
              
              
              System.out.println("Ingrese de 0 a 36 su numero de apuesta");
              num=miescaner.nextInt();
            
              System.out.println("ingrese la cantidad de fichas a apostar");
              fichas=miescaner.nextInt();
              
            
               if(num < 0 || num > 36 || misFichas < fichas){
                 System.out.println("verifique el numero apostado, pueda estar fuera de rango o no posee las fichas que desea apostar");
                } 
                        
                    
            }while (num < 0 || num > 36 || misFichas < fichas);
         
            

            if (num!=maq){
             misFichas=(misFichas-fichas);
               System.out.println("Usted ha perdido, el total de sus fichas es  " +  misFichas);
               System.out.println("El numero que salio en la ruleta es " + maq);
               System.out.println("Desea volver a jugar S / N ? ");
               rta=miescaner.next();
            }

            else{
                misFichas=misFichas+(fichas*35);
                System.out.println("Usted ha ganado, su total de fichas es  "  +   misFichas);
                System.out.println("El numero que salio en la ruleta es  " +  maq);
                contUsuario++;
                usuario.sumarPuntos();
                Archivo.modificarPuntos(usuario, listaUsuarios);
                System.out.println("Desea volver a jugar? S / N ");
                rta=miescaner.next();
                //miescaner.close();
            } 
            

            
           
        } while (rta.equalsIgnoreCase("S"));
        
        
        if (rta.equalsIgnoreCase("N")){
         System.out.println("Usted se retira con el total de " + misFichas   +    "  fichas ");
         System.out.println("Gracias por jugar");
        
        }
         return false; // si la opcion es N el Boolean retorna falso y vuelve al menu de juegos
        

       
    }
        
}