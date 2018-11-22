/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema1;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Canales-PC
 */
public class Actividad1_4_part3 {
    public static void main(String args[])throws IOException{
        try{
            File fich = new File("FichAle.dat");
            RandomAccessFile file = new RandomAccessFile(fich, "r");
            int posicion=0, id, idantiguo;
            for(;;){
                file.seek(posicion);
                id = file.readInt();
                if(id == -1){
                    idantiguo= file.readInt();
                    System.out.printf("ID Borrado: %s %n", idantiguo);
                }
                posicion = posicion + 36;
                if(file.getFilePointer() == file.length())break;
            }
            file.close();
        }catch(EOFException eof){System.out.println("Fin lectura");}
    }
}
