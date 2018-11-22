/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema1;
import java.io.*;
/**
 *
 * @author Canales-PC
 */
public class Actividad1_4_part2 {
    public static void main(String args[])throws IOException{
        try{
            File fich = new File("FicheroAle.dat");
            RandomAccessFile file = new RandomAccessFile(fich, "rw");
            int id = Integer.parseInt(args[0]);
            int pos = (id-1)*36;
            file.seek(pos);
            int idb = file.readInt();
            file.seek(pos);
            file.writeInt(-1);
            file.writeInt(idb);
            file.writeInt(0);
            file.writeInt(0);
            file.close();
            System.out.println("Registro borrado...");
        }catch(IOException ioe){System.err.println(ioe);}
    }
}
