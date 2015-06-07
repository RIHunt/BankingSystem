
package com.mbstu.ui;

import com.mbstu.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {

 String acname=null;
 String balance=null;
 String acno=null;
private ResultSet rs;

 String val_password1(String acno, String secCode) {

               try
        {
          String sql="select AccName,secCode from t_NewAcc  where AccNo='"+acno+"' AND secCode='"+secCode+"'";

            Connection connection1=DatabaseConnection.getConnection();
            Statement statement=connection1.createStatement();
             rs = statement.executeQuery(sql);

             while(rs.next())
             {
               acname = rs.getObject(1).toString();
               System.out.println(" "+acname);

             
             }

        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }

        return acname;

    }

String val_password2(String acno, String seccode) {

               try
        {
          String sql="select Balance from t_NewAcc  where AccNo='"+acno+"' AND secCode='"+seccode+"'";

            Connection connection1=DatabaseConnection.getConnection();
            Statement statement=connection1.createStatement();
             rs = statement.executeQuery(sql);

             while(rs.next())
             {
                balance = rs.getObject(1).toString();
                System.out.println(" "+balance);
             }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        
        return balance;
    }

   }

















    



