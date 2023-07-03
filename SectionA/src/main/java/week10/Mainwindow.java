package week10;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.BorderLayout;
import javax.swing.JDesktopPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainwindow extends JFrame implements ActionListener{
    
    JMenuBar menuBar1;
    JMenu menuSystem;
    JMenuItem new1;
    JMenuItem new2;
    JDesktopPane desktopPane;
    
    public Mainwindow(){
        setTitle("Main Window");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        
        menuBar1=new JMenuBar();
        menuSystem=new JMenu("System");
        new1=new JMenuItem("New");
        new1.addActionListener(this);
        new2=new JMenuItem("New2");
        new2.addActionListener(this);
        
        menuSystem.add(new1);
        menuSystem.add(new2);
        menuBar1.add(menuSystem);
        
        desktopPane = new JDesktopPane();
        
        setLayout(new BorderLayout());
        add(menuBar1, BorderLayout.NORTH);
        add(desktopPane, BorderLayout.CENTER);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==new1){
            Subwindow sw1 = new Subwindow();
            desktopPane.add(sw1);
            sw1.setVisible(true);
        }
        else if(ae.getSource()==new2){
            Subwindow2 sw2 = new Subwindow2();
            desktopPane.add(sw2);
            sw2.setVisible(true);
        }
    }
    
    public static void main(String []args){
        new Mainwindow();
    }
}
