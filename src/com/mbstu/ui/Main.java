package com.mbstu.ui;


import java.awt.EventQueue;
import javax.swing.JFrame;

public class Main implements Runnable{
    private final JFrame frame;
    public Main(JFrame frm){
        this.frame=frm;
    }
    public void run(){
        frame.setVisible(true);
    }
    public static void main(String args[]){
        new frmSplash(3000);
        EventQueue.invokeLater(new Main(new MainWindow()));
    }

}
