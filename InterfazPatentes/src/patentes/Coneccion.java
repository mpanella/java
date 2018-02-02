
package patentes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Coneccion {
    
    Connection on ;  

public Connection conexion(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    on = DriverManager.getConnection("jdbc:mysql://localhost/patentes","mauro","1234");
    System.out.println("conectado");
    }catch(Exception e ){
        System.out.println(e.getMessage());
    }return on;
}
Statement createStatement(){
    throw new  UnsupportedOperationException(" no aportado ");
}


}
    

