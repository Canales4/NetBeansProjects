/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.io.IOException;
import java.io.*;
/**
 *
 * @author Canales-PC
 */
public class EscribirFichAletorio {
    public static void main(String args[]) throws IOException{
        File fich = new File("FicheroAle.dat");
        RandomAccessFile file = new RandomAccessFile(fich, "rw");
        String apellido[] = {"LOMAS","LARA","EXPOSITO","PADILLA","LUNA","CANALES","GILABERT"};
        int dep[] ={10, 20, 10, 10, 30, 20, 30};
        Double salario[]={1000.45, 2400.60, 3000.0, 1500.0, 2200.0, 1435.0, 2000.0};
        StringBuffer buffer = null;
        int n = apellido.length;
        for(int i=0;i<n;i++){
            file.writeInt(i+1);
            buffer = new StringBuffer(apellido[i]);
            buffer.setLength(10);
            file.writeChars(buffer.toString());
            file.writeInt(dep[i]);
            file.writeDouble(salario[i]);
        }
        file.close();
    }
}
