
package week9;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Message extends JInternalFrame implements ActionListener{
    JTextField txt1;
    JButton btnIncrease;
    JButton btnDecrease;
    
    public Message(){
        setTitle("Message Window-1");
        setSize(250, 250);
        setLayout(null);
       
        txt1 = new JTextField("0");
        txt1.setBounds(20, 20, 150, 30);
        
        btnIncrease = new JButton("++");
        btnIncrease.setBounds(20, 70, 60, 30);
        btnIncrease.addActionListener(this);
        btnDecrease = new JButton("--");
        btnDecrease.setBounds(70, 70, 60, 30);
        btnDecrease.addActionListener(this);
        
        add(txt1);
        add(btnIncrease);
        add(btnDecrease);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btnIncrease){
            //increase
            /*
            int tmp = Integer.parseInt(txt1.getText()); //String -> int from txt1
            tmp++; //increase
            txt1.setText(Integer.toString(tmp));//int -> String -> set to txt1
            */
            int tmp=Global.num1;
            tmp++;
            Global.num1=tmp;
            txt1.setText(Integer.toString(tmp));
        }
        else if(ae.getSource()==btnDecrease){
            //decrease
            /*
            int tmp = Integer.parseInt(txt1.getText()); //String -> int from txt1
            tmp--; //decrease
            txt1.setText(Integer.toString(tmp));//int -> String -> set to txt1
            */
            
            int tmp=Global.num1;
            tmp--;
            Global.num1=tmp;
            txt1.setText(Integer.toString(tmp));
        }
    }
}