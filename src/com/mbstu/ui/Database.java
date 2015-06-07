
package com.mbstu.ui;

import com.mbstu.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


class Database {
   
    
   

   
   public void DepositAmmountEntry(String s1,String s2,String s3){
       System.out.println(" "+s1+" "+s2+" "+s3);
       String Balance = null;
      
       String name = null;
       ResultSet rs = null;
        try
        {
             String SQLStatement="SELECT custName FROM t_NewAcc WHERE AccNo='"+s1+"'";
             System.out.println(SQLStatement);

             Connection connection1=DatabaseConnection.getConnection();
             Statement statement=connection1.createStatement();
             rs = statement.executeQuery(SQLStatement);

             while(rs.next())
             {
                name = rs.getObject(1).toString();
                System.out.println(" "+name);
             }
        }
        catch(SQLException cnfe)
        {
            System.out.println(cnfe);
        }

        catch(Exception squl)
        {
            System.out.println("HI"+squl);
        }
        int a=Integer.parseInt(s3);
       int b=200;
      if(a>=b){
             try
        {
             String SQLStatement = "INSERT INTO DepositInfo VALUES" +
            "('"+name+"','"+s1+"','"+s2+"','"+s3+"')";
             String SQLStatement2 = "SELECT Balance FROM t_NewAcc WHERE AccNo ='"+s1+"'";
             System.out.println(SQLStatement);

           Connection connection1=DatabaseConnection.getConnection();
           Statement statement=connection1.createStatement();
             statement.executeUpdate(SQLStatement);
             rs = statement.executeQuery(SQLStatement2);

             while(rs.next())
             {
                Balance = rs.getObject(1).toString();
                 System.out.println("HI"+Balance);
             }

             connection1.close();
        }
        catch(SQLException cnfe)
        {
            System.out.println(cnfe);
        }

      }
      else{
              JOptionPane.showMessageDialog(null,"Atleast 200Tk must be Deposit");
              return ;
      }


        System.out.println("HI"+Balance);
        try
        {
             int s41 = Integer.parseInt(s3);
             int Balance1 = Integer.parseInt(Balance);
             Balance1 = Balance1+s41;
             String Balance2 = Integer.toString(Balance1);
             String SQLStatement="UPDATE t_NewAcc SET Balance = '"+Balance2+"' WHERE AccNo='"+s1+"'";
             System.out.println(SQLStatement);
             String sql2="SELECT Balance,custName from t_NewAcc where AccNo='"+s1+"'";

            Connection connection1=DatabaseConnection.getConnection();
             Statement statement=connection1.createStatement();
             statement.executeUpdate(SQLStatement);
              rs = statement.executeQuery(sql2);
                while(rs.next())
             {

                    JOptionPane.showMessageDialog(null,"New Balance of\nMr/Mrs "+rs.getString(2)+"\nis "+rs.getString(1)+" Tk");
             }
             connection1.close();
        }
         catch(SQLException cnfe)
        {
            System.out.println(cnfe);
              JOptionPane.showMessageDialog(null,"Database Connection error");
        }

        catch(Exception sql)
        {
            System.out.println("HI"+sql);
              JOptionPane.showMessageDialog(null,"Database error");
        }

   }

