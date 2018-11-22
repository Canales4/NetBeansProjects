/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema1;

import com.thoughtworks.xstream.XStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import ejemplos.ListaDepartamentos;
import ejemplos.Departamentos;
import java.io.EOFException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author Canales-PC
 */
public class Actividad8 {
    public static void main(String args[]) throws FileNotFoundException, IOException{
        File fichero = new File("Departamento.dat");
        FileInputStream fi = new FileInputStream(fichero);
        DataInputStream di = new DataInputStream(fi);
        int dep;
        String nombre, loc;
        ListaDepartamentos listaDepart = new ListaDepartamentos();
        try{
            while(true){
                Departamentos departamento;
                dep=di.readInt();
                nombre=di.readUTF();
                loc=di.readUTF();
                departamento=new Departamentos(dep,nombre,loc);
                listaDepart.listadepartamentos.add(departamento);
            }
        }catch(EOFException eof){}
        di.close();
        try{
            XStream xstream = new XStream();
            xstream.alias("ListaDepartamentos", ListaDepartamentos.class);
            xstream.alias("DatosDepartamentos", Departamentos.class);
            xstream.addImplicitCollection(ListaDepartamentos.class, "lista");
            xstream.toXML(listaDepart, new FileOutputStream("Departamentos.xml"));
            System.out.println("Xml creado");
        }catch(Exception e){e.printStackTrace();}
    }
}
