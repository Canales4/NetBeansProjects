/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Canales-PC
 */
public class Actividad2_6_part2 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo","root","");
            Statement sentencia = conexion.createStatement();
            String sql ="select e.apellido, e.salario, d.dnombre from empleados e, departamentos d "
                    + "where e.dept_no=d.dept_no and e.salario=(select max(salario) from empleados)";
            ResultSet resul = sentencia.executeQuery(sql);
            while(resul.next()){
                System.out.printf("%s, %f, %s %n", resul.getString(1), resul.getFloat(2), resul.getString(3));
            }
            resul.close();
            sentencia.close();
            conexion.close();
        }catch(ClassNotFoundException cn){
            cn.printStackTrace();
        }catch(SQLException e){
           e.printStackTrace(); 
        }   
    }
}
