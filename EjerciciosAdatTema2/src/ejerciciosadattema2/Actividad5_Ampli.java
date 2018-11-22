/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Canales-PC
 */
public class Actividad5_Ampli {
    public static void main(String args[]){
        int n = Integer.parseInt(args[0]);
        switch(n){
            case 1:
                try{
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/unidad2","root","");
                    Statement sentencia = conexion.createStatement();
                    String sql ="INSERT INTO productos VALUES(1,'Leche',10,5,3),(2,'Carne',10,5,3),(3,'Pescado',10,5,3)";
                    String sql1= "INSERT INTO clientes VALUES(1,'Juan','C/Trajano','Andujar','999999999','99999999H')";
                    String sql2="INSERT INTO ventas VALUES(1,'10/12/18',1,1,5)";
                    int filas = sentencia.executeUpdate(sql);
                    filas+=sentencia.executeUpdate(sql1);
                    filas+=sentencia.executeUpdate(sql2);
                    System.out.println("Registros insertados: "+filas);
                    sentencia.close();
                    conexion.close();
                }catch(ClassNotFoundException cn){
                    cn.printStackTrace();
                }catch(SQLException e){
                   e.printStackTrace(); 
                }
                break;
            case 2:
                try{
                    Class.forName("oracle.jdbc.driver.OracleDriver");
                    Connection conexion = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:XE","SYSTEM","system");
                    Statement sentencia = conexion.createStatement();
                    String sql ="INSERT INTO productos VALUES(1,'Leche',10,5,3),(2,'Carne',10,5,3),(3,'Pescado',10,5,3)";
                    String sql1= "INSERT INTO clientes VALUES(1,'Juan','C/Trajano','Andujar','999999999','99999999H')";
                    String sql2="INSERT INTO ventas VALUES(1,'10/12/18',1,1,5)";
                    int filas = sentencia.executeUpdate(sql);
                    filas+=sentencia.executeUpdate(sql1);
                    filas+=sentencia.executeUpdate(sql2);
                    System.out.println("Registros insertados: "+filas);
                    sentencia.close();
                    conexion.close();
                }catch(ClassNotFoundException cn){
                    cn.printStackTrace();
                }catch(SQLException e){
                   e.printStackTrace(); 
                }
                break;
            case 3:
                try{
                    Class.forName("org.sqlite.JDBC");
                    Connection conexion = DriverManager.getConnection("jdbc:sqlite:./unidad2.db");
                    Statement sentencia = conexion.createStatement();
                    String sql ="INSERT INTO productos VALUES(1,'Leche',10,5,3),(2,'Carne',10,5,3),(3,'Pescado',10,5,3)";
                    String sql1= "INSERT INTO clientes VALUES(1,'Juan','C/Trajano','Andujar','999999999','99999999H')";
                    String sql2="INSERT INTO ventas VALUES(1,'10/12/18',1,1,5)";
                    int filas = sentencia.executeUpdate(sql);
                    filas+=sentencia.executeUpdate(sql1);
                    filas+=sentencia.executeUpdate(sql2);
                    System.out.println("Registros insertados: "+filas);
                    sentencia.close();
                    conexion.close();
                }catch(ClassNotFoundException cn){
                    cn.printStackTrace();
                }catch(SQLException e){
                   e.printStackTrace(); 
                }
                
                
                break;
            default:
                System.out.println("No se a insertado el parametro");
        }
    }
}
