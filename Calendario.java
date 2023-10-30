import java.util.Scanner;

/**
 * Programa para generar el calendario.
 * 
 * @author clase de Informática 
 * @version (a version number or a date)
 */
public class Calendario
{
   public static void main(String[] args) {
        int año = leerNumero("año");
        int mes= leerNumero("mes");
        int dia = 1;
        int dias = calcularDias(año,mes,dia);
        System.out.println(darMes(mes)+" "+año);
        mostrarCalendario(dias%7,mes,año); //se debe hacer modulo de 7, para saber el resto de días en blanco.
        
        //System.out.println("Es bisiesto:"+esBisiesto(año));
        
        //System.out.println("mes:"+mes+ " año:"+año+"dias del mes"+diasDelMes(mes,año));
        
    }
    
    /*
     * obtiene el mes de un arreglo de string
     * @param mes  es el numero del mes dado por el usuario
     * @return el nombre del mes
     */
   private static String darMes(int mes){
       String arregloMes[]={"Enero","Febrero","Marzo","Abril",
           "Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
           
           
       return arregloMes[mes-1];
   }
    
   
     /*
     * leer un entero desde teclado
     * @param text es un mensaje tipo string
     * @return un entero
     */
    private static int leerNumero(String text){
        System.out.println("Introduce "+text+": ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    
    /*
     * verifica si un año es bisiesto
     * @param año dado por el usuario
     * @return un valor true/false
     */
    private static boolean esBisiesto (int año){
        if ((año%4 == 0) && ((año%100 != 0) || (año%400 == 0))){
            return true;
        }
        return false;
    }
    
     /*
     * Obtiene el total de días de un mes
     * @param mes dado por el usuario
     * @param año dado por el usuario
     * @return numero de días del mes
     */
    private static int diasDelMes (int mes, int año) {
    
        if(mes==2)
        {
            if (esBisiesto(año)) {
                return 29;
            } else {
                return 28;
            }
        } else if (mes==4||mes==6||mes==9||mes==11) {
                return 30;
            } else  {return 31;}
    }
    
      /*
     * Obtiene el total de días de un año
     * @param año dado por el usuario
     * @return numero de días de un año particular
     */
    private static int diasDelAño(int año){
    if (esBisiesto(año)) 
    {return 366; }
    
    return 365;
    }

      /*
     * Obtiene el total de días desde el año 1900 hasta un mes anterior del mes y año dado por el usuario
     * @param año dado por el usuario
     * @param mes dado por el usuario
     * @param dia será siempre 1 (ya que queremos pintar siempre a partir del 1ro de cada mes)
     * @return total de días 
     */
    private static int calcularDias(int año, int mes, int dia){
            int dias = dia;
            //contar los días desde enero al un mes anterior al mes dado por el usuario
            for(int i=1; i<mes; i=i+1){
                dias = dias + diasDelMes(i,año);
            }
            
            //contar los días desde el año 1900 hasta el año anterior al dado por el usuario
            for(int i=1900; i<año; i=i+1){
                dias = dias + diasDelAño(i);
            }
            return dias;
        }

         /*
     * OImprime el calendario
     * @param diaSem numero de días que serán en blanco
     * @param mes dado por el usuario
     * @param año dado por el usuario
     * @return numero de días de un año particular
     */
        private static void mostrarCalendario(int diaSem, int mes, int año){
        System.out.println("  D  L  M  X  J  V  S");
            int dm = diasDelMes(mes, año); //total de días del mes dado por el usuario ejem. 30, 31 o 28 etc.
            
            //pintar los espacios en blanco
            for(int i=0; i<diaSem; i=i+1){
            System.out.print("   "); //3 espacios en blanco
            }
            
            //pintar los días desde el 1ro al total de días de un mes
            for (int i=1; i<=dm; i=i+1){
                System.out.printf("%3d",i); //imprimir un entero,hay 3 posiciones en las cuales se rellena de espacios a la izq.
                diaSem=diaSem+1;
                if(diaSem%7==0){ //modulo de 7 para generar una nueva fila
                System.out.println();
                diaSem=0;
            }
        }
}


}
