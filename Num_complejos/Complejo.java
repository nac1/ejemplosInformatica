package Num_complejos;


/**
 * Clase que gestiona números complejos
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Complejo
{
    //atributos
     int real;
     int imaginaria;

    /**
     * Constructor for objects of class Complejo
     */
    public Complejo(int real, int imaginaria)
    {
       this.real=real;
       this.imaginaria=imaginaria;
    }

     /**
     * suma dos números complejos
     * @param Complejo n2 es un número complejo de la clase Complejo
     * @return regresa un numero Complejo
     */
    public Complejo sumar(Complejo n2)
    {
        Complejo resultado=new Complejo(real+n2.real, imaginaria+n2.imaginaria);
        return resultado;
    }
     
    /**
     * resta dos números complejos
     * @param Complejo n2 es un número complejo de la clase Complejo
     * @return regresa un numero Complejo
     */
    public Complejo restar(Complejo n2)
    {
        return new Complejo(real-n2.real, imaginaria-n2.imaginaria);
    }
    
    /**
     * Verifica si dos números complejos son iguales
     * @param Complejo n2 es un número complejo de la clase Complejo
     * @return regresa un numero Complejo
     */
    public boolean esIgual(Complejo n2)
    {//verifica parte real e imagianria de cada número
        if(real==n2.real && imaginaria==n2.imaginaria)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        /**
     * imprimir un número complejo
     */
    public void imprimir()
    {
        System.out.println(real+" "+imaginaria+"i");
    }

}
