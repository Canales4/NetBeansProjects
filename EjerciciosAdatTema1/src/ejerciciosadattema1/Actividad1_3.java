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
public class Actividad1_3 {
    public static void main(String args[])throws IOException{
        File fich = new File("FicheroAle.dat");
        RandomAccessFile file = new RandomAccessFile(fich, "r");
        int id=Integer.parseInt(args[0]),dep,posicion;
        Double salario;
        char apellido[]= new char[10], aux;
        try{//identar
        posicion = (id-1)*36;
        if(posicion>=file.length()){
            System.out.println("NO EXISTE ESE ID");
        }else{
            file.seek(posicion);
            id = file.readInt();
            for(int i=0; i<apellido.length;i++){
                aux = file.readChar();
                apellido[i] = aux;
            }
            String apellidos = new String(apellido);
            dep = file.readInt();
            salario = file.readDouble();
            System.out.printf("ID: %s, Apellido: %s, Departamento: %d, Salario: %.2f %n", id, apellidos.trim(),dep,salario);
        }file.close();
        }catch(Exception e){System.err.println(e);}  
    }
}
