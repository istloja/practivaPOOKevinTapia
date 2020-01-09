/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_Datos;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author its
 */
public class Conexion_Basica {
    public void leer (String usuario,String clave){
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/persona?characterEncoding=latin1",usuario,clave);
            System.out.println(conexion.getCatalog());
            Statement variable = conexion.createStatement();
            //ahi ponmemos las consultas
            ResultSet result = variable.executeQuery("select * from persona");
            while(result.next()){
                System.out.println(result.getString("nombre")+" "+result.getString("apellido"));
            }
        } catch (Exception e) {
            System.out.println("hubo un error"+e);
        }

    }
    public static void main(String[] args) {
       Conexion_Basica objeto = new Conexion_Basica();
       objeto.leer("test", "1234");
    
    }
}
