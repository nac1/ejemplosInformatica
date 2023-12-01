package Num_complejos;

import java.util.Scanner;

/**
 * Programa principal para crear objetos de complejo.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    public static void main()
    {
        //crear dos objetos del tipo Complejo
        Complejo numero1=new Complejo(3,6);
        Complejo numero2=new Complejo(10,-5);
        numero1.imprimir();
        numero2.imprimir();
        //mandar a llamar a suma y resta del número 1 y número 2
        Complejo resultado1=numero1.sumar(numero2);
        resultado1.imprimir();
        Complejo resultado2=numero1.restar(numero2);
        resultado2.imprimir();
        //validar si dos números complejos son iguales
        
        if(numero1.esIgual(new Complejo(3,6)))//tambien podi usar numero1.esIgual(numero2)
        {
        System.out.println("números iguales");
        }
        else{
        System.out.println("números diferentes");
        }
        
        //mandar a llamar a la funcion leer un complejo
        leerComplejo();
        
    }
    
    public static Complejo leerComplejo()
    {
        Scanner input=new Scanner(System.in);
        //pedir dos numero desde teclado y creo un número nuevo del tipo Complejo.
        Complejo nuevo=new Complejo(input.nextInt(),input.nextInt()); //despues del new llamo al constructor.
         
        return nuevo;
    }
}
