package week10;

import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Subwindow2 extends JInternalFrame implements ActionListener{
    JButton btn1;
    
    public Subwindow2(){
        setTitle("Sub Window-2");
        setSize(250, 250);
        setClosable(true);
        setLayout(new FlowLayout());
        btn1 = new JButton("Click ME!");
        btn1.addActionListener(this);
        add(btn1);   
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn1){
            Global.num1+=2;
            JOptionPane.showMessageDialog(this, "Hello from Sub Window-2 : "+Global.num1);
        }
    }
}