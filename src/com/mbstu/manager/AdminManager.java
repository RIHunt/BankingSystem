
package com.mbstu.manager;

import com.mbstu.bean.Adminbean;
import com.mbstu.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class AdminManager {

     public static boolean isSaveAccount(Adminbean adminbean){
         try {
            Connection con=DatabaseConnection.getConnection();
            if(con==null){
                return false;
            }
            String strAccount="insert into t_admin(adName, adPassword)values(?,?)";
            PreparedStatement pst=con.prepareStatement(strAccount);

            pst.setString(1,adminbean.getName());
            pst.setString(2,adminbean.getPassword());


            pst.addBatch();

            pst.executeBatch();
            pst.close();
            con.close();
             return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }
}
