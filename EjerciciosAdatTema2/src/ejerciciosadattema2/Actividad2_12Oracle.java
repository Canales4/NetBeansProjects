/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema2;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

/**
 *
 * @author Canales-PC
 */
public class Actividad2_12Oracle {
    public static void main(String args[])throws ClassNotFoundException{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection conexion=null;
        try{
            conexion = DriverManager.getConnection("jdbc:oracle:thin@localhost:1521:XE","SYSTEM","system");
            int dep = Integer.parseInt(args[0]);
            String sql = "{?= actividad12O (?, ?)}";
            CallableStatement llamada = conexion.prepareCall(sql);
            llamada.registerOutParameter(1,Types.FLOAT);
            llamada.registerOutParameter(3,Types.INTEGER);
            llamada.setInt(2, dep);
            llamada.executeUpdate();
            float media=llamada.getFloat(1);
            int numero=llamada.getInt(3);
            System.out.printf("Departamentos Nº: "+dep+" Numero de empleados "+numero+" Salario Medio"+media);
            llamada.close();
            conexion.close();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
