package Fichero;
import java.io.File;
import java.util.Scanner;
/**
 * Problema de pedidos.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeerPedidos
{
public static void main(String[] args) {
    final int NUM_LINEAS=3;   
    File f = new File("Fichero/recursos/pedidos.txt");//en el proyecto debería funcionar a partir de recursos/fichero.txt
    Pedido[] pedido=new Pedido[NUM_LINEAS];
    
    //lectura del fichero
    try{
        Scanner inputFich= new Scanner(f);
             int i=0;
            
            while(inputFich.hasNext()){
                
                String linea= inputFich.nextLine();
                //System.out.println(linea);
                String[] elemLinea=linea.split(" ");
                //crear objetos de tipo Pedido
                pedido[i]=new Pedido(elemLinea[0],elemLinea[1],Integer.valueOf(elemLinea[2]),Integer.valueOf(elemLinea[3]));
                pedido[i].imprimir();
                i++;
            }
            
            inputFich.close();
        } 
         catch(Exception e) 
        {
        System.out.println("Fichero no encontrado.");
        }
        
        System.out.println("Num total de codigos: "+contarCodigos(pedido));
        
        //nueva estructura de codigos y totales de vendidos de cada código unico
        Codigo[] c=new Codigo[contarCodigos(pedido)];
        SumarCantidad(c,pedido);
        
        c[0].imprimir();
        c[1].imprimir();
        
        EncontrarMayorCantidad(c);
        
}

//contar codigos
public  static int contarCodigos(Pedido pedido[])
{
    int numCodDiferentes=1;
    int codigo=pedido[0].codigo;
    for (int i=1;i<pedido.length; i++)
    {
        if(codigo!=pedido[i].codigo)
        {
            codigo=pedido[i].codigo;  
            numCodDiferentes++;
        }
    }
    
    return numCodDiferentes;
}

public static void SumarCantidad(Codigo c[],Pedido pedido[])
{
    int sum=pedido[0].cantidad;
        int codigo=pedido[0].codigo;
        int x=0;
        for(int i=1;i<pedido.length;i++)
        {
            if(codigo==pedido[i].codigo)
            {
                sum=sum+pedido[i].cantidad;
            }else
            {
                c[x]=new Codigo(codigo,sum);
                
                codigo=pedido[i].codigo;
                sum=pedido[i].cantidad;
                x++;
            }
            
            if(i==pedido.length-1)
            {
                c[x]=new Codigo(codigo,sum);
            }
        }
}

public static void EncontrarMayorCantidad(Codigo c[])
{
    //encontrar el mayor
        int cantidadaux=0;
        int indice=-1;
        
        for(int i=0;i<c.length;i++)
        {
            if(c[i].catidadFinal > cantidadaux)
            { 
                cantidadaux=c[i].catidadFinal;
                indice=i;
            }
        }

        System.out.println("Del producto "+ c[indice].codigo+", se han vendido "+ c[indice].catidadFinal+" unidades.");     
}
}
