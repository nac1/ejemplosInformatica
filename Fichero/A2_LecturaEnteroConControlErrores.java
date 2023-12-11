package Fichero;
import java.util.Scanner;


/**
 * Manejo de excepciones
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A2_LecturaEnteroConControlErrores {
    public static void main(String[] args) {
    
    //ejemplo excepciónes 
    
    //división ejemplo de manejo de error.
    try{
       int resultado= 8/0;
       System.out.println("El número es: "+ resultado); 
    }catch(Exception er) {
        System.out.println("Division entre cero causa error");
    }
    
    
    
    //excepciones parte 1. pedir un número.
    Scanner input= new Scanner(System.in);
    /*
   
    System.out.print("Introduce un númeroentero: ");
    try{
        int n= input.nextInt();
        System.out.println("El número es: "+ n);
    }catch(Exception er) {
        System.out.println("No has introducido un número entero.");
    }*/
    
    
    //excepciones parte 2. pedir un número usando while
    System.out.print("Introduce un númeroentero: ");
    int n= 0;
    boolean obtenido= false;
    while(!obtenido) {
        try{
            n= input.nextInt();
            obtenido= true;
           } catch(Exception er) {
              input.next();
              System.out.print("No has introducido un número entero,introduce un número entero: ");
            }
    }
    System.out.println("El número es: "+ n);
}
}



