package week9;
import javax.swing.JFrame;

public class GUI1 {
    JFrame frame;
    public GUI1(){
        frame=new JFrame();
        frame.setTitle("My First Window");
        frame.setSize(350, 250);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String []args){
        new GUI1();
    }
}