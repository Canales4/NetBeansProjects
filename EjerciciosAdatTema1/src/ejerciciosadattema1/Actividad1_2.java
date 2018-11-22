package ejerciciosadattema1;
import java.io.*;
/*@author Canales-PC*/
public class Actividad1_2 {
    public static void main(String args[]) throws IOException{
        //FileReader fr = new FileReader(new File("texto.txt"));
        FileReader fr = new FileReader(new File(args[0]));
        int i;
        while((i = fr.read()) != -1)
            System.out.println((char) i);
        fr.close();
    }
}
