package week6;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener; //Click Event
import java.awt.event.ActionEvent; //Source of Click

public class MyWindow extends JFrame implements ActionListener {
    JLabel lblNum1, lblNum2;
    JTextField txtNum1, txtNum2;
    JButton btnClose, btnAdd;
    
    public MyWindow(){
        setTitle("My Window");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        lblNum1=new JLabel();
        lblNum1.setText("Enter first no : ");
        lblNum1.setBounds(25, 25, 150, 25);
        
        lblNum2=new JLabel();
        lblNum2.setText("Enter second no : ");
        lblNum2.setBounds(25, 60, 150, 25);
        
        
        txtNum1=new JTextField();
        txtNum1.setBounds(200, 25, 150, 25);
        
        txtNum2=new JTextField();
        txtNum2.setBounds(200, 60, 150, 25);
        
        btnClose = new JButton();
        btnClose.setText("CLOSE");
        btnClose.setBounds(25, 95, 75,25);
        btnClose.addActionListener(this);
        
        btnAdd = new JButton();
        btnAdd.setText("ADD");
        btnAdd.setBounds(125, 95, 75,25);
        btnAdd.addActionListener(this);
        
        add(lblNum1);
        add(txtNum1);
        add(lblNum2);
        add(txtNum2);
        add(btnClose);
        add(btnAdd);
        
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btnClose){
            System.exit(0);
        }
        else if(ae.getSource()==btnAdd){
            //calculate sum
            int num1, num2, num3;
            num1 = Integer.parseInt(txtNum1.getText());
            num2 = Integer.parseInt(txtNum2.getText());
            num3 = num1 + num2;
            System.out.println("Sum : "+num3);
        }
    }
    
    public static void main(String []args){
        new MyWindow();
    }
}
