
package DB;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DbConnection {
    
    public Connection getDbConnection(){
        Connection con=null;
        try {
         
            con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db_gpa", "root", "");
            
                       
        } catch (Exception ex) {
            
        }
        return con;
        
    }
    
}
