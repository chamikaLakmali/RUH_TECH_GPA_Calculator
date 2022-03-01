
package userFunctions;

import DB.DbConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;


public class UserFunctions {
    
    DbConnection dbConnection=new DbConnection();
    Connection con=dbConnection.getDbConnection();
    
    public int login(String uname,char[] pwrd){
        
        int stat=0; 
        String password=new String(pwrd);
   
        try {

            CallableStatement cStmt = con.prepareCall("{? = call login(?,?)}");
            cStmt.registerOutParameter(1,java.sql.Types.INTEGER);
            
            cStmt.setString(2, uname);
            cStmt.setString(3, password);
            cStmt.execute();
            stat=cStmt.getInt(1);
            
            
        } catch (Exception e) {
            System.out.println("exception: "+e);
        }
           
        return stat;
        
    }
    
    public String getUserType(String uname){
        String utype="";
        try {
            CallableStatement cs=con.prepareCall("{?=call getUserType(?)}");
            cs.registerOutParameter(1, java.sql.Types.VARCHAR);
            cs.setString(2, uname);
            cs.execute();
            utype=cs.getString(1);
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        
        
        return utype;
    }
    
}
