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
public class Actividad1_3_part2 {
    public static void main(String args[])throws IOException{
        File fich = new File("FicheroAle.dat");
        RandomAccessFile file = new RandomAccessFile(fich, "rw");
        StringBuffer buffer = null;
        try{
        int id = Integer.parseInt(args[0]);
        String apellido = args[1];
        int dep = Integer.parseInt(args[2]);
        Double salario = Double.parseDouble(args[3]);
        int pos = (id-1)*36;
        if(pos >= file.length()){
            file.seek(pos);
            file.writeInt(id);
            buffer = new StringBuffer(apellido);
            buffer.setLength(10);
            file.writeChars(buffer.toString());
            file.writeInt(dep);
            file.writeDouble(salario);  
            System.out.println("Registro añadido");
        }else{
            System.out.printf("ID: %d, EXISTE EMPLEADO...",id);   
        }
        }catch(Exception e){System.err.println(e);}
        file.close();
    }
}
