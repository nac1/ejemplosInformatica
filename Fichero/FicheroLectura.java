package Fichero;
import java.io.File;
import java.util.Scanner;


/**
 * Lectura de Ficheros.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FicheroLectura
{
    public static void main(String[] args) {
        
  /* File f = new File("Fichero/recursos/bandas-Españolas.txt");//en el proyecto debería funcionar a partir de recursos/fichero.txt
    try{
        Scanner inputFich= new Scanner(f);
        
            while(inputFich.hasNext()){
                
                String linea= inputFich.nextLine();
                System.out.println(linea);
                
            }
            
            inputFich.close();
        } 
         catch(Exception e) 
        {
        System.out.println("Fichero no encontrado.");
        }*/
        
    Scanner input = new Scanner(System.in);
    Scanner inputFich= null; // inicializaciónpordefecto
    boolean abierto= false;
    while(!abierto) {
    try{
        System.out.println("Introduce el nombre del fichero: ");
        File fichero = new File(input.next());
        inputFich= new Scanner(fichero);
        abierto = true;
        // se hace lo que sea con el fichero
       while(inputFich.hasNext()){
                
                String linea= inputFich.nextLine();
                System.out.println(linea);
                
            }
            
            inputFich.close();
                
        } catch(Exception e) { 
        System.out.println("El fichero no existe.");
    }
}
        
        
    }
}
