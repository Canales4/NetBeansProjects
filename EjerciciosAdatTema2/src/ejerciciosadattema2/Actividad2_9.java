/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema2;

import java.sql.*;

/**
 *
 * @author Canales-PC
 */
public class Actividad2_9 {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo", "root", "");
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("select * from empleados");
            ResultSetMetaData rsmd = rs.getMetaData();
            int nColumnas = rsmd.getColumnCount();
            String nula;
            System.out.printf("Numero de columnas recuperadas: %d%n", nColumnas);
            for(int i=1; i<=nColumnas; i++) {
                System.out.printf("Columna %d: %n",i);
                System.out.printf(" Nombre:%s%n Tipo: %s%n", rsmd.getColumnName(i),rsmd.getColumnTypeName(i));
                if(rsmd.isNullable(i)==0) {
                        nula = "NO";
                }else {
                        nula = "SI";
                }
                System.out.printf("Puede ser nula?: %s%n",nula);
                System.out.printf("Maximo ancho de la columna: %d%n",rsmd.getColumnDisplaySize(i));
            }
            sentencia.close();
            rs.close();
            conexion.close();
        }catch(ClassNotFoundException cnfe) {
                cnfe.printStackTrace();
        }catch(SQLException e){
                e.printStackTrace();
        }
    }
}
