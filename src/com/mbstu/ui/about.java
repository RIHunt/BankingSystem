
package com.mbstu.ui;


public class about extends javax.swing.JFrame {

    /** Creates new form about */
    public about() {
        initComponents();
        setSize(410,450);
        setLocation(100,100);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 0));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Mawlana Bhasani");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 30, 200, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/mehedi.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 340, 240);

        jLabel3.setText("             Rafiq   MBSTU");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(100, 300, 220, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/world.gif"))); // NOI18N
        jButton1.setText("ok");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 343, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new about().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables

}
