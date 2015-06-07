package com.mbstu.ui;

import com.mbstu.util.DatabaseConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MainTransaction extends javax.swing.JFrame {

     Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
       JInternalFrame iframe;
       JLabel label1,  label2,  label3,  label4,  label5,  label6,  label7,  label8,label9,imageLabel;
       JTextField text1,  text2,  text3,  text4,text5,text6,text7,text8,text9,text10,txtUserAccNo,txtReceiverAccNo,txtAmount,txtDate;
       JButton browsBtn,UpdateBtn,searchBtn,clearBtn,AddBtn,clearBtn1,DepositHitoryBtn,printBtn,cancelBtn,TransferBtn;


    private JTabbedPane listsTabs;
    private JTextArea listPane;
       String accName,balance,AccountNumber;

       String image;
       private PreparedStatement ps;
       private Statement st;
       private Connection con;
      
       String p,q,r,s;
       Database db = new Database();
   
       public MainTransaction(String userName) {

        initComponents();
        setSize(970,620);
        setLocation(5,30);
        lblUserName.setText("Welcome To  "+userName);
      
       setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

       
   }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BalanceAmountBtn = new javax.swing.JButton();
        TransactBtn = new javax.swing.JButton();
        AccEditBtn = new javax.swing.JButton();
        TransferCashBtn = new javax.swing.JButton();
        DepositBtn = new javax.swing.JButton();
        WithdrawBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        lblUserName = new javax.swing.JLabel();
        WithdrawHistoryBtn = new javax.swing.JButton();
        DepositHistoryBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Calculation = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 30)); // NOI18N
        jLabel1.setText("Select Transaction");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(310, 110, 290, 50);

        BalanceAmountBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Coin.png"))); // NOI18N
        BalanceAmountBtn.setText("Balance Amount");
        BalanceAmountBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BalanceAmountBtnActionPerformed(evt);
            }
        });
        jPanel1.add(BalanceAmountBtn);
        BalanceAmountBtn.setBounds(10, 180, 190, 50);

        TransactBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Coin.png"))); // NOI18N
        TransactBtn.setText("Transfer  History");
        TransactBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransactBtnActionPerformed(evt);
            }
        });
        jPanel1.add(TransactBtn);
        TransactBtn.setBounds(10, 470, 190, 50);

        AccEditBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/editusr.png"))); // NOI18N
        AccEditBtn.setText("Account Edit");
        AccEditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccEditBtnActionPerformed(evt);
            }
        });
        jPanel1.add(AccEditBtn);
        AccEditBtn.setBounds(10, 250, 190, 50);

        TransferCashBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Coin.png"))); // NOI18N
        TransferCashBtn.setText("Transfer Money");
        TransferCashBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransferCashBtnActionPerformed(evt);
            }
        });
        jPanel1.add(TransferCashBtn);
        TransferCashBtn.setBounds(740, 180, 210, 50);

        DepositBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/my_documents.png"))); // NOI18N
        DepositBtn.setText("Deposit Cash");
        DepositBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DepositBtn);
        DepositBtn.setBounds(740, 250, 210, 50);

        WithdrawBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Coin.png"))); // NOI18N
        WithdrawBtn.setText("Withdraw Cash");
        WithdrawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawBtnActionPerformed(evt);
            }
        });
        jPanel1.add(WithdrawBtn);
        WithdrawBtn.setBounds(740, 330, 210, 50);

        ExitBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        jPanel1.add(ExitBtn);
        ExitBtn.setBounds(740, 430, 210, 50);

        lblUserName.setFont(new java.awt.Font("Segoe UI Semibold", 2, 36)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 102, 51));
        jPanel1.add(lblUserName);
        lblUserName.setBounds(250, 40, 420, 40);

        WithdrawHistoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Coin.png"))); // NOI18N
        WithdrawHistoryBtn.setText("WithdrawHistory");
        WithdrawHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WithdrawHistoryBtnActionPerformed(evt);
            }
        });
        jPanel1.add(WithdrawHistoryBtn);
        WithdrawHistoryBtn.setBounds(10, 400, 190, 50);

        DepositHistoryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Coin.png"))); // NOI18N
        DepositHistoryBtn.setText("DepositHistory");
        DepositHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositHistoryBtnActionPerformed(evt);
            }
        });
        jPanel1.add(DepositHistoryBtn);
        DepositHistoryBtn.setBounds(10, 320, 190, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-30, 0, 960, 580);

        Calculation.setText("Tools");

        jMenuItem1.setText("Calculattor");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Calculation.add(jMenuItem1);

        jMenuItem2.setText("Nodepade");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        Calculation.add(jMenuItem2);

        jMenuBar1.add(Calculation);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu1.setText("Help");

        jMenuItem3.setText("How use");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BalanceAmountBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BalanceAmountBtnActionPerformed


            iframe = new JInternalFrame("Balance Amount",true,true,true,true);
            iframe.setLayout(null);

                jPanel1.add(iframe);
   		iframe.setSize(480,250);
   		iframe.setBackground(Color.lightGray);
   		iframe.setVisible(true);
                iframe.setLocation((screen.width - 550) / 2, ((screen.height - 400) / 2));

                label1=new JLabel("AccName:");
                iframe.add(label1);
                label1.setBounds(8,10,100,25);
                label1.setFont(new java.awt.Font("Tahoma", 0, 20));
                label2=new JLabel("Balance:");
                iframe.add(label2);
                label2.setBounds(8,50,100,25);
                label2.setFont(new java.awt.Font("Tahoma", 0, 20));

                label3=new JLabel();
                iframe.add(label3);
                label3.setBounds(100,10,140,30);
                label3.setFont(new java.awt.Font("Dialog", 0, 30));
                label3.setText(accName);

                label4=new JLabel();
                iframe.add(label4);
                label4.setBounds(100,50,140,30);
                label4.setFont(new java.awt.Font("Dialog", 0, 30));
                label4.setText(balance);
    }//GEN-LAST:event_BalanceAmountBtnActionPerformed

    private void TransactBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransactBtnActionPerformed
     

       
        MoneyTransferReport a=new MoneyTransferReport(AccountNumber,p,q,r,s);
        jPanel1.add(a);
        a.setVisible(true);
             
    }//GEN-LAST:event_TransactBtnActionPerformed

    private void AccEditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccEditBtnActionPerformed
         iframe = new JInternalFrame("Update frame",true,true,true,true);
           iframe.setLayout(null);

                jPanel1.add(iframe);
   		iframe.setSize(500,350);
   		iframe.setBackground(Color.ORANGE);
   		iframe.setVisible(true);
                iframe.setLocation((screen.width - 580) / 2, ((screen.height - 450) / 2));

                label1=new JLabel("AccName:");
                iframe.add(label1);
                label1.setBounds(8,10,100,25);
                label1.setFont(new java.awt.Font("Tahoma", 0, 20));

                text1=new JTextField();
                iframe.add(text1);
                text1.setBounds(100,10,140,30);
                text1.setFont(new java.awt.Font("Dialog", 0, 30));
                text1.setText(accName);

                label2=new JLabel("change your accounts");
                iframe.add(label2);
                label2.setBounds(50,50,250,30);
                label2.setForeground(Color.red);
                label2.setFont(new java.awt.Font("Tahoma", 0, 25));

                label3=new JLabel("AccName:");
                iframe.add(label3);
                label3.setBounds(8,100,100,25);
                label3.setFont(new java.awt.Font("Tahoma", 0, 15));

                label4=new JLabel("custName:");
                iframe.add(label4);
                label4.setBounds(8,130,100,25);
                label4.setFont(new java.awt.Font("Tahoma", 0, 15));

                label5=new JLabel("Address:");
                iframe.add(label5);
                label5.setBounds(8,160,100,25);
                label5.setFont(new java.awt.Font("Tahoma", 0, 15));

                label6=new JLabel("secCode:");
                iframe.add(label6);
                label6.setBounds(8,190,100,25);
                label6.setFont(new java.awt.Font("Tahoma", 0, 15));

               text2=new JTextField();
                iframe.add(text2);
                text2.setBounds(80,100,135,25);

                text3=new JTextField();
                iframe.add(text3);
                text3.setBounds(80,130,135,25);

                text4=new JTextField();
                iframe.add(text4);
                text4.setBounds(80,160,135,25);


               text5=new JTextField();
               iframe.add(text5);
               text5.setBounds(80,190,135,25);

               label7=new JLabel("mobile No:");
               iframe.add(label7);
               label7.setBounds(250,110,100,25);
               label7.setFont(new java.awt.Font("Tahoma", 0, 15));

               label8=new JLabel("Email ID:");
               iframe.add(label8);
               label8.setBounds(250,140,100,25);
               label8.setFont(new java.awt.Font("Tahoma", 0, 15));

               label9=new JLabel("Image:");
               iframe.add(label9);
               label9.setBounds(250,170,100,25);
               label9.setFont(new java.awt.Font("Tahoma", 0, 15));

               text6=new JTextField();
               iframe.add(text6);
               text6.setBounds(330,110,135,25);

               text7=new JTextField();
               iframe.add(text7);
               text7.setBounds(330,140,135,25);

               text8=new JTextField();
               iframe.add(text8);
               text8.setBounds(330,170,135,25);
               text8.setEditable(false);

              imageLabel=new JLabel();
              iframe.add(imageLabel);
              imageLabel.setBounds(330,0, 150, 115);

              searchBtn=new JButton("search");
              iframe.add(searchBtn);
              searchBtn.setBounds(10,270,100,30);
              searchBtn.addActionListener(new java.awt.event.ActionListener() {
        

            public void actionPerformed(java.awt.event.ActionEvent evt) {

               searchButtonActionPerformed(evt);
            }

            private void searchButtonActionPerformed(ActionEvent evt) {
               String value=text1.getText();
                
                 try{

                    con=DatabaseConnection.getConnection();
		    ps=con.prepareStatement("select AccName,custName,Address,secCode,MobileNo,EmailID,Image  from t_NewAcc where AccName=?");
		    ps.setString(1,value);

		   ResultSet res=ps.executeQuery();
		    res.next();
		 
	           text2.setText(res.getString(1));
		   text3.setText(res.getString(2));
                   text4.setText(res.getString(3));
		   text5.setText(res.getString(4));
                   text6.setText(res.getString(5));
		   text7.setText(res.getString(6));
                   text8.setText(res.getString(7));
                  ImageIcon RF=new  ImageIcon(res.getString(7));
                  imageLabel=new JLabel();
	          iframe.add(imageLabel);
                  imageLabel.setIcon(RF);
                  imageLabel.setBounds(330,0, 150, 115);
                  UpdateBtn.setEnabled(true);
                
                  con.close();
               ps.close();
		 
	     }catch(Exception e)
			{
		 JOptionPane.showMessageDialog(null, "AccName not found in database", "Not found", JOptionPane.INFORMATION_MESSAGE);
		   UpdateBtn.setEnabled(false);
             }
              
            }

        });

          browsBtn=new JButton("brows");
          iframe.add(browsBtn);
          browsBtn.setBounds(340,200,100,30);
          browsBtn.addActionListener(new java.awt.event.ActionListener() {

          public void actionPerformed(ActionEvent e) {

              JFileChooser jfc = new JFileChooser();
              int result = jfc.showOpenDialog(null);

              if (result==JFileChooser.APPROVE_OPTION )
                 {
                   image=String.valueOf(jfc.getSelectedFile());
                   text8.setText(image);
                   ImageIcon lol=new  ImageIcon(image);
                   imageLabel.setIcon(lol);
                 }
              }

           });

              UpdateBtn=new JButton("Edit");
              iframe.add(UpdateBtn);
              UpdateBtn.setBounds(120,270,100,30);
              UpdateBtn.setEnabled(false);


        UpdateBtn.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                if (text2.getText() == null ||
                        text2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Account Name", "Error",
                            JOptionPane.DEFAULT_OPTION);
                
                }
                if (text3.getText() == null ||
                        text3.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Customer name", "Error",
                            JOptionPane.DEFAULT_OPTION);
                 
                }
                if (text4.getText() == null ||
                        text4.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Address", "Error",
                            JOptionPane.DEFAULT_OPTION);
                  
                }
                if (text5.getText() == null ||
                        text5.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter secCode", "Error",
                            JOptionPane.DEFAULT_OPTION);
                
                }
                if (text6.getText() == null ||
                        text6.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Mobile No", "Error",
                            JOptionPane.DEFAULT_OPTION);
                  
                }
                 if (text7.getText() == null ||
                        text7.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Email ID", "Error",
                            JOptionPane.DEFAULT_OPTION);
                    
                }
                 if (text8.getText() == null ||
                        text8.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter Image", "Error",
                            JOptionPane.DEFAULT_OPTION);
                 
                }
                try {
                    Statement statement =DatabaseConnection.getConnection().createStatement();
                    {
                        String temp = "UPDATE t_NewAcc  SET " +
                                "  AccName    ='" + text2.getText() +
                                "',custName           ='" + text3.getText() +
                                "',Address    ='" + text4.getText() +
                                "',secCode    ='" + text5.getText() +
                                "',MobileNo   ='" + text6.getText() +
                                "',EmailID     ='"+text7.getText()+
                                 "',Image     ='"+text8.getText()+
                                "' WHERE AccName ='" + text1.getText() + "'";
                        statement.executeUpdate(temp);
                         JOptionPane.showMessageDialog(null, "Registration details successfully updated", "Success", JOptionPane.INFORMATION_MESSAGE);
                      clear();
                       UpdateBtn.setEnabled(false);
                    }

                } catch (SQLException sqlex) {
                    sqlex.printStackTrace();
                }

            }
        });

              clearBtn=new JButton("clear");
              iframe.add(clearBtn);
              clearBtn.setBounds(230,270,100,30);
              clearBtn.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(ActionEvent e) {

                clear();

                  }

             } );
       
    }//GEN-LAST:event_AccEditBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
    dispose();
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void DepositBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositBtnActionPerformed
             iframe = new JInternalFrame("Internal frame",true,true,true,true);
             iframe.setLayout(null);

             jPanel1.add(iframe);
             iframe.setSize(480,280);
             iframe.setBackground(Color.black);
             iframe.setVisible(true);
             iframe.setLocation((screen.width - 550) / 2, ((screen.height - 400) / 2));

            label1=new JLabel("Enter Ammount Information");
            iframe.add(label1);
            label1.setBounds(50,10,330,30);
            label1.setFont(new java.awt.Font("Dialog", 0, 25));
            label1.setForeground(Color.white);

            
            label2=new JLabel("Account Number:");
            iframe.add(label2);
            label2.setBounds(10,50,150,30);
            label2.setFont(new java.awt.Font("Dialog", 0, 16));
            label2.setForeground(Color.white);

            label3=new JLabel("Deposit Date:");
            iframe.add(label3);
            label3.setBounds(10,90,150,30);
            label3.setFont(new java.awt.Font("Dialog", 0, 16));
            label3.setForeground(Color.white);
            
            label4=new JLabel("Deposit Amount:");
            iframe.add(label4);
            label4.setBounds(10,130,150,30);
            label4.setFont(new java.awt.Font("Dialog", 0, 16));
            label4.setForeground(Color.white);

            text1=new JTextField();
            iframe.add(text1);
            text1.setBounds(130,50,180,25);
            text1.setFont(new java.awt.Font("Dialog",0,20));
            text1.setText(AccountNumber);
            text1.setEditable(false);
          Date today = Calendar.getInstance().getTime();
          SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
           String date = formatter.format(today);
             text2=new JTextField();
             iframe.add(text2);
             text2.setBounds(130,90,180,25);
             text2.setFont(new java.awt.Font("Dialog",0,20));
             text2.setText(date );
             text2.setEditable(false);

            text3=new JTextField();
            iframe.add(text3);
            text3.setBounds(130,130,180,25);
            text3.setFont(new java.awt.Font("Dialog",0,20));
             
            AddBtn=new JButton("Add");
            iframe.add(AddBtn);
            AddBtn.setBounds(90,200,100,30);

             AddBtn.addActionListener(new ActionListener()
          {
            public void actionPerformed(ActionEvent e)
            {
                 if(stCompleteForm()==false){

                     return;

                 }
              
               db.DepositAmmountEntry(text1.getText(),text2.getText(),text3.getText());
               p=text1.getText();
               q=text2.getText();
               r=text3.getText();
        
            }
        });
       

          clearBtn1=new JButton("clear");
           iframe.add(clearBtn1);
           clearBtn1.setBounds(220,200,100,30);
           clearBtn1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(ActionEvent e) {

                clear1();

                  }

          

             } );

          

    }//GEN-LAST:event_DepositBtnActionPerformed

    private void WithdrawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawBtnActionPerformed
             iframe = new JInternalFrame("Internal frame",true,true,true,true);
             iframe.setLayout(null);

             jPanel1.add(iframe);
             iframe.setSize(520,350);
             iframe.setBackground(Color.black);
             iframe.setVisible(true);
             iframe.setLocation((screen.width - 600) / 2, ((screen.height - 420) / 2));

            label1=new JLabel("Enter Withdraw Information");
            iframe.add(label1);
            label1.setBounds(50,10,330,30);
            label1.setFont(new java.awt.Font("Dialog", 0, 25));
            label1.setForeground(Color.white);

            label2=new JLabel("Account Number:");
            iframe.add(label2);
            label2.setBounds(10,50,150,30);
            label2.setFont(new java.awt.Font("Dialog", 0, 16));
            label2.setForeground(Color.white);

            label3=new JLabel("Withdraw Date:");
            iframe.add(label3);
            label3.setBounds(10,90,150,30);
            label3.setFont(new java.awt.Font("Dialog", 0, 16));
            label3.setForeground(Color.white);

            label4=new JLabel("Withdraw Amount:");
            iframe.add(label4);
            label4.setBounds(10,130,150,30);
            label4.setFont(new java.awt.Font("Dialog", 0, 16));
            label4.setForeground(Color.white);

            text1=new JTextField();
            iframe.add(text1);
            text1.setBounds(140,50,180,25);
            text1.setFont(new java.awt.Font("Dialog",0,20));
            text1.setText(AccountNumber);
            text1.setEditable(false);

            Date today = Calendar.getInstance().getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String date = formatter.format(today);

             text2=new JTextField();
             iframe.add(text2);
             text2.setBounds(140,90,180,25);
             text2.setFont(new java.awt.Font("Dialog",0,20));
             text2.setText(date);
             text2.setEditable(false);

            text3=new JTextField();
            iframe.add(text3);
            text3.setBounds(140,130,180,25);
            text3.setFont(new java.awt.Font("Dialog",0,20));

            WithdrawBtn=new JButton("Withdraw");
            iframe.add(  WithdrawBtn);
            WithdrawBtn.setBounds(90,250,100,30);
           

       WithdrawBtn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
          if(stCompleteForm()==false){

                     return;

                 }

              db.WithdrawAmmountEntry(text1.getText(),text2.getText(),text3.getText());
               p=text1.getText();
               q=text2.getText();
               r=text3.getText();
               }
        });
           clearBtn1=new JButton("clear");
           iframe.add(clearBtn1);
           clearBtn1.setBounds(220,250,100,30);
           clearBtn1.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(ActionEvent e) {

                clear1();

                  }
           } );
    }//GEN-LAST:event_WithdrawBtnActionPerformed

    private void WithdrawHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WithdrawHistoryBtnActionPerformed
       
                WithdrawReport frm=new WithdrawReport(AccountNumber,p,q,r);
        
                jPanel1.add(frm);
                frm.setVisible(true);
              
   
           
    }//GEN-LAST:event_WithdrawHistoryBtnActionPerformed

    private void DepositHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositHistoryBtnActionPerformed

             
    DepositReport b=new DepositReport(AccountNumber,p,q,r);
    jPanel1.add(b);


    b.setVisible(true);

     

    }//GEN-LAST:event_DepositHistoryBtnActionPerformed

    private void TransferCashBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransferCashBtnActionPerformed

             iframe = new JInternalFrame("TranferCash",true,true,true,true);
             iframe.setLayout(null);

             jPanel1.add(iframe);
             iframe.setSize(520,350);
             iframe.setBackground(Color.black);
             iframe.setVisible(true);
             iframe.setLocation((screen.width - 600) / 2, ((screen.height - 420) / 2));

            label1=new JLabel("Enter CashTransfer Information");
            iframe.add(label1);
            label1.setBounds(50,10,380,30);
            label1.setFont(new java.awt.Font("Dialog", 0, 25));
            label1.setForeground(Color.white);

           

            label2=new JLabel("userAccount Number:");
            iframe.add(label2);
            label2.setBounds(10,50,150,30);
            label2.setFont(new java.awt.Font("Dialog", 0, 16));
            label2.setForeground(Color.white);

            label3=new JLabel("ReceiverAccount Num:");
            iframe.add(label3);
            label3.setBounds(10,90,180,30);
            label3.setFont(new java.awt.Font("Dialog", 0, 16));
            label3.setForeground(Color.white);

            label4=new JLabel("Send Amount of User:");
            iframe.add(label4);
            label4.setBounds(10,130,180,30);
            label4.setFont(new java.awt.Font("Dialog", 0, 16));
            label4.setForeground(Color.white);

            label5=new JLabel("Transfer Date:");
            iframe.add(label5);
            label5.setBounds(10,170,150,30);
            label5.setFont(new java.awt.Font("Dialog", 0, 16));
            label5.setForeground(Color.white);

            txtUserAccNo=new JTextField();
            iframe.add(txtUserAccNo);
            txtUserAccNo.setBounds(170,50,200,25);
            txtUserAccNo.setFont(new java.awt.Font("Dialog",0,20));
            txtUserAccNo.setText(AccountNumber);
            txtUserAccNo.setEditable(false);
            txtReceiverAccNo=new JTextField();
            iframe.add(txtReceiverAccNo);
            txtReceiverAccNo.setBounds(170,90,200,25);
            txtReceiverAccNo.setFont(new java.awt.Font("Dialog",0,20));

            txtAmount=new JTextField();
            iframe.add(txtAmount);
            txtAmount.setBounds(170,130,200,25);
            txtAmount.setFont(new java.awt.Font("Dialog",0,20));

            Date today = Calendar.getInstance().getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
            String date = formatter.format(today);

             txtDate=new JTextField();
             iframe.add(txtDate);
             txtDate.setBounds(170,170,200,25);
             txtDate.setFont(new java.awt.Font("Dialog",0,20));
             txtDate.setText(date);
             txtDate.setEditable(false);

            TransferBtn=new JButton("Ok");
            iframe.add( TransferBtn);
            TransferBtn.setBounds(90,240,140,35);


              TransferBtn.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
            if(stCompleteForm1() == false){
            return;
          }

         db.TransactionMoney(txtUserAccNo.getText(),txtReceiverAccNo.getText(),txtAmount.getText(),txtDate.getText());
         p=txtUserAccNo.getText();
         q=txtReceiverAccNo.getText();
         r=txtAmount.getText();
         s=txtDate.getText();
             clear2();
                 }

           });
          
             
    }//GEN-LAST:event_TransferCashBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     try {
                    Runtime.getRuntime().exec("calc.exe");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error,Cannot start calculator", "Applicaton Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
      try {
                    Runtime.getRuntime().exec("notepad.exe");
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error,Cannot start notepad", "Applicaton Error", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_jMenuItem2ActionPerformed
  private void clear(){
           
            text2.setText("");
            text3.setText("");
            text4.setText("");
            text5.setText("");
            text6.setText("");
            text7.setText("");

  }
  private void clear1() {
              // text1.setText("");
               //text2.setText("");
               text3.setText("");
                 }
   private void clear2() {
             txtUserAccNo.setText("");
             txtReceiverAccNo.setText("");
             txtAmount.setText("");
             //txtDate.setText("");
            }
  public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainTransaction a= new MainTransaction(null);
                a.setVisible(true);


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AccEditBtn;
    private javax.swing.JButton BalanceAmountBtn;
    private javax.swing.JMenu Calculation;
    private javax.swing.JButton DepositBtn;
    private javax.swing.JButton DepositHistoryBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton TransactBtn;
    private javax.swing.JButton TransferCashBtn;
    private javax.swing.JButton WithdrawBtn;
    private javax.swing.JButton WithdrawHistoryBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblUserName;
    // End of variables declaration//GEN-END:variables



   public String  getChoice(String user) {
         return  accName=user;

    }

   public String getChoice1(String user1) {

        return balance=user1;
    }

    public String getChoice2(String user2) {
       return  AccountNumber=user2;
    }

     private boolean stCompleteForm() {
         if(text1.getText() == null || text1.getText().trim().isEmpty())
        {
            text1.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Account Number", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
          
           if(text2.getText() == null || text2.getText().trim().isEmpty())
        {
            text2.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Date", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
          if(text3.getText() == null || text3.getText().trim().isEmpty())
        {
            text3.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Ammount", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
      private boolean stCompleteForm1() {
         if(txtUserAccNo.getText() == null || txtUserAccNo.getText().trim().isEmpty())
        {
            txtUserAccNo.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Account Number", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
           if(txtReceiverAccNo.getText() == null || txtReceiverAccNo.getText().trim().isEmpty())
        {
            txtReceiverAccNo.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Account Number", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
           if(txtAmount.getText() == null || txtAmount.getText().trim().isEmpty())
        {
            txtAmount.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Ammount", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
            if(txtDate.getText() == null || txtDate.getText().trim().isEmpty())
        {
            txtDate.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter Date", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }


}



