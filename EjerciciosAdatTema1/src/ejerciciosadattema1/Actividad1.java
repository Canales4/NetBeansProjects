package ejerciciosadattema1;
import java.io.*;
/**
 * @author Canales-PC
 */
public class Actividad1 {
    public static void main(String args[]){
        File[] ficheros = new File(".").listFiles();
        for(int i = 0; i<ficheros.length; i++)
            System.out.println(ficheros[i]);
    }
}
