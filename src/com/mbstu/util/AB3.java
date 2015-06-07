package com.mbstu.util;

import java.sql.*;
public class AB3{
static Connection con=null;
public static void main(String args[]){
System.out.println("Table Create");
try{

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

 con=DriverManager.getConnection("jdbc:Mysql://localhost/bank","root","ict");
 try{
Statement st=con.createStatement();
String table = "CREATE TABLE transfer(AccNum_from varchar(20),custNamefrom varchar(20),AccNum_to varchar(20),custNameto varchar(20),Date date,Ammount varchar(20))";
st.executeUpdate(table);

System.out.println("Table creation process successfully!");

}
catch(Exception e){System.out.println("Table all ready Exist");}
con.close();
}

catch(Exception e){e.printStackTrace();}


    }

   }