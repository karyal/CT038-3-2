package week9;
import javax.swing.JFrame;

public class GUI2 extends JFrame{
    public GUI2(){
        setTitle("My Window2");
        setSize(250, 250);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String []args){
        new GUI2();
    }
}
