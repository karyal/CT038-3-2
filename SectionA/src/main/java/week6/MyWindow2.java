package week6;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyWindow2 extends JFrame implements ActionListener{
    JLabel lblNum1, lblNum2;
    JTextField txtNum1, txtNum2;
    JButton btnAdd, btnClose;
    
    public MyWindow2(){
        setTitle("My Second Window");
        setSize(450, 200);
        setResizable(false);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        lblNum1=new JLabel();
        lblNum1.setText("Enter first no : ");
        lblNum1.setBounds(25, 15, 150, 25);
        
        lblNum2=new JLabel();
        lblNum2.setText("Enter second no : ");
        lblNum2.setBounds(25, 50, 150, 25);
        
        txtNum1=new JTextField();
        txtNum1.setBounds(175, 15, 180, 25);
        
        txtNum2=new JTextField();
        txtNum2.setBounds(175, 50, 180, 25);
        
        btnAdd=new JButton();
        btnAdd.setText("ADD");
        btnAdd.setBounds(175, 85, 75, 25);
        btnAdd.addActionListener(this);
       
        btnClose = new JButton();
        btnClose.setText("CLOSE");
        btnClose.setBounds(275, 85, 75, 25);
        btnClose.addActionListener(this);
        
        add(lblNum1);
        add(lblNum2);
        add(txtNum1);
        add(txtNum2);
        add(btnAdd);
        add(btnClose);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        //handle event
        if(ae.getSource()==btnClose){
            System.exit(0);
        }
        else if(ae.getSource()==btnAdd){
            int num1 = Integer.parseInt(txtNum1.getText());
            int num2 = Integer.parseInt(txtNum2.getText());
            int num3 = num1 + num2;
            System.out.println("Sum : "+num3);
        }
    }
    public static void main(String []args){
        new MyWindow2();
    }
}