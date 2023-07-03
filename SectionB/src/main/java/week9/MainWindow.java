package week9;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JDesktopPane;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class MainWindow extends JFrame implements ActionListener{
    JDesktopPane desktopPane;
    JMenuBar menuBar;
    JMenu menuSystem;
    JMenuItem menuItemNew;
    JMenuItem menuItemNew2;
    
    public MainWindow(){
        setTitle("Main Window");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setResizable(false);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        desktopPane = new JDesktopPane();
        
        menuBar = new JMenuBar();
        menuSystem= new JMenu("System");
        menuItemNew = new JMenuItem("New");
        menuItemNew2 = new JMenuItem("New2");
        
        menuBar.add(menuSystem);
        menuSystem.add(menuItemNew);
        menuSystem.add(menuItemNew2);
        menuItemNew.addActionListener(this); //Event Register
        menuItemNew2.addActionListener(this); //Event Register
    
        add(menuBar, BorderLayout.NORTH);
        add(desktopPane, BorderLayout.CENTER);
        
        setVisible(true);
    }   
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==menuItemNew){ //Event Source
            //JOptionPane.showMessageDialog(this, "Hello");
            //System.out.println("Hello");
            Message message=new Message();
            desktopPane.add(message);
            message.setVisible(true);
        }
        else if(ae.getSource()==menuItemNew2){ //Event Source
            //JOptionPane.showMessageDialog(this, "Hello");
            //System.out.println("Hello");
            Message2 message2=new Message2();
            desktopPane.add(message2);
            message2.setVisible(true);
        }
    }
    
    public static void main(String []args){
        new MainWindow();
    }
}