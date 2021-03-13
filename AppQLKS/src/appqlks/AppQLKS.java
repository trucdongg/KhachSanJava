/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appqlks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author abmsk
 */
public class AppQLKS {
     public static Connection layKetNoi(){
        Connection ketNoi=null;
        String uRL="jdbc:sqlserver://;databaseName=QLKS";
        String userName="sa";
        String password="123";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            ketNoi=DriverManager.getConnection(uRL, userName, password);
            System.out.println("Kết Nối Thành Công");
        }
        catch(ClassNotFoundException| SQLException ex){
            System.out.println("Nope");
        }
        return ketNoi;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AppQLKS.layKetNoi();
    }
    
}
