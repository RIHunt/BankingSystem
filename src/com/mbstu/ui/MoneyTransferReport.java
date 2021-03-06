package com.mbstu.ui;


import com.mbstu.util.DatabaseConnection;
import java.awt.Color;
import javax.swing.*;
import java.sql.*;

public class MoneyTransferReport extends JInternalFrame {

   
    private static JTable jTable;
    private JScrollPane jScrollPane;
    private JPanel jPanel1,jPanel2;
    private JButton Print;
    private JButton cancel;
    private static int rowCnt = 0;

    private  JLabel label1, label2,label3,label4,label5,label6,label7;
    public MoneyTransferReport(String AccNum,String s1,String s2,String s3,String s4) {

        super("Report");
       
        jTable = new JTable(new AbstractTable());

        javax.swing.table.TableColumn column = null;
        for (int i = 0; i <6; i++) {
            column = jTable.getColumnModel().getColumn(i);
        }

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 8, 520, 370);
        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

          jPanel2 = new javax.swing.JPanel();
         jPanel2.setLayout(null);

        jPanel2.setBounds(0,0, 450,400);
        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
         jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 255)));


            label1=new JLabel("Withdraw Report 2013");
            jPanel2.add(label1);

            label1.setBounds(100,0,300,30);
            label1.setFont(new java.awt.Font("Dialog", 0, 25));
            label1.setForeground(Color.black);
            label1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 153)));

            label2=new JLabel();
            jPanel2.add(label2);
            label2.setText("userAccountNumber:"+s1);
            label2.setBounds(50,40,330,30);
            label2.setFont(new java.awt.Font("Dialog", 0, 20));
            label2.setForeground(Color.black);

            label3=new JLabel();
            jPanel2.add(label3);
            label3.setText("receiverAccountNumber:"+s2);
            label3.setBounds(50,70,330,30);
            label3.setFont(new java.awt.Font("Dialog", 0, 20));
            label3.setForeground(Color.black);

            label4=new JLabel();
            jPanel2.add(label4);
            label4.setText("Balance:"+s3);
            label4.setBounds(50,100,330,30);
            label4.setFont(new java.awt.Font("Dialog", 0, 20));
            label4.setForeground(Color.black);

            label5=new JLabel();
            jPanel2.add(label5);
            label5.setText("Date:"+s4);
            label5.setBounds(50,130,330,30);
            label5.setFont(new java.awt.Font("Dialog", 0, 20));
            label5.setForeground(Color.black);

            label6=new JLabel();
            jPanel2.add(label6);
            label6.setText("Copyright  2013 Rafiq.");
            label6.setBounds(50,200,330,30);
            label6.setFont(new java.awt.Font("Dialog", 0, 20));
            label6.setForeground(Color.black);

            label7=new JLabel();
            jPanel2.add(label7);
            label7.setText("Digital mass [DML]Limited,Bangladesh.");
            label7.setBounds(50,220,350,30);
            label7.setFont(new java.awt.Font("Dialog", 0, 20));
            label7.setForeground(Color.black);
        jScrollPane = new javax.swing.JScrollPane(jTable);
        jPanel1.add(  jScrollPane);
        jScrollPane.setBounds(5, 20, 520, 310);
      
        getContentPane().setLayout(null);
        setLocation(205,150);
        setSize(530, 400);



        Print = new JButton("Print Record");
        jPanel1.add(Print);
        Print.setBounds(50,330,130,25);
        cancel = new JButton("Close");
        jPanel1.add(cancel);
        cancel.setBounds(200,330,100,25);
       
       
       
      

        try {
            Statement statement = DatabaseConnection.getConnection().createStatement();
            {
              
              String SQLStatement="select AccNum_from,custNamefrom,AccNum_to,custNameto,Date,Ammount from transfer WHERE AccNum_from='"+AccNum+"'";
            
                int Numrow = 0;
                ResultSet result = statement.executeQuery(SQLStatement);
                while (result.next()) {
                    jTable.setValueAt(result.getString(1), Numrow, 0);
                    jTable.setValueAt(result.getString(2), Numrow, 1);
                    jTable.setValueAt(result.getString(3), Numrow, 2);
                    jTable.setValueAt(result.getString(4), Numrow, 3);
                    jTable.setValueAt(result.getString(5), Numrow, 4);
                    jTable.setValueAt(result.getString(6), Numrow, 5);
                  

                    Numrow++;

                }
            }

        } catch (SQLException sqlex) {
          
        }

        cancel.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                setVisible(false);

            }
        });

    Print.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {


               PrintUtilities.printComponent(jPanel2);


            }
        });
     
      
    
    }
 class AbstractTable extends javax.swing.table.AbstractTableModel {
     
        private String[] columnNames = {"AccNum_from","custNamefrom","AccNum_to","custNameto","Date","Ammount"};
        private Object[][] data = new Object[50][50];

        public int getColumnCount() {
            return columnNames.length;
        }

        public int getRowCount() {
            return data.length;
        }

        @Override
        public String getColumnName(int col) {
            return columnNames[col];
        }

        public Object getValueAt(int row, int col) {
            return data[row][col];
        }

        @Override
        public void setValueAt(Object value, int row, int col) {
            data[row][col] = value;
            fireTableCellUpdated(row, col);
        }
    }

}
