
package com.mbstu.ui;

import com.mbstu.bean.AccountBean;
import com.mbstu.manager.NewAccManager;

import com.mbstu.util.DatabaseConnection;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class HomePage extends javax.swing.JFrame {
      String image;

    List<AccountBean> accList = null;
  
   Database db = new Database();
     private Connection con;
        private PreparedStatement ps;
    

      MainWindow obj1;
    /** Creates new form HomePage */

    public HomePage(MainWindow obj){

        initComponents();
        obj1=obj;
        allValue();
        setSize(970,670);
        setLocation(20,40);
     setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    

    }

   public void allValue(){
       accList = NewAccManager.getCustomers();
       AllViewTable.setModel(createTable(getTableData(accList),getTableHeader()));
   }
   private String [] getTableHeader(){
      
       String [] s = {"AccNo", "AccName", "custName","Balance","Address","secCode","mobileNo","Email ID","Image"};
       return s;
    }

    private Object[][] getTableData(List<AccountBean> customerList){
        if(customerList == null || customerList.isEmpty())
        {
            return null;
        }
        Object[][] obj = new Object[customerList.size()][9];
        for(int i=0; i<customerList.size();i++)
        {
            AccountBean accountBean = customerList.get(i);
            obj[i][0] = accountBean.getAccNo();
            obj[i][1] = accountBean.getAccName();
            obj[i][2]=accountBean.getCustName();
            obj[i][3]=accountBean.getBalance();
            obj[i][4]=accountBean.getAddress();
            obj[i][5]=accountBean.getSecCode();
            obj[i][6]=accountBean.getMobileNo();
            obj[i][7]=accountBean.getEmailID();
            obj[i][8]=accountBean.getImage();
            
        }
        return obj;
    }

    private DefaultTableModel createTable(Object [][]object, String []String)
    {
        return new DefaultTableModel(object,String) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class,
                java.lang.String.class,java.lang.String.class,java.lang.String.class,
                java.lang.String.class,java.lang.String.class,java.lang.String.class
                };
            boolean[] canEdit = new boolean [] {
                false, false, false,false,false,false,false,false,false};
            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        };
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtAccNo = new javax.swing.JTextField();
        txtAccName = new javax.swing.JTextField();
        txtCustName = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtSecCode = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtImage = new javax.swing.JTextField();
        chectButton = new javax.swing.JButton();
        imageBtn = new javax.swing.JButton();
        OpenBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        ImageLabel = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        checkMobileNumLbl = new javax.swing.JLabel();
        txtMobileNo = new javax.swing.JTextField();
        checkEmailLbl = new javax.swing.JLabel();
        checkAccountNoLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        AllViewTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 18));
        jLabel1.setForeground(new java.awt.Color(153, 0, 51));
        jLabel1.setText("Open New Account  2013");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 0, 230, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel2.setText("Account No       :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 50, 130, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel3.setText("Account Name   :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 90, 130, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel4.setText("Customer Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 140, 120, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel5.setText("Balance            :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 180, 120, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel6.setText("Address           :");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 220, 120, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel7.setText("Security  Code  :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(360, 50, 120, 20);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel8.setText("Mobile No        :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(360, 90, 120, 20);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel9.setText("Email    ID       :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(360, 130, 120, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 16));
        jLabel10.setText("Image            :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(360, 170, 120, 20);

        txtAccNo.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtAccNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAccNoKeyTyped(evt);
            }
        });
        getContentPane().add(txtAccNo);
        txtAccNo.setBounds(150, 50, 170, 30);

        txtAccName.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtAccName);
        txtAccName.setBounds(150, 90, 170, 30);

        txtCustName.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtCustName);
        txtCustName.setBounds(150, 140, 170, 30);

        txtBalance.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtBalance);
        txtBalance.setBounds(150, 180, 170, 30);

        txtAddress.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtAddress);
        txtAddress.setBounds(150, 220, 170, 30);

        txtSecCode.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtSecCode);
        txtSecCode.setBounds(480, 50, 170, 30);

        txtEmail.setFont(new java.awt.Font("Tahoma", 0, 14));
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });
        getContentPane().add(txtEmail);
        txtEmail.setBounds(480, 130, 170, 30);

        txtImage.setEditable(false);
        txtImage.setFont(new java.awt.Font("Tahoma", 0, 14));
        getContentPane().add(txtImage);
        txtImage.setBounds(480, 170, 170, 30);

        chectButton.setText("Check");
        chectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chectButtonActionPerformed(evt);
            }
        });
        getContentPane().add(chectButton);
        chectButton.setBounds(50, 70, 80, 20);

        imageBtn.setText("imgbrows");
        imageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageBtnActionPerformed(evt);
            }
        });
        getContentPane().add(imageBtn);
        imageBtn.setBounds(560, 210, 120, 30);

        OpenBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.PNG"))); // NOI18N
        OpenBtn.setText("Open");
        OpenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenBtnActionPerformed(evt);
            }
        });
        getContentPane().add(OpenBtn);
        OpenBtn.setBounds(90, 580, 90, 30);

        DeleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delusr.png"))); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteBtn);
        DeleteBtn.setBounds(330, 580, 100, 30);

        UpdateBtn.setText("Update");
        UpdateBtn.setEnabled(false);
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });
        getContentPane().add(UpdateBtn);
        UpdateBtn.setBounds(460, 580, 100, 30);

        clearBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        clearBtn.setText("clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn);
        clearBtn.setBounds(590, 580, 90, 30);

        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBtn);
        ExitBtn.setBounds(710, 580, 90, 30);

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view.png"))); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchBtn);
        searchBtn.setBounds(210, 580, 100, 30);
        getContentPane().add(ImageLabel);
        ImageLabel.setBounds(750, 24, 190, 210);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24));
        jLabel11.setForeground(new java.awt.Color(153, 0, 153));
        jLabel11.setText("Show All Information  2013");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(240, 260, 300, 30);
        getContentPane().add(checkMobileNumLbl);
        checkMobileNumLbl.setBounds(670, 90, 250, 30);

        txtMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMobileNoKeyTyped(evt);
            }
        });
        getContentPane().add(txtMobileNo);
        txtMobileNo.setBounds(480, 90, 170, 30);
        getContentPane().add(checkEmailLbl);
        checkEmailLbl.setBounds(660, 130, 200, 30);
        getContentPane().add(checkAccountNoLbl);
        checkAccountNoLbl.setBounds(300, 30, 160, 30);

        AllViewTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "AccNo", "AccName", "CustName", "Balance", "Address", "SecCode", "Mobile No", "EmailNo", "Image", "Date"
            }
        )
        {

            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        AllViewTable.setDragEnabled(true);
        jScrollPane1.setViewportView(AllViewTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 330, 850, 250);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenBtnActionPerformed
      if(stCompleteForm() == false)
        {
            return;
        }
      
        String AccNo=txtAccNo.getText();
        String AccName=txtAccName.getText();
        String custName=txtCustName.getText();
        String balance=txtBalance.getText();
        String address=txtAddress.getText();
        String seccode=txtSecCode.getText();
        String mobileno=txtMobileNo.getText();
        String email=txtEmail.getText();
        image=txtImage.getText();

        AccountBean accObject=new AccountBean(AccNo,AccName,custName, balance, address, seccode, mobileno, email, image);
      
        boolean isSave=NewAccManager.isSaveAccount(accObject);
          if(isSave){
          allValue();
         JOptionPane.showMessageDialog(null, "Account Create Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        
     clear();
    }else{
      JOptionPane.showMessageDialog(null, "Don't Successfully Account Create ", "Fail", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_OpenBtnActionPerformed

    private void imageBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imageBtnActionPerformed
    JFileChooser jfc = new JFileChooser();
    int result = jfc.showOpenDialog(null);
    if (result==JFileChooser.APPROVE_OPTION )
    {



     image=String.valueOf(jfc.getSelectedFile());
     txtImage.setText(image);


     ImageIcon lol=new  ImageIcon(image);
       ImageLabel.setIcon(lol);


       

        }
       
    }//GEN-LAST:event_imageBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
       
        dispose();
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
      clear();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void chectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chectButtonActionPerformed
        String acno=txtAccNo.getText();
           String sql="select *from t_NewAcc where AccNo='"+ acno +"' ";
             try {
            boolean status=DatabaseConnection.checkValue(sql);
              if (status) {


                        JOptionPane.showMessageDialog(null,
			  "This Account Number Already Exist");
                        

			  } else {

			  JOptionPane.showMessageDialog(null,
			  "This Account Number Available");
                          }
             } catch (Exception e) {
        }
    }//GEN-LAST:event_chectButtonActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
          if(txtAccNo.getText() == null || txtAccNo.getText().trim().isEmpty())
        {
            txtAccNo.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Account Number", "Alert", JOptionPane.ERROR_MESSAGE);
           return;
        }
        String value=txtAccNo.getText();

                 try{

                    con=DatabaseConnection.getConnection();
		    ps=con.prepareStatement("select AccNo,AccName,custName,Balance,Address,secCode,MobileNo,EmailID,Image  from t_NewAcc where AccNo=?");
		    ps.setString(1,value);

		   ResultSet res=ps.executeQuery();
		   res.next();

	          // txtAccNo.setText(res.getString(1));
                   txtAccName.setText(res.getString(2));
		   txtCustName.setText(res.getString(3));
                   txtBalance.setText(res.getString(4));

                   txtAddress.setText(res.getString(5));
                   txtSecCode.setText(res.getString(6));
		   txtMobileNo.setText(res.getString(7));
                   txtEmail.setText(res.getString(8));
                   txtImage.setText(res.getString(9));

                  ImageIcon RF=new  ImageIcon(res.getString(9));
                  ImageLabel=new JLabel();
	          getContentPane().add(ImageLabel);
                  ImageLabel.setBounds(750, 24, 190, 210);
                  ImageLabel.setIcon(RF);
               
                  UpdateBtn.setEnabled(true);
                  txtBalance.setEditable(false);
                  con.close();
                 ps.close();

	     }catch(Exception e)
			{
		 JOptionPane.showMessageDialog(null, "AccName not found in database", "Not found", JOptionPane.INFORMATION_MESSAGE);
		   UpdateBtn.setEnabled(false);
          }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
           if(txtAccNo.getText() == null || txtAccNo.getText().trim().isEmpty())

           {
            txtAccNo.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Account Number", "Alert", JOptionPane.ERROR_MESSAGE);
           return;
          }
          String AccountNo=txtAccNo.getText();
             String sql="select *from t_NewAcc where AccNo='"+ AccountNo +"' ";
             try {
            boolean status=DatabaseConnection.checkValue(sql);
              if (status) {

                  db.deleteTransaction(AccountNo);
                  JOptionPane.showMessageDialog(null, "Record is deleted successfully");
                  allValue();
	         } else {
                JOptionPane.showMessageDialog(null,"The Account Number is not found!!!!!");
                          }
             } catch (Exception e) 
                   {
                 e.printStackTrace();
                }
       
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
                if(stCompleteForm()==false){
                   return;
                }
              
                try {
                    Statement statement = DatabaseConnection.getConnection().createStatement();
                    {
                        String String = "UPDATE t_NewAcc  SET " +
                                "  AccName    ='" + txtAccName.getText() +
                                "',custName           ='" + txtCustName.getText() +
                                "',Address    ='" + txtAddress.getText() +
                                "',secCode    ='" + txtSecCode.getText() +
                                "',MobileNo   ='" + txtMobileNo.getText() +
                                "',EmailID     ='"+txtEmail.getText()+
                                 "',Image     ='"+txtImage.getText()+
                                "' WHERE AccNo ='" + txtAccNo.getText() + "'";

                    statement.executeUpdate(String);
                    JOptionPane.showMessageDialog(null, "Record successfully updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                     try {
                         new HomePage(null).setVisible(true);
                          this.hide();
                        } catch (Exception ex) {
                     Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                    }
                 
                     clear();
              
                    }

                } catch (SQLException sqlex) {
                    sqlex.printStackTrace();
                }
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void txtMobileNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNoKeyTyped
String input = txtMobileNo.getText();
Pattern p = Pattern.compile("[A-Z,a-z,&%$@!()*^]");
Matcher m = p.matcher(input);
if (m.find()) {
checkMobileNumLbl.setText("* Enter only Numeric Value");
checkMobileNumLbl.setVisible(true);
checkMobileNumLbl.setForeground(Color.red);
}
else{
checkMobileNumLbl.setVisible(false);
}

    }//GEN-LAST:event_txtMobileNoKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
      String email=txtEmail.getText();
String exp="^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
CharSequence seq = email;
Pattern pattern = Pattern.compile(exp,Pattern.CASE_INSENSITIVE);
Matcher m = pattern.matcher(seq);
if (m.matches()) {
checkEmailLbl.setVisible(false);
}
else {
checkEmailLbl.setText("* Invalid Email ID");
checkEmailLbl.setVisible(true);
checkEmailLbl.setForeground(Color.red);
}
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtAccNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAccNoKeyTyped
      String input = txtAccNo.getText();
Pattern p = Pattern.compile("[A-Z,a-z,&%$@!()*^]");
Matcher m = p.matcher(input);
if (m.find()) {
checkAccountNoLbl.setText("* Enter only Numeric Value");
checkAccountNoLbl.setVisible(true);
checkAccountNoLbl.setForeground(Color.red);
}
else{
checkAccountNoLbl.setVisible(false);
}
    }//GEN-LAST:event_txtAccNoKeyTyped
  
 private boolean stCompleteForm(){
    
     if(txtAccNo.getText() == null || txtAccNo.getText().trim().isEmpty())
        {
            txtAccNo.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Account Number", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
      if(txtAccName.getText() == null || txtAccName.getText().trim().isEmpty())
        {
            txtAccName.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Account Name", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
     
       if(txtCustName.getText() == null || txtCustName.getText().trim().isEmpty())
        {
            txtCustName.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter customer name", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       if(txtBalance.getText() == null || txtBalance.getText().trim().isEmpty())
        {
            txtBalance.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Balance", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       if(txtAddress.getText() == null || txtAddress.getText().trim().isEmpty())
        {
            txtAddress.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter customer Address", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       if(txtSecCode.getText() == null ||txtSecCode.getText().trim().isEmpty()||txtSecCode.getText().length()<6)
        {
            txtSecCode.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter security code at least 6 digit", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       if(txtMobileNo.getText() == null || txtMobileNo.getText().trim().isEmpty()||txtMobileNo.getText().length()<11)
        {
            txtMobileNo.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Mobile Number at least 11 digit", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
       if(txtEmail.getText() == null || txtEmail.getText().trim().isEmpty())
        {
            txtEmail.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Email ID", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(txtImage.getText() == null || txtEmail.getText().trim().isEmpty())
        {
            txtImage.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter costomer Image", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
     return true;
 }

  private void clear() {
        txtAccName.setText("");
        txtAccNo.setText("");
        txtCustName.setText("");
        txtBalance.setText("");
        txtAddress.setText("");
        txtSecCode.setText("");
        txtMobileNo.setText("");
        txtEmail.setText("");
        txtImage.setText("");
       
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new HomePage(null).setVisible(true);

                } catch (Exception ex) {
                    Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable AllViewTable;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel ImageLabel;
    private javax.swing.JButton OpenBtn;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JLabel checkAccountNoLbl;
    private javax.swing.JLabel checkEmailLbl;
    private javax.swing.JLabel checkMobileNumLbl;
    private javax.swing.JButton chectButton;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton imageBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField txtAccName;
    private javax.swing.JTextField txtAccNo;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtCustName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtImage;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtSecCode;
    // End of variables declaration//GEN-END:variables



   

   }
