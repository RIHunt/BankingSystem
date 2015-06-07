
package com.mbstu.ui;

import com.mbstu.util.DatabaseConnection;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.geom.AffineTransform;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.filechooser.FileNameExtensionFilter;


public class MainWindow extends javax.swing.JFrame {
  Toolkit tk=Toolkit.getDefaultToolkit();
    Dimension dim=tk.getScreenSize();
    Timer time;

    String user,user1,user2;
    private JLabel welcome;
    private ResultSet rs;
    String secCode;

  AdminLogin a=new AdminLogin();
    /** Creates new form MainWindow */
    public MainWindow() {
         setIconImage(new ImageIcon(ClassLoader.getSystemResource("images/LOGO000.gif")).getImage());
         initComponents();
         setSize(dim.width,dim.height);
         //setResizable(false);

         /* Drawing ATM Banking in 2D Graphics */

        DrawingPane drawingPanel = new DrawingPane();
        getContentPane().add(drawingPanel );
        drawingPanel.setBounds(400, 115,  600, 400);
        drawingPanel.setBackground(new java.awt.Color(240,240,240));

         /* Moving ATM Banking this panel */

        DrawingPane_1 drawingPanel_1 = new DrawingPane_1();
        getContentPane().add(drawingPanel_1);
        drawingPanel_1.setBounds(0, 620,  1000, 60);
        drawingPanel_1.setBackground(Color.MAGENTA);

        /* Digital clock*/
        time = new Timer(1000, null);
        time.setInitialDelay(0);
        time.start();
        time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                 timeBtnActionPerformed(evt);
            }

            private void timeBtnActionPerformed(ActionEvent evt) {
                Date t = new Date();
	   	DateFormat df = DateFormat.getTimeInstance(DateFormat.MEDIUM);
	   	String time = df.format(t);
	       cloclLabel5.setText(time);
            }
        });




    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        aboutBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cloclLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAccNo = new javax.swing.JTextField();
        SubmitBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        adminBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel("Welcome:  Today is " + new java.util.Date()+" ");
        txtCustomersecCode = new javax.swing.JPasswordField();
        backupBtn = new javax.swing.JButton();
        reStoreBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        aboutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Coin.png"))); // NOI18N
        aboutBtn.setText("about");
        aboutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutBtnMouseEntered(evt);
            }
        });
        getContentPane().add(aboutBtn);
        aboutBtn.setBounds(0, 0, 110, 40);
        aboutBtn.setFocusPainted(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 36));
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText("    WELCOME  2013");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(260, 20, 350, 50);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        cloclLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cloclLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(cloclLabel5);
        cloclLabel5.setBounds(20, 0, 210, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(770, 10, 220, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Enter Account No   :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 240, 150, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Enter Security code:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 280, 160, 30);
        getContentPane().add(txtAccNo);
        txtAccNo.setBounds(140, 240, 190, 30);

        SubmitBtn.setText("Submit");
        SubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtnActionPerformed(evt);
            }
        });
        SubmitBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                SubmitBtnKeyPressed(evt);
            }
        });
        getContentPane().add(SubmitBtn);
        SubmitBtn.setBounds(120, 340, 90, 30);

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearBtn);
        clearBtn.setBounds(230, 340, 110, 30);

        adminBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/world.gif"))); // NOI18N
        adminBtn.setText("Admin");
        adminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminBtnActionPerformed(evt);
            }
        });
        adminBtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminBtnKeyPressed(evt);
            }
        });
        getContentPane().add(adminBtn);
        adminBtn.setBounds(70, 520, 180, 40);

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ExitBtn);
        ExitBtn.setBounds(280, 520, 130, 40);

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 18));
        jLabel5.setForeground(new java.awt.Color(255, 0, 102));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 580, 600, 40);
        getContentPane().add(txtCustomersecCode);
        txtCustomersecCode.setBounds(140, 280, 190, 30);

        backupBtn.setText("Backup");
        backupBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backupBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backupBtn);
        backupBtn.setBounds(790, 510, 160, 40);

        reStoreBtn.setText("Restore");
        reStoreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reStoreBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reStoreBtn);
        reStoreBtn.setBounds(790, 570, 160, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void aboutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseEntered
        new about().setVisible(true);
}//GEN-LAST:event_aboutBtnMouseEntered

    private void SubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtnActionPerformed
        if(stCompleteForm() == false) {
            return;
        }

        String acno=txtAccNo.getText();
        String seccode=txtCustomersecCode.getText();

        Query q = new Query();
        user = q.val_password1(acno,seccode);

        user1 = q.val_password2(acno,seccode);

        if(user==null){
            JOptionPane.showMessageDialog(null,
                    "The account Account Number is blank ");

        } else{
            System.out.println(user);
            System.out.println(user1);
            
            MainTransaction a=new MainTransaction(user);
            a.setVisible(true);
           

            a.getChoice(user);
            a.getChoice1(user1);
            a.getChoice2(acno);
            
            
            clear();

        }



    }//GEN-LAST:event_SubmitBtnActionPerformed

    private void SubmitBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SubmitBtnKeyPressed

        char ch=evt.getKeyChar();
        int keyCode = (int)ch;
        if(keyCode==10){
            SubmitBtnActionPerformed(null);
        }
}//GEN-LAST:event_SubmitBtnKeyPressed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        clear();
}//GEN-LAST:event_clearBtnActionPerformed

    private void adminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminBtnActionPerformed
        
         a.setVisible(true);

    }//GEN-LAST:event_adminBtnActionPerformed

    private void adminBtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminBtnKeyPressed
        char ch=evt.getKeyChar();
        int keyCode = (int)ch;
        if(keyCode==10){
           a.setVisible(true);
        }
}//GEN-LAST:event_adminBtnKeyPressed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        ConfirmExit();;
}//GEN-LAST:event_ExitBtnActionPerformed

    private void backupBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backupBtnActionPerformed
         int response = JOptionPane.showConfirmDialog(rootPane, "Are u sure to Backup?", "Alert", JOptionPane.YES_NO_OPTION);
        if(response == 0)
        {
            String message = DatabaseConnection.backupDatabase();
            JOptionPane.showMessageDialog(rootPane, message, "Message", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_backupBtnActionPerformed

    private void reStoreBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reStoreBtnActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(new java.io.File("."));
        chooser.setDialogTitle("Select Picture");
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        FileNameExtensionFilter sqlfilter = new FileNameExtensionFilter("SQL file (*.sql)", "sql");
        chooser.setFileFilter(sqlfilter);
        //
        // disable the "All files" option.
        //
        chooser.setAcceptAllFileFilterUsed(false);
        //
        if (chooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION)
        {
            try
            {
                String createDB="create database bank";

                Connection conn = DatabaseConnection.getDefaultConnection();
                Statement  sta = conn.createStatement();
                sta.execute(createDB);
            }catch(SQLException e)
            {
                JOptionPane.showMessageDialog(rootPane, "Unable to Load Database", "Message", JOptionPane.ERROR_MESSAGE);
                return;
            }

            String message = DatabaseConnection.loadDatabase(chooser.getSelectedFile().toString());
            JOptionPane.showMessageDialog(rootPane, message, "Message", JOptionPane.INFORMATION_MESSAGE);

        }

    }//GEN-LAST:event_reStoreBtnActionPerformed


     private int fontSize = 90;
    private String message = "ATM Banking";
    private int messageWidth=780;
    class DrawingPane extends JPanel{
    public DrawingPane() {

    // setBackground(new java.awt.Color(204, 204, 255));
      Font font = new Font("Serif", Font.PLAIN, fontSize);
      setFont(font);



        }
        @Override
     public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Graphics2D graph = (Graphics2D)g;
      int x = messageWidth/9;
      int y = fontSize*3;
      graph.translate(x, y);
      graph.setPaint(Color.lightGray);

      AffineTransform origTransform = graph.getTransform();
      graph.shear(-0.95, 0);
      graph.scale(1, 3);
      graph.drawString(message, 0, 0);
      graph.setTransform(origTransform);
      graph.setPaint(Color.MAGENTA);
      graph.drawString(message, 0, 0);
    }
    }

    class DrawingPane_1 extends JPanel implements Runnable{

  protected Thread banner;
  protected String text;
  protected Font font;
  protected int width;
  protected int height;
  protected int x, y;
  protected int delay;
  protected int offset;
  protected Dimension size;
  protected Image image;
  protected Graphics offScreen;

      public DrawingPane_1( ) {
      width = 1010;
      height = 90;




    text = new String ("ATM Banking");


    font = new Font ( "Sans-serif", Font.BOLD, 30 );


    delay = 20;

    // Set the intial values for x and y
    x = width / 2;
    y = height / 2;

    // Set the offset
    offset = 1;

    // Create and start the thread
    banner = new Thread ( this );
    banner.start();
         }
          public void paintComponent ( Graphics g )
           {

          size = this.getSize();

        // Create the off-screen image buffer if it is the first time
        if ( image == null )
      {
          image = createImage ( size.width, size.height );
          offScreen = image.getGraphics();
      }

      // Get the font metrics to determine the length of the text
      offScreen.setFont ( font );
      FontMetrics fm = g.getFontMetrics();
      int length = fm.stringWidth ( text );

      // Adjust the position of the text from the previous frame
      x = x - offset;

      // If the text is completely off to the left end move the
      // position of the banner to the right edge
      if ( x < -length )
        x = size.width;

      // Set the color and paint the background
      offScreen.setColor ( Color.black );
      offScreen.fillRect (0, 20, size.width, size.height );

      // Set the pen color and draw the text
      offScreen.setColor ( Color.green );
      offScreen.drawString ( text, x, y );

      // Copy the off-screen image to the screen
      g.drawImage ( image, 0, 0, this );
  }

       public void run() {

     while ( Thread.currentThread() == banner )
     {
         repaint ();
         try
         {
             Thread.sleep ( delay );
         }
         catch ( InterruptedException e )
         {
             System.out.println ( "Exception: " + e.getMessage() );
         }
     }
        }

    }
    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitBtn;
    private javax.swing.JButton SubmitBtn;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JButton adminBtn;
    private javax.swing.JButton backupBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel cloclLabel5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reStoreBtn;
    private javax.swing.JTextField txtAccNo;
    private javax.swing.JPasswordField txtCustomersecCode;
    // End of variables declaration//GEN-END:variables

    private boolean stCompleteForm() {
           if(txtAccNo.getText() == null || txtAccNo.getText().trim().isEmpty())
        {
            txtAccNo.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter User AccNo", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
          if(txtCustomersecCode.getText() == null || txtCustomersecCode.getText().trim().isEmpty())
        {
            txtCustomersecCode.setText("");
            JOptionPane.showMessageDialog(null, "Please Enter User Password", "Alert", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
     private void clear(){

      txtAccNo.setText("");
      txtCustomersecCode.setText("");
  }
private void ConfirmExit() {
          String ObjButtons[] = {"Yes", "No"};
        int PromptResult = JOptionPane.showOptionDialog(null, "Are you sure to exit?",
                "Confirm exit", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, ObjButtons, ObjButtons[1]);
        if (PromptResult == 0) {
            System.exit(0);
        }
    }
}
