
package com.mbstu.ui;

import com.mbstu.util.DatabaseConnection;
import javax.swing.JOptionPane;

public class AdminLogin extends javax.swing.JFrame {
    private  int passwordCount=0;
    
 
    /** Creates new form AdminLogin1 */
    public AdminLogin() {
        initComponents();
      
        setSize(400,290);
        setLocation(350,150);
         setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        ExitBtn = new javax.swing.JButton();
        RegisterBtn = new javax.swing.JButton();
        txtPassWord = new javax.swing.JPasswordField();
        loginBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel1.setText("Admin Name   :");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 40, 120, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Admin  password :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 90, 130, 30);
        jPanel1.add(txtName);
        txtName.setBounds(130, 40, 160, 30);

        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ExitBtn);
        ExitBtn.setBounds(300, 190, 100, 40);

        RegisterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.PNG"))); // NOI18N
        RegisterBtn.setText("Registration");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });
        jPanel1.add(RegisterBtn);
        RegisterBtn.setBounds(10, 190, 140, 40);
        jPanel1.add(txtPassWord);
        txtPassWord.setBounds(130, 90, 160, 30);

        loginBtn.setText("login");
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginBtn);
        loginBtn.setBounds(170, 190, 110, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 290);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
       
        dispose();
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        this.hide();
        new AdminRegister().setVisible(true);
    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void LoginBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_LoginBtnKeyPressed
         char ch=evt.getKeyChar();
         int keyCode = (int)ch;
         if(keyCode==10){
            LoginByEnterpress();
        }
    }//GEN-LAST:event_LoginBtnKeyPressed

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        if(stCompleteForm() == false) {
            return;
        }
        LoginByEnterpress();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void LoginByEnterpress() {

          String adname=txtName.getText();
          String adpassword=txtPassWord.getText();
          String sql="select *from t_admin where adName='"+ adname +"' and adPassword='"+ adpassword +"' ";

          try {
            boolean status=DatabaseConnection.checkValue(sql);
              if (status) {
			  this.hide();
			  HomePage homepage=new HomePage(null);
                          homepage.setVisible(true);


			  }
                      else {
			  passwordCount++;
			  JOptionPane.showMessageDialog(null,
			  "Invalid!!!\nUsername or password incorrect.");

                           clear();

                           }


                   if (passwordCount == 3) {

                       System.exit(0);

                   }
          } catch (Exception e) {
        }
    }

    private void clear(){

         txtName.setText("");
         txtPassWord.setText("");
     }
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassWord;
    // End of variables declaration//GEN-END:variables

     private boolean stCompleteForm() {
           if(txtName.getText() == null || txtName.getText().trim().isEmpty())
        {
            txtName.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter admin name", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
          if(txtPassWord.getText() == null || txtPassWord.getText().trim().isEmpty())
        {
            txtPassWord.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter admin Password", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    }


