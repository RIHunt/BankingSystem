
package com.mbstu.ui;

import com.mbstu.bean.Adminbean;
import com.mbstu.manager.AdminManager;
import javax.swing.JOptionPane;


public class AdminRegister extends javax.swing.JFrame {

    /** Creates new form AdminRegister */
    public AdminRegister() {
        initComponents();
        setSize(350,320);
        setLocation(200,200);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jlabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        saveBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jlabel1.setText("User  Name        :");
        jPanel1.add(jlabel1);
        jlabel1.setBounds(0, 80, 100, 30);

        jLabel2.setText("User Password   :");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 130, 100, 30);
        jPanel1.add(txtUsername);
        txtUsername.setBounds(100, 80, 180, 30);
        jPanel1.add(txtPassword);
        txtPassword.setBounds(101, 130, 180, 30);

        saveBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.PNG"))); // NOI18N
        saveBtn.setText("save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(saveBtn);
        saveBtn.setBounds(60, 220, 110, 30);

        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.PNG"))); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ExitBtn);
        ExitBtn.setBounds(210, 220, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 450, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
       if(stCompleteForm() == false)
        {
            return;
        }
       String name=txtUsername.getText();
       String password=txtPassword.getText();
       Adminbean adObj=new Adminbean(name, password);
         boolean isSave=AdminManager.isSaveAccount(adObj);
          if(isSave){
         JOptionPane.showMessageDialog(null, "Successfully Save", "Success", JOptionPane.INFORMATION_MESSAGE);
       clear();
    }else{
      JOptionPane.showMessageDialog(null, "Don't Successfully ", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
      this.hide();
      new AdminLogin().setVisible(true);

    }//GEN-LAST:event_ExitBtnActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlabel1;
    private javax.swing.JButton saveBtn;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private boolean stCompleteForm() {

         if(txtUsername.getText() == null || txtUsername.getText().trim().isEmpty())
        {
            txtUsername.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter User Name", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
          if(txtPassword.getText() == null || txtPassword.getText().trim().isEmpty())
        {
            txtPassword.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter User Password", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void clear() {

         txtUsername.setText("");
         txtPassword.setText("");
    }

}
