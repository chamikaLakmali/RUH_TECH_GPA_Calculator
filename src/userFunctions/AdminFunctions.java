
package userFunctions;

import DB.DbConnection;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import static java.sql.Types.INTEGER;

    
public class AdminFunctions {
    DbConnection dbConnection=new DbConnection();
    
    public int insertSubjects(String cid,String cname,String dpt,int aYear,int nCredits,int sem,int crStat){
        int stat,errorStat=0;
        Connection con=dbConnection.getDbConnection();
        try {
            CallableStatement cst=con.prepareCall("{?=call checkSubAvailability(?)}");
            cst.registerOutParameter(1, INTEGER);
            cst.setString(2, cid);
            cst.execute();
            stat=cst.getInt(1);
            
            if (stat!=1){
                String inSql="INSERT INTO `courses`(`sub_id`, `sub_name`, `department`, `academic_year`, `semester`, `credit_status`, `no_credits`) VALUES (?,?,?,?,?,?,?)";
                PreparedStatement st;
                st = con.prepareStatement(inSql);
                st.setString(1, cid);
                st.setString(2, cname);
                st.setString(3, dpt);
                st.setInt(4, aYear);
                st.setInt(5, sem);
                st.setInt(6, crStat);
                st.setInt(7, nCredits);
                st.execute();
                
                errorStat=1;    
            }
            else{
                errorStat=0;
            }
            
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
            
        }
        
        return errorStat;
        
    }
    
}
