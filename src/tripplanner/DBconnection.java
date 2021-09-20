
package tripplanner;

import static tripplanner.DBconnection.connection;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBconnection {
    
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";

 final static String DB_URL = "jdbc:mysql://localhost:3306/tripplanner";   
    
final static String USER = "root";
final static String Pass = "";
 
public static Connection connection() 
{
    
   try{
       
       Class.forName(JDBC_DRIVER);
       Connection conn=DriverManager.getConnection(DB_URL,USER,Pass);
       
       return conn;
   } 
    
    catch(Exception e){
    
   JOptionPane.showMessageDialog(null,e);
    return null;
}
}
}
    

