
package userFunctions;

import DB.DbConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import static java.sql.Types.VARCHAR;
import java.util.HashMap;



public class UserFunctions {
    String dpt;
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
    
    public ResultSet fillResultForm(int level,String dpt){
        this.dpt=dpt;
        ResultSet rs=null;
        int lvl=getYear(level);
        int sem=getSemester(level);
 
        rs=getSubjects(lvl,sem);
        return rs;
    
    }
    
    public ResultSet getSubjects(int level,int sem){
        ResultSet rs=null;
        try {
            
            CallableStatement cst=con.prepareCall("{call retrieveCourses(?,?,?)}");
            cst.setInt(1, sem);
            cst.setInt(2, level);
            cst.setString(3, dpt);
            
            rs=cst.executeQuery();
            
            
            
            
        }catch (Exception e) {
            System.out.println(e);
        }
        
        return rs;
    }
   
    
    public String getUserDepartment(String uname){
        String dpt="";
        try {
            
            
            CallableStatement cst=con.prepareCall("{?=call getStuDepartment(?)}");
            cst.registerOutParameter(1, VARCHAR);
            cst.setString(2, uname);
            cst.execute();
            dpt=cst.getString(1);
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return dpt;
    }
    
    public int getSemester(int s){
        int sem=0;
        if (s%2==0){
            sem=1;
        }else{
            sem=2;
        }
        return sem;
    }
    
    public int getYear(int s){
        int acYear=0;
        if (s==0 || s==1){
            acYear=1;
        } else if (s==2 || s==3){
            acYear=2;
        }else if (s==4 || s==5){
            acYear=3;
        }else{
            acYear=4;
        }
        return acYear;
    }
    
    public void saveResults(String uname,HashMap<String,String> results){
        for (String i : results.keySet()) {
            System.out.println("key: " + i + " value: " + results.get(i));
        }
        
    }
}