  public void WithdrawAmmountEntry(String s1,String s2,String s3)
    {
        System.out.println(" "+s3);

      
        String amm = null;
        String name = null;
        ResultSet Result = null;
        int a=Integer.parseInt(s3);
       int b=200;
        if(a>=b){
           try
        {
             String SQLStatement="SELECT custName,Balance FROM t_NewAcc WHERE AccNo='"+s1+"'";
             System.out.println(SQLStatement);
          Connection connection1=DatabaseConnection.getConnection();

             Statement statement=connection1.createStatement();
             Result = statement.executeQuery(SQLStatement);

             while(Result.next())
             {
                amm = Result.getObject(2).toString();
                name = Result.getObject(1).toString();
                System.out.println(amm+" "+name);
             }

             int amm1 = Integer.parseInt(amm);
             int s41 = Integer.parseInt(s3);
            
             if(amm1 >= s41+100)
             {
                 amm1 = amm1-s41;
                 String amm2 = Integer.toString(amm1);
                 try
                 {




             String SQLStatement1="UPDATE t_NewAcc SET Balance = '"+amm2+"' WHERE AccNo='"+s1+"'";
             System.out.println(SQLStatement1);
             String sql2="SELECT Balance,custName from t_NewAcc where AccNo='"+s1+"'";
             Connection connection2=DatabaseConnection.getConnection();
             Statement statement1=connection2.createStatement();
             statement1.executeUpdate(SQLStatement1);
             Result= statement.executeQuery(sql2);
                while(Result.next())
             {

                    JOptionPane.showMessageDialog(null,"New Balance of\nMr/Mrs "+Result.getString(2)+"\nis "+Result.getString(1)+" Tk");
             }
             connection2.close();
                 }
                catch(SQLException cnfe)
                {
                     System.out.println(cnfe);
                     JOptionPane.showMessageDialog(null,"Database error 1");
                }

                catch(Exception squl)
                {
                     System.out.println("lolmbst"+squl);
                     JOptionPane.showMessageDialog(null,"Database error 2");
                }


             }
 else{
            JOptionPane.showMessageDialog(null,"There is no enough money in Account");
              return ;
 }
          
        connection1.close();
        }
        catch(SQLException cnfe)
        {
            System.out.println(cnfe);
            JOptionPane.showMessageDialog(null,"Database error 3");
        }

        catch(Exception squl)
        {
            System.out.println("HI"+squl);
            JOptionPane.showMessageDialog(null,"Database error 4");
        }

        try
        {
             String SQLStatement="INSERT INTO WithdrawInfo VALUES" +
             "('"+name+"','"+s1+"','"+s2+"','"+s3+"')";
             System.out.println(SQLStatement);

             Connection connection1=DatabaseConnection.getConnection();



             Statement statement=connection1.createStatement();
             statement.executeUpdate(SQLStatement);
             connection1.close();
        }
        catch(SQLException cnfe)
        {
            System.out.println(cnfe);
            JOptionPane.showMessageDialog(null,"Database error 5");
        }

        catch(Exception squl)
        {
            System.out.println("HI"+squl);
            JOptionPane.showMessageDialog(null,"Database error 6");
        }
        }
        else{
                 JOptionPane.showMessageDialog(null,"Atleast 200Tk must be Withdraw");
           }
     }

