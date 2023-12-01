package Punto;


/**
 * Principal para crear objetos del tipo Punto
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
    
    public static void main()
    {
        //se crea un punto 1 y se llama a constructor
        Punto p1=new Punto(5,5);
        p1.impirmir();
         
        //se crea un punto 2 y se llama a constructor
        Punto p2=new Punto(16,6);
        p2.impirmir();
          
        //impirmir un valor true o false de acuerdo sin los puntos son iguales.
        System.out.println(p1.esIgual(p2));
        
        //impirmir la sitancia calcualda de dos puntos
        System.out.println("distancia="+p1.calcularDistacia(p2));
       
    }
}
