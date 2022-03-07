/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userFunctions;

import DB.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author User01
 */
public class Test {
    public static void main(String[] args) {
        printResult();
        
    }
    
    public static ResultSet returnSubject(){
        
        ResultSet rs=null;
        DbConnection dbConnection=new DbConnection();
        try {
            Connection con=dbConnection.getDbConnection();
            PreparedStatement pst=con.prepareStatement("Select *from user");
            rs=pst.executeQuery();
            
            
            
        } catch (Exception e) {
            System.out.println(e);
        }
        
        return rs;
    }
    
    public static void printResult(){
        ResultSet rs=returnSubject();
        try {
            while(rs.next()){
                System.out.println(rs.getString(1));
        }
        } catch (Exception e) {
            System.out.println("ex:"+e);
        }
        
        
    }
    
}
