/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosadattema2;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

/**
 *
 * @author Canales-PC
 */
public class Main {
    static String DBDep = "EMPLEDEP.YAP";
    public static void main(String args[]){
        ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), DBDep);
        /*Departamentos dep1 = new Departamentos (10, "DESARROLLO","MADRID");
        Departamentos dep2 = new Departamentos (20, "PRODUCCION","BILBAO");
        Departamentos dep3 = new Departamentos (30, "FORMACION","BARCELONA");
        Empleados emp1 = new Empleados(7369,"SANCHEZ","VENDEDOR",7698,"1991-02-22",1625,650,20);
        Empleados emp2 = new Empleados(7370,"PEREZ","PROFESOR",7698,"1993-03-02",1626,50,30);
        Empleados emp3 = new Empleados(7371,"JIMENEZ","MECANICO",7698,"1994-08-06",1627,190,10);
        db.store(dep1);
        db.store(dep2);
        db.store(dep3);
        db.store(emp1);
        db.store(emp2);
        db.store(emp3);
        db.close();*/
        ObjectSet<Empleados> result;
        ObjectSet<Departamentos> resDep;
        int nDep=20;
        resDep = db.queryByExample(new Departamentos(nDep,null,null));
        if(resDep.isEmpty()){
            System.out.println("No existe el numero de departamento");
        }else{
            Departamentos dep = (Departamentos) resDep.next();
            System.out.println("Departamento de: "+dep.getDnombre());
            result = db.queryByExample(new Empleados(0,null,null,0,null,0,0,nDep));
            if(result.isEmpty()){
                System.out.println("No existen empleados en ese departamento");
            }else{
                System.out.println(result.toString());
            }
        }
        db.close();
    }
}
