/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema2;

import static ejerciciosadattema2.Actividad2_10.existeDep;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DecimalFormat;

/**
 *
 * @author Canales-PC
 */
public class Actividad2_11 {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo","root","");
            int dep = Integer.parseInt(args[0]);
            if(existeDep(conexion,dep)){
                String sql = "SELECT apellido, salario, oficio,d.dnombre FROM empleados e, "
                        + "departamentos d WHERE e.dept_no = ? and e.dept_no=d.dept_no";
                String sqlSalarioMedio = "SELECT avg(salario) FROM empleados WHERE dept_no=?";
                PreparedStatement sentencia = conexion.prepareStatement(sql);
                PreparedStatement sentenciaSalario=conexion.prepareStatement(sqlSalarioMedio);
                sentencia.setInt(1, dep);
                sentenciaSalario.setInt(1, dep);
                System.out.println("Departamento nº: "+dep);
                ResultSet rs = sentencia.executeQuery();
                ResultSet rs2 = sentenciaSalario.executeQuery();
                int cont =0;
                while(rs.next()){
                    if(cont==0){
                        System.out.println("Nombre Departamento:"+rs.getString("dnombre"));
                        System.out.println("APELLIDO SALARIO OFICIO \n");
                    }
                    System.out.printf("%s %.2f %s %n",rs.getString("apellido"),rs.getFloat("salario"),rs.getString("oficio"));
                    cont++;
                }
                rs2.next();
                DecimalFormat formato = new DecimalFormat("##,##0.00");
                String valorFormateado=formato.format(rs2.getFloat(1));
                System.out.printf("%n Salario Medio: %s",valorFormateado);
                System.out.printf("%n Nº de Registros: %d %n",cont);
                rs.close();
                rs2.close();
                sentencia.close();
                conexion.close();
            }else{
                System.out.println("El departamento no existe");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
