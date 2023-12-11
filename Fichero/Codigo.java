package Fichero;


/**
 * Write a description of class Codigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Codigo
{
    public int codigo;
    public int catidadFinal;
    
      /**
     * Constructor 
     */ 
 public Codigo(int codigo,int catidadFinal)
 { 
    this.codigo=codigo;
    this.catidadFinal=catidadFinal;
     
 }
   /**
     * imprimir 
     */
 public void imprimir()
   {
       System.out.println(+codigo+" "+catidadFinal);
   }
}
