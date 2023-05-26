package week6;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MyWindow extends JFrame{
    JLabel lblNum1, lblNum2;
    JTextField txtNum1, txtNum2;
    JButton btnClose;
    
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
        
        
        add(lblNum1);
        add(txtNum1);
        add(lblNum2);
        add(txtNum2);
        setVisible(true);
    }
    public static void main(String []args){
        new MyWindow();
    }
}
