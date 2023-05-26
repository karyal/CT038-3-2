package week5.task1;

import javax.swing.JFrame;
import javax.swing.JButton;

public class MyWindow extends JFrame{
    JButton btnClose;
    
    public MyWindow(){
        super();
        setTitle("My First Window");
        setSize(450, 500);
        
        btnClose=new JButton();
        btnClose.setText("Close");
        
        super.add(btnClose);
        setVisible(true);
    }
    public static void main(String []args){
        new MyWindow();
    }
}
