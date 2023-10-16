
/**
 * Este código muestra el uso de funciones y su invocación.
 * Ejemplo de Funciones.
 * @author Ignacio Huitzil
 * @version 11/10/2023
 */

import java.util.Scanner;

public class Funciones
{
    public static void main(String[] args)
    {
        /*Al ejecutar el código veras una ventana emergente con lo siguiente:
        Void main(String [] args)
        Funciones.main({ }) 
        Agrega un mensaje dentro de las llaves entre comillas ejemplo {"Hola"} y aceptar*/
        
        //imprimir mensaje
        imprimirMensaje(args[0]);
      
        //leer dos enteros
        int numero1=leerEntero();
        
        int numero2=leerEntero();
        
        //sumar dos enteros entradas del teclado
        int resultadoDeSuma= sumarEnteros(numero1,numero2);
       
        //imprimir mensaje
        System.out.println("La suma de "+ numero1+" y "+ numero2 
        +" es "+resultadoDeSuma); //ejemplo1
        
        System.out.println("La suma de "+ numero1+" y "+ numero2 
        +" es "+sumarEnteros(numero1,numero2));//ejemplo2
        
        imprimirMensaje("La suma de "+ numero1+" y "+ numero2 
        +" es "+sumarEnteros(numero1,numero2)); //ejemplo3
        
        
    }
    
        /*
     * Imprime un mensaje
     * @param mensaje de tipo String
     * @return vacio
     */
    static void imprimirMensaje(String mensaje)
    {
        System.out.println( mensaje);
    }
    
    /*
     * Leer un entero desde teclado
     * @param 
     * @return un número entero
     */
    static int leerEntero()
    {
       
        //llamada a la funcion imprimirMensaje
        imprimirMensaje("Teclea un entero");
        
        //definir un objeto del tipo scanner
        Scanner input=new Scanner(System.in);
        
        //leer entero
        int entero=input.nextInt();
        
        return entero;
        
        //return input.nextInt();
        
    }
    
     /*
     * Suma dos enteros
     * @param n1 es el primer número entero 
     * @param n1 es el segundo número entero 
     * @return un entero que es al suma de los dos parametros
     */
    
    static int sumarEnteros(int n1, int n2)
    {
        int suma=n1+n2;
        
        return suma;
        
        //return n1+n2;
    }
    
    
}
