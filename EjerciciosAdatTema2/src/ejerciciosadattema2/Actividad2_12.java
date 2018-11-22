/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Canales-PC
 */
public class Actividad2_12 {
    public static void main(String args[]){
        ejecutarArchivoMysql();
    }
    public static void ejecutarArchivoMysql(){
        File file = new File("./mysql.sql");
        System.out.println("\nNombre del fichero: "+file.getName());
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(file));
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        String linea = null;
        StringBuilder builder = new StringBuilder();
        String salto= System.getProperty("line.separator");
        try{
            while((linea = reader.readLine()) != null){
                builder.append(salto);
                builder.append(salto);
            }
        }catch(IOException e){
            System.out.println("ERROR de E/S, al operar con el fichero: "+e.getMessage());
        }
        String consulta = builder.toString();
        System.out.println(consulta);
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("ERROR en el driver "+e.getMessage());
        }
        try{
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/ejemplo?allowMultiQueries=true","root","");
            Statement sentencia = conexion.createStatement();
            int result = sentencia.executeUpdate(consulta);
            System.out.println("Script creado.. "+result);
            conexion.close();
            sentencia.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    public static void ejecutarArchivoOracle(){
        File file = new File("./oracle.sql");
        System.out.println("\nNombre del fichero: "+file.getName());
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader(file));
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        String linea = null;
        StringBuilder builder = new StringBuilder();
        String salto= System.getProperty("line.separator");
        try{
            while((linea = reader.readLine()) != null){
                builder.append(salto);
                builder.append(salto);
            }
        }catch(IOException e){
            System.out.println("ERROR de E/S, al operar con el fichero: "+e.getMessage());
        }
        String consulta = builder.toString();
        System.out.println(consulta);
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }catch(ClassNotFoundException e){
            System.out.println("ERROR en el driver "+e.getMessage());
        }
        try{
            Connection conexion = (Connection) DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:XE","SYSTEM","system");
            Statement sentencia = conexion.createStatement();
            int result = sentencia.executeUpdate(consulta);
            System.out.println("Script creado.. "+result);
            conexion.close();
            sentencia.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
