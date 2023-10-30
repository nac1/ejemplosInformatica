import java.util.Scanner;

/**
 * Programa para calcular la suma de los elementos de un vector.
 * 
 * @author clase de Informática 
 * @version (a version number or a date)
 */
public class Vectores
{
    public static void main(String[] args)
    {
        int[] A={10,20,30,80,-10};
        
        int sumar=loop(A);
        
        System.out.println("suma="+sumar);
        
        int[] nuevoVector=pedirDatos(crear());
        
        System.out.println("La suma del nuevo vector es:"+loop(nuevoVector));
        
        
    }
    
       /*
     * Crea un vector entero, pidiendo el tamaño al usuario desde teclado
     * @param me
     * @return Un vector de tamaño definido por el usuario
     */
    static int[] crear(){
        
        Scanner reader=new Scanner(System.in);
        System.out.println("Introduce tamaño del vector:");
        int tamaño=reader.nextInt();
        
        int[] vector=new int[tamaño];//crea un arreglod e tamaño leido desde teclado
        
        return vector;
    }
    
    /*
     * Crea asigna valores leidos desde teclado a un vector de tamaño estatico
     * @param me
     * @return Un vector con numeros enteros
     */
    static int[] pedirDatos(int vector[])
    {
        Scanner reader=new Scanner(System.in);
        
        for(int i=0;i<vector.length;i++)
        {System.out.println("Introduce valor para la posición ["+i+"]:");
            vector[i]=reader.nextInt();//asignar valores a la posición i del vector, la entrada del numero entero desde teclado

        }
        
        return vector;
    }
    
    
      /*
     * La sumatoria de los componentes de un vector entero
     * @param Un arreglo con cun número de componentes.
     * @return la suma de los compoenentes deun vecto
     */
    static int loop(int A[]){
        int sum=0;
        
        for(int k=0;k<A.length;k++)
        {
         sum=sum+A[k];
        }
        
        return sum;
    }
    
    
    

}
