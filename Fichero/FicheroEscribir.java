package Fichero;
import java.io.PrintStream;
import java.io.File;


/**
 * Escritura de ficheros.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FicheroEscribir
{
    public static void main(String[] args) {
    
    File f = new File("Fichero/recursos/salida.txt");
    
    try{
        
        PrintStream output= new PrintStream(f);
        output.print("Contenido a escribir en el fichero. ");
        output.println("Más cosas a escribir en el fichero.");
        
        output.close();
        
    } catch(Exception e) {
    System.out.println("No se ha podido crear el fichero.");
    }
}
}
