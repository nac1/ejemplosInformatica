package Fichero;


/**
 * Write a description of class Pedidos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pedido
{
    // instance variables - replace the example below with your own
  public String fecha;
  public String nombreCliente;
  public int codigo;
  public int cantidad;
  

    /**
     * Constructor 
     */
    public Pedido(String fecha,String nombreCliente, int codigo,int cantidad)
    {
        this.fecha=fecha;
        this.nombreCliente=nombreCliente;
        this.codigo=codigo;
        this.cantidad=cantidad;
    }

      /**
     * imprimir 
     */
   public void imprimir()
   {
       System.out.println(fecha+" "+nombreCliente+" "+codigo+" "+cantidad);
   }
}
