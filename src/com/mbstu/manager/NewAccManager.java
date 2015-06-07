
package com.mbstu.manager;

import com.mbstu.bean.AccountBean;
import com.mbstu.util.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class NewAccManager {
    public static boolean isSaveAccount(AccountBean accountBean){
         try {
            Connection con=DatabaseConnection.getConnection();
            if(con==null){
                return false;
            }
            String strAccount="insert into t_NewAcc(AccNo,AccName,custName,Balance,Address,secCode,MobileNo,EmailID,Image)values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(strAccount);
           
            pst.setString(1,accountBean.getAccNo());
            pst.setString(2,accountBean.getAccName());
            pst.setString(3,accountBean.getCustName());
            pst.setString(4,accountBean.getBalance());
            pst.setString(5,accountBean.getAddress());
            pst.setString(6,accountBean.getSecCode());
            pst.setString(7,accountBean.getMobileNo());
            pst.setString(8,accountBean.getEmailID());
            pst.setString(9,accountBean.getImage());

            pst.addBatch();

            pst.executeBatch();
            pst.close();
            con.close();
             return true;
        } catch (SQLException e) {
           // e.printStackTrace();
            System.out.println(e);
            return false;
        }
       
    }
public static List<AccountBean> getCustomers(){

    List<AccountBean> customerList = new ArrayList<AccountBean>();
        try {
            Connection con = DatabaseConnection.getConnection();
            if(con == null)
            {
                return customerList;
            }
            String sql = "Select * from t_NewAcc";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            AccountBean accountBean;
            while(rs.next())
            {
                accountBean = new AccountBean();
                /*student.setId(rs.getString(1));
                student.setStudentName(rs.getString(2));
                student.setMobileNo(rs.getString(3));
                student.setDeptName(rs.getString(4));*/
                accountBean.setAccNo(rs.getString("AccNo"));
                accountBean.setAccName(rs.getString("AccName"));
                accountBean.setCustName(rs.getString("custName"));
                accountBean.setBalance(rs.getString("Balance"));
                accountBean.setAddress(rs.getString("Address"));
                accountBean.setSecCode(rs.getString("secCode"));
                accountBean.setMobileNo(rs.getString("MobileNo"));
                accountBean.setEmailID(rs.getString("EmailID"));
                accountBean.setImage(rs.getString("Image"));

                customerList.add(accountBean);
            }
            st.close();
            con.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return customerList;
}
}
