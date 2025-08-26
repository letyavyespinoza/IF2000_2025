package logic;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author USER
 */
public class Ejercicios_Semana2_PracticaEnClase {
    
    public Ejercicios_Semana2_PracticaEnClase (){
}

    public void  quiz2_A_primos(){
        }

    public void quiz2_B_piramide(int n){
       
        for (int i = 1; i <= n; i++) {
         //controla los espacios 
            for (int j = 1; j <= (n-i); j++) {
                System.out.print(" ");
            }//end for interno_A
            //controla los *S de la piramide
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }//end del for interno_B
            System.out.println("");
        }//end del for Externo
    }// end del metodo
    
    public void ejercioA(int n) {
        for (int i = 1; i <= n; i++) {
         //controla los espacios 
            for (int j = 1; j <= (n-1); j++) {
                System.out.print(" ");
            }//end for interno_A
            //controla los *S de la piramide
            for (int k = 1; k <= (2*i-1); k++) {
                System.out.print("*");
            }//end del for interno_B
            System.out.println("");
        }//end del for Externo
    }// end del metodo     
    
    /*public void ejercicioB(int n){
      
        int espacio = n-2;
        
        for (int i = 1; i <=n-0; i++) {
            for (int j = 1; j <=(n/n); j++) {
                System.out.println(" ");
            }
            for (int k = 0; k <=(n-1); k++) {
                System.out.print(" * ");
            }
        }
    }*/
    
    public void ejercicioB(int n){   
    System.out.println();
 
    for (int i = 1; i <= n; i++) {             
        for (int j = 1; j <= n; j++) {        
            
            if (i == 1 || i == n || j == 1 || j == n) {
                System.out.print("* ");
            } else {
                System.out.print("  ");        
            }
        }
        System.out.println();                
    }
 }
    
      public void ejercicioC(int n){
         
         
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) System.out.print(" ");
            for (int k = 0; k < n - i; k++) System.out.print("*");
            System.out.println();
        }
    }
     
       public void ejercicioD(){  
       
       int [] numeros = new int [10];
       Scanner sc = new Scanner(System.in);
           for (int i = 0; i < numeros.length; i++) {
               System.out.println("Digite un numero al azar.");
           numeros [i] = sc.nextInt();  
              
               
           
           } System.out.println("Arreglo desordenado");
               for (int j = 0; j < numeros.length ; j++) {
               System.out.print(numeros[j] + ",");
               }
             System.out.println();
             Arrays.sort(numeros);
             System.out.println ("Arreglo ordenado");
             for (int i = 0; i < numeros.length; i++) {
               System.out.print (numeros[i] + ","+"\n"); 
           }
       }
      
        public void ejercicioE(){
           
            int [] numeros = new int [100];
            Random random = new Random ();
            
            for (int i = 0; i < numeros.length; i++) {
                numeros[i]= random.nextInt();
              
            }
           
              
            Arrays.sort(numeros);
           
            for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
       
            
            
            }      
                }
        
         public void tablero() {
              char[][] tablero = new char[8][8];
        for (int i = 0; i < 8; i++)
            for (int j = 0; j < 8; j++)
                tablero[i][j] = ' ';

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 1) tablero[i][j] = 'N';

        for (int i = 5; i < 8; i++)
            for (int j = 0; j < 8; j++)
                if ((i + j) % 2 == 1) tablero[i][j] = 'R';

        System.out.println("\nTablero");
        System.out.print("  ");
        for (int i = 1; i <= 8; i++) System.out.print(i + " ");
        System.out.println();

        for (int i = 0; i < 8; i++) {
            System.out.print((char)('A'+i) + " ");
            for (int j = 0; j < 8; j++) System.out.print(tablero[i][j] + " ");
            System.out.println();

             
         
         
        }    
         
         }
    
}
