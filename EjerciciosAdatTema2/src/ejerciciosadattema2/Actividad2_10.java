/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema2;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Canales-PC
 */
public class Actividad2_10 {
    public static void main(String args[]){
        int emp_no= Integer.parseInt(args[0]);
        String apellido=args[1];
        String oficio=args[2];
        int dir = Integer.parseInt(args[3]);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        String fechaComoCadena = sdf.format(new Date());
        Float salario = Float.parseFloat(args[4]);
        Float comision = Float.parseFloat(args[5]);
        int dept_no = Integer.parseInt(args[6]);
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/ejemplo","root","");
            if(existeDep(conexion,dept_no)==true && numEmp(conexion, emp_no)==true && salarioMayor(salario)==true 
                    && existeDir(conexion,dir)==true && notNull(apellido,oficio)==true){
                String sql = String.format("INSERT INTO empleados VALUES(%d, '%s', '%s',%d, '%s', %.0f, %.0f, %d)", emp_no,apellido,oficio,dir,fechaComoCadena,salario,comision,dept_no);
                Statement sentencia = conexion.createStatement();
                int filas = sentencia.executeUpdate(sql);
                System.out.println("Filas registros insertados: "+filas);
            }
        }catch(ClassNotFoundException | SQLException cn){
            System.out.println(cn);
        }
    }
    
    public static boolean existeDep(Connection conexion, int dept_no){
        boolean existe=false;
        try{
            Statement sentencia = conexion.createStatement();
            String sql = String.format("select dept_no from departamentos where dept_no= %d",dept_no);
            ResultSet resul = sentencia.executeQuery(sql);
            if(resul.next()){
                existe=true;
            }else{
                System.out.println("No existe ese departamento");
            }
        }catch(SQLException esql){
            System.out.println(esql);
        }
        return existe;
    }
    
    private static boolean numEmp(Connection conexion, int emp_no){
        boolean existe = true;
        try{
            Statement sentencia = conexion.createStatement();
            String sql = String.format("select emp_no from empleados where emp_no =%d",emp_no);
            ResultSet resul = sentencia.executeQuery(sql);
            if(resul.next()){
                existe=false;
                System.out.println("Existe ese emp_no y no se puede insertar");
            }
        }catch(SQLException esql){
            System.out.println(esql);
        }
        return existe;
    }
    
    private static boolean salarioMayor(Float salario){
        boolean existe=true;
        if(salario<=0){existe=false;System.out.println("Salario es negativo o 0");}
        return existe;
    }
    
    private static boolean existeDir(Connection conexion, int dir){
        boolean existe = true;
        try{
            Statement sentencia = conexion.createStatement();
            String sql = String.format("select dir from empleados where dir =%d",dir);
            ResultSet resul = sentencia.executeQuery(sql);
            if(resul.next()){}else{existe=false;System.out.println("Dir no existe");}
        }catch(SQLException esql){
            System.out.println(esql);
        }
        return existe;
    }
    
    private static boolean notNull(String apellido, String oficio){
        boolean existe = true;
        if(apellido == null || oficio ==null){
            existe=false;
            System.out.println("No pueden ser nulos el apellido y el oficio");
        }
        return existe;
    }
}
