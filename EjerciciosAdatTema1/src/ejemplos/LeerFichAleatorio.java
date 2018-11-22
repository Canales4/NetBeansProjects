/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.io.*;

/**
 *
 * @author Canales-PC
 */
public class LeerFichAleatorio {
    public static void main(String args[])throws IOException{
        File fich = new File("FicheroAle.dat");
        RandomAccessFile file = new RandomAccessFile(fich, "r");
        int id,dep,posicion;
        Double salario;
        char apellido[]= new char[10], aux;
        posicion = 0;
        for(;;){
            file.seek(posicion);
            id = file.readInt();
            for(int i=0; i<apellido.length;i++){
                aux = file.readChar();
                apellido[i] = aux;
            }
            String apellidos = new String(apellido);
            dep = file.readInt();
            salario = file.readDouble();
            if(id > 0){
                System.out.printf("ID: %s, Apellido: %s, Departamento: %d, Salario: %.2f %n", id, apellidos.trim(),dep,salario);
            }
            posicion = posicion +36;
            if(file.getFilePointer() == file.length())break;
        }
        file.close();
    }
}
