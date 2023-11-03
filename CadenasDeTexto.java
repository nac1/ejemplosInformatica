
/**
 * Programa donde seprueban algunos métodos de la clase  cadena "String".
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 * http://dit.upm.es/~pepe/libros/vademecum/index.html?n=373.html
 * https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
 */
public class CadenasDeTexto
{
      public static void main(String[] args)
    {
       String texto="Hola mundo";
       String texto2=new String("01/11/2023");
       
       String mensajeFinal=texto+" "+texto2;
       
       System.out.println(texto+" "+texto2);
       System.out.println(texto.length()); //obtener la longitud del String
       
       String nombre="Nacho";
       String nombre2="nacho";
       //evifica si las cadenas son iguales, Valida mayúsculas y minúsculas
       System.out.println("equals="+ nombre.equals(nombre2)); 
       //evifica si las cadenas son iguales, no importan las mayúsculas y minúsculas
       System.out.println("equalsIgnore="+ nombre.equalsIgnoreCase(nombre2)); 
       
      String banda=" -Red. ";
      //elimina los espacios al inicio o final de una cadena de caracteres.
      System.out.println(banda.trim());
      
      //convierte una String a un arreglo de caracteres.
      char[] vectorDeCaracter=nombre.toCharArray();
      
      //imprimir todas los caracteres de una cadena usando el vector de caracteres y accediendo a una pisition de una cadena
      for(int i=0;i<vectorDeCaracter.length;i++)
          System.out.println(vectorDeCaracter[i]+ " "+nombre.charAt(i));
          
      String textoRasp="El Kit más completo de la nueva Raspberry Pi 5 en el lanzamiento! Incluye todos los accesorios oficiales, la Raspberry Pi 5 4GB, nueva Caja Oficial para Raspberry Pi 5 en Rojo y Blanco (Negra/gris no disponible en el lanzamiento), fuente de alimentacion oficial con PD 27W, con conector Europeo.";
      
      //Obtener subcadenas de in índice inicial y uno final más 1.
      String sub=textoRasp.substring(3,15);
      String sub2=textoRasp.substring(20);
      System.out.println(sub);
      System.out.println(sub2);
        
      System.out.println(textoRasp.indexOf('K'));
      System.out.println(textoRasp.indexOf("Raspberry Pi"));
        
      String bandaRock="Red_Hot_Chili_Peppers_RHCP*";
      
      //verifica si la cadena tiene un carácter
      System.out.println(bandaRock.contains("*"));
      
      //Fragmenta la cadena en varias subcadenas utilizando un patron como separador.
      String[] vectorString=bandaRock.split("_"); //usamos el patron "-" 
        
      //impirmir las subcadenas
      for(int k=0;k< vectorString.length;k++)
         System.out.println(vectorString[k]);
         
     //convierte una cadena a mayúsculas
     String mayusculas=bandaRock.toUpperCase();
     System.out.println(mayusculas);
     
     //convierte una cadena a minúsculas
     String minusculas=bandaRock.toLowerCase();
     System.out.println(minusculas);
    }
}
