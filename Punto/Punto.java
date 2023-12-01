package Punto;


/**
 * Clase que gestiona un punto 2D
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Punto
{
    //Atributos
    public double x,y;
    
       /**
     * Constructor for objects of class Punto
     */
    public Punto(double x, double y)
    { 
        this.x=x;
        this.y=y;
       
    }
    
    //Métodos 
     /**
     * Verifica si dos puntos son iguales
     * @param punto2 es un objeto Punto
     * @return un valor falso o verdadero
     */
    public boolean esIgual(Punto punto2)
    {
        if(x==punto2.x && y==punto2.y)
        {
            return true;
        }
        else{
            return false;
        }
    }
    
        /**
     * imprimir un punto 2D
     */
    public void impirmir()
    {
         System.out.println("("+x+","+y+")");
    }
    
       /**
     * calcula la distancia entre dos puntos
     * @param punto2 es un objeto Punto
     * @return un valor de la distancia. Se calcula la distancia euclideana. 
     */
    public double calcularDistacia(Punto punto2)
    {
        return Math.sqrt(Math.pow(punto2.x-x,2)+Math.pow(punto2.y-y,2));
    }

}

  
 


