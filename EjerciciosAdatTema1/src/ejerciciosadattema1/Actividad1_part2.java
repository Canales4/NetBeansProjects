package ejerciciosadattema1;
import java.io.*;
/*@author Canales-PC*/
public class Actividad1_part2 {
   public static void main(String args[]){
       File f1 = new File(args[0]);//
       if(f1.exists()){//comprabamos si existe
           File[] f = new File(args[0]).listFiles();//guardamos archivos en array
           for(int i = 0; i<f.length; i++)//recorremos la array
                System.out.println(f[i]);//mostramos resultado
       }else{
           System.out.println("No existe ese fichero");
       }
   } 
}
