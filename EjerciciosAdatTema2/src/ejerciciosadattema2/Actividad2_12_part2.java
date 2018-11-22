package ejerciciosadattema2;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Canales-PC
 */
public class Actividad2_12_part2 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo","root","");
            String dep = args[0];
            String sql ="{ call actividad12 (?,?,?)}";
            CallableStatement llamada = conexion.prepareCall(sql);
            llamada.setInt(1, Integer.parseInt(dep));
            llamada.registerOutParameter(2, Types.FLOAT);
            llamada.registerOutParameter(3, Types.INTEGER);
            llamada.executeUpdate(sql);
            float media=llamada.getFloat(2);
            int numero=llamada.getInt(3);
            System.out.printf("Departamentos Nº: "+dep+" Numero de empleados "+numero+" Salario Medio "+media);
            llamada.close();
            conexion.close();
        }catch(ClassNotFoundException cn){
            cn.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
