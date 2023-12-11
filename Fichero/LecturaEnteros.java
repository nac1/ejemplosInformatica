package Fichero;
import java.util.Scanner;
import java.io.File;


/**
 * Problema lectura de enteros.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LecturaEnteros
{
    public static void main(String[] args) {
    try {
        Scanner fich= new Scanner(new File("Fichero/recursos/P12_enteros.txt"));
        int cont= 0;
        
        while(fich.hasNextInt()) {
            int veces= fich.nextInt(); // nº de números en esa línea
            int num= fich.nextInt(); // leo el primero de los numeros
            boolean creciente= true;
            
            for(int i= 1; i< veces; i= i+ 1) { // compruebosicrecen
                int sig= fich.nextInt();
                
                if(sig< num) {
                creciente= false;
            }
            num= sig;
            }
            if(creciente) {
            cont= cont+ 1;
            }
        }
        System.out.println("Numerode ordenadas:"+ cont);
        fich.close();
    } catch (Exception e) {
        System.out.println("Ficherono encontrado");
    }
}
}
