/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logic;

import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class Lab1 {

    private Scanner sc;
    
    public Lab1 (){
       
    }
  public void ejercicio1(){
      Scanner sc = new Scanner(System.in);
      int num = 0;
      System.out.println("Digite el número: ");
      num = sc.nextInt();
      
      if (num%2 ==0 ){
      System.out.println("El número ingresado: "+ num +" Es par ");
      }
      else{
      System.out.println("El número ingresado: " + num + " Es impar ");
      }

    }
    
    public void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        int num_ab = 0;
  
        System.out.println("Digite el numero: ");
        num_ab=sc.nextInt();
        if (num_ab < 0){
          num_ab = -num_ab;
          
        }
        else {
          num_ab = num_ab;
        }
      System.out.println("El valor absoluto es: " + num_ab);
    }
    
    public void ejercicio3(){
        int  suma = 0;
         int num = 3;
         
         System.out.println("La lista de numeros en serie es: ");
         while (num <= 99){
             System.out.println(" " + num);
             
             suma = suma+num;
             num=num +3;
           
         }
      System.out.println("La suma de los numeros son:" + suma);
    }
    
   
    public void ejercicio4(){ 
       int [] numeros = new int [3];
       Scanner sc = new Scanner(System.in);
           for (int i = 0; i < numeros.length; i++) {
               System.out.println("Digite un numero al azar.");
           numeros [i] = sc.nextInt();  
              
               
           
           } System.out.println("El arreglo desordenado");
               for (int j = 0; j < numeros.length ; j++) {
               System.out.print(numeros[j] + ",");
               }
             System.out.println();
             Arrays.sort(numeros);
             System.out.println ("El arreglo ordenado");
             for (int i = 0; i < numeros.length; i++) {
               System.out.print (numeros[i] + ","+"\n"); 
           }
       }
    
    public void ejercicio5(){
        Scanner sc = new Scanner(System.in);
      int num_1 = 0;
      int num_2 = 0;
      int result = 0;
      
      System.out.println("Digite el primer numero: ");
      num_1=sc.nextInt();
      
      System.out.println("Digite el segundo numero: ");
      num_2=sc.nextInt();
      
      if (num_1 == num_2){
      
      result = num_1*num_2;
      
      System.out.println("El resultado de la multiplicacion es de: " + result);
      }
      else if (num_1 > num_2){
              
      result = num_1 - num_2;
      
      System.out.println("El resultado de la resta es de: " + result);
              
              }
      else{
      
      result = num_2 + num_1;
              
       System.out.println("El resultado de la suma es de: " + result);
      }
    }
    
    public void ejercicio6(){
        Scanner sc = new Scanner(System.in);
        boolean huboDiez = false;
        int nota;

        do {
            System.out.print("Ingrese una nota (0 a 10) o -1 para terminar: ");
            nota = sc.nextInt();

        if (nota == 10) {
            huboDiez = true;
        }

      } 
        while (nota != -1);

        if (huboDiez) {
            System.out.println("Si hubo una o mas notas con valor 10.");
        } else {
        System.out.println("No hubo ninguna nota con valor 10.");
        }

    }
    
    public void ejercicio7_Pulsaciones(){
        Scanner sc = new Scanner(System.in);  
        System.out.println("Ingrese su sexo (F/M)");
        String sexo = sc.next(); 
        
        System.out.println("Ingrese su edad (años)");
        double edad = sc.nextInt();
        
        double pulsaciones; 
        
        if (sexo.equalsIgnoreCase("F")) {/*equalsIgnoreCase, es para que cuando el usuario ingrese F/M no 
                                           sea exigidamente en mayuscula, ya que si lo 
                                           ingresa en minuscula, asumira que es masculino.*/
            
            pulsaciones = (220 - edad)/10;
        } else {
            pulsaciones = (210 - edad)/10;
        }
        
        System.out.println("Con una edad de: "+ edad +"El numero de pulsaciones es de: " + pulsaciones);
    }
    
    public void ejercicio8_utilidad(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese el salario mensual: ");
        double salario = sc.nextDouble();
        
        System.out.print("Ingrese los años de antigüedad: ");
        int antiguedad = sc.nextInt();
        
        double utilidad;
        
        if (antiguedad < 1) {
            utilidad = salario * 0.05;
        } else if (antiguedad >= 1 && antiguedad < 2) {
            utilidad = salario * 0.07;
        } else if (antiguedad >= 2 && antiguedad < 5) {
            utilidad = salario * 0.10;
        } else if (antiguedad >= 5 && antiguedad < 10) {
            utilidad = salario * 0.15;
        } else {
            utilidad = salario * 0.20;
    }
        System.out.println("La utilidad a recibir es: " + utilidad);
    }
    
    public void ejercicio9_primo_o_no(){
        
     Scanner sc = new Scanner(System.in);
     int suma = 0;
     System.out.println("Digite un numero: ");
     int numero= sc.nextInt();
     
         for (int i = 1; i <= numero; i++) {
             int auxiliar = numero%i;
             if (auxiliar==0){
                 suma = suma + 1;
                 
             }
         }
        
        if(suma==2){
        System.out.println("El numero SI es primo");
        } else{
            System.out.println("El numero NO es primo");
          
        }
    }
    
    
    public void ejercicio10(){
        Scanner sc = new Scanner(System.in);

    double precioUnitario = 11000;
    System.out.print("Ingrese la cantidad de computadoras a comprar: ");
    int cantidad = sc.nextInt();

    double precioTotal = cantidad * precioUnitario;
    double descuento;

    if (cantidad < 5) {
        descuento = precioTotal * 0.10;
    } else if (cantidad >= 5 && cantidad < 10) {
        descuento = precioTotal * 0.20;
    } else {
        descuento = precioTotal * 0.40;
    }

    double totalPagar = precioTotal - descuento;

    System.out.println("Cantidad de computadoras: " + cantidad);
    System.out.println("Precio total sin descuento: $" + precioTotal);
    System.out.println("Monto descontado: $" + descuento);
    System.out.println("Monto total a pagar: $" + totalPagar);

    }
    
    public void ejercicio11_generarPrimos(){
        sc = new Scanner(System.in);
        System.out.println("Ingrese un número (>= 2)");
        int n = sc.nextInt();
        
        if (n < 2) {
            System.out.println("No hay numeros primos que sean menores que 2");
        }
        
        //generar un lista con List
        List<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j * j <= i ; j++) {
                if (i % j == 0) {
                    esPrimo = false;
                    break;
                }
                
            }
            if (esPrimo) primos.add(i); //El método add(valor) de una lista sirve para agregar un elemento al final de la lista.
        }
        System.out.println("Numeros primos entre 2 y "+ n +", son:" + primos);
    }
    
    public void ejercicio12(){
        Scanner sc = new Scanner(System.in);
       int base,altura,area;
       
       System.out.println("Ingrese la base");
       base = sc.nextInt();
       
       System.out.println("Ingrese la altura");
       altura = sc.nextInt();
       
       area = (base*altura)/2;
       
       System.out.println("El valor del area es: " + area);
    
    }
     
}
