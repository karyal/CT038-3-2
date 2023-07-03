package week10;

import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class Subwindow extends JInternalFrame implements ActionListener{
    JButton btn1;
    
    public Subwindow(){
        setTitle("Sub Window-1");
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
            Global.num1++;
            JOptionPane.showMessageDialog(this, "Hello from Sub Window-1 "+Global.num1);
        }
    }
}