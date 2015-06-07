package com.mbstu.ui;


import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

public class frmSplash{

    private JLabel mbstuImage;
    private JLabel nameText;
    private JWindow window;
    private JPanel panel;
    public frmSplash(int duration) {
        window=new JWindow();               
        Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
        window.setBounds((screen.width - 400) / 2, (screen.height - 250) / 2,400, 300);
        
        panel=(JPanel)window.getContentPane();
        mbstuImage = new JLabel(new ImageIcon(ClassLoader.getSystemResource("images/mehedi.jpg")));
        nameText=new JLabel("MD Rafiq",SwingConstants.CENTER);
        panel.add(mbstuImage, BorderLayout.CENTER);
        panel.add(nameText,BorderLayout.SOUTH);
        
        window.setVisible(true);
        try{
            Thread.sleep(duration);            
        }catch(Exception ex){            
        }//try catch closed
        window.setVisible(false);
        window.dispose();
    }//constructr closed

}//class closed