    void TransactionMoney(String s1,String s2, String s3, String s4) {
          System.out.println(" "+s3);


          String amm = null;
          String name = null;
          String balance2 = null;
          String name1 = null;
          ResultSet Result = null;

        try
        {
             String SQLStatement="SELECT custName,Balance FROM t_NewAcc WHERE AccNo='"+s1+"'";
             System.out.println(SQLStatement);
          
             Connection connection1=DatabaseConnection.getConnection();
            
             Statement statement=connection1.createStatement();
             Result = statement.executeQuery(SQLStatement);

             while(Result.next())
                {
                amm = Result.getObject(2).toString();
                name = Result.getObject(1).toString();
                System.out.println(amm+" "+name);
                }

             int amm1 = Integer.parseInt(amm);
             int balance = Integer.parseInt(s3);
             if(amm1>balance){
                   int a=500;
             amm1 = amm1-balance;
            if(amm1>=a){
                   String amm2 = Integer.toString(amm1);
                   try
                   {

                  String SQLStatement1="UPDATE t_NewAcc SET Balance = '"+amm2+"' WHERE AccNo='"+s1+"'";
                  System.out.println(SQLStatement1);
                  String sql2="SELECT Balance,custName from t_NewAcc where AccNo='"+s1+"'";
                  Connection connection2=DatabaseConnection.getConnection();

                  Statement statement1=connection2.createStatement();
                  statement1.executeUpdate(SQLStatement1);
                  Result= statement.executeQuery(sql2);
                  while(Result.next())
                  {

                    JOptionPane.showMessageDialog(null,"New Balance of\nMr/Mrs "+Result.getString(2)+"\nis "+Result.getString(1)+" Tk");
                  }
                 connection2.close();
                 }

                   catch(SQLException cnfe)
                {
                     System.out.println(cnfe);
                     JOptionPane.showMessageDialog(null,"Database error 1");
                }

                catch(Exception squl)
                {
                     System.out.println("lolmbst"+squl);
                     JOptionPane.showMessageDialog(null,"Database error 2");
                }

            }
              else{
                JOptionPane.showMessageDialog(null,"Your Total amount is '"+amm+"' ,So you can't transfer this full cash!!!");
                 return;
                }

             }
         else{
            JOptionPane.showMessageDialog(null,"There is no enough money in Account");
              return ;
           }
            

             
          
        connection1.close();
        }
        catch(SQLException cnfe)
        {
            System.out.println(cnfe);
            JOptionPane.showMessageDialog(null,"Database error 3");
        }

        catch(Exception squl)
        {
            System.out.println("HI"+squl);
            JOptionPane.showMessageDialog(null,"Database error 4");
        }



       


       try{
         String SQLStatement="SELECT custName,Balance FROM t_NewAcc WHERE AccNo='"+s2+"'";
             System.out.println(SQLStatement);
          Connection connection1=DatabaseConnection.getConnection();
            
             Statement statement=connection1.createStatement();
             Result = statement.executeQuery(SQLStatement);

             while(Result.next())
             {
                balance2 = Result.getObject(2).toString();
                name1 = Result.getObject(1).toString();
                System.out.println(balance2+" "+name1);
             }

             int amm2 = Integer.parseInt(balance2);
             int balance3 = Integer.parseInt(s3);


                 amm2 = amm2+balance3;
                 String balance4= Integer.toString(amm2);
                 try
                 {




             String SQLStatement1="UPDATE t_NewAcc SET Balance = '"+balance4+"' WHERE AccNo='"+s2+"'";
             System.out.println(SQLStatement1);
          Connection connection2=DatabaseConnection.getConnection();
           
             Statement statement1=connection2.createStatement();
             statement1.executeUpdate(SQLStatement1);
           
            
             connection2.close();
                 }
                catch(SQLException cnfe)
                {
                     System.out.println(cnfe);
                     JOptionPane.showMessageDialog(null,"Database error 1");
                }

                catch(Exception squl)
                {
                     System.out.println("lolmbst"+squl);
                     JOptionPane.showMessageDialog(null,"Database error 2");
                }


        connection1.close();
        }
        catch(SQLException cnfe)
        {
            System.out.println(cnfe);
            JOptionPane.showMessageDialog(null,"Database error 3");
        }

        catch(Exception squl)
        {
            System.out.println("HI"+squl);
            JOptionPane.showMessageDialog(null,"Database error 4");
        }


        try
        {
             String SQLStatement="INSERT INTO transfer VALUES" +
             "('"+s1+"','"+name+"','"+s2+"','"+name1+"','"+s4+"','"+s3+"')";
             System.out.println(SQLStatement);
          Connection connection1=DatabaseConnection.getConnection();
             Statement statement=connection1.createStatement();
             statement.executeUpdate(SQLStatement);
             connection1.close();
        }
        catch(SQLException cnfe)
        {
            System.out.println(cnfe);
            JOptionPane.showMessageDialog(null,"Database error 5");
        }

        catch(Exception squl)
        {
            System.out.println("HI"+squl);
            JOptionPane.showMessageDialog(null,"Database error 6");
        }
  

}

    void deleteTransaction(String AccountNo) {
         System.out.println(" "+AccountNo);

   
       int acc = Integer.parseInt(AccountNo);

        try
        {
             String SQLStatement="DELETE   FROM t_NewAcc WHERE AccNo='"+AccountNo+"'";
             System.out.println(SQLStatement);
             System.out.println(acc);
             Connection connection1=DatabaseConnection.getConnection();
             Statement statement=connection1.createStatement();
             statement.executeUpdate(SQLStatement);
             connection1.close();
        }
        catch(SQLException cnfe)
        {
             
           System.out.println(cnfe);
        }

        catch(Exception squl)
        {
            System.out.println("HI"+squl);
            
        }
    }
}

     
    


