package week9;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class BasicControls extends JFrame{
    JLabel lblName;
    JTextField txtName;
    JPasswordField txtPassword;
    JTextArea txtComments;
    JRadioButton rbMale, rbFemale;
    JCheckBox chk1, chk2, chk3;
    JComboBox cmbAgeGroup;
    JButton btnClose;
    JMenuBar menuBar1;
    JMenu menuFile;
    JMenuItem miNew;
    JMenuItem miOpen;
    
    public BasicControls(){
        setTitle("My Window2");
        setSize(250, 500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        lblName=new JLabel();
        lblName.setText("Name : ");
        
        txtName= new JTextField();
        txtName.setColumns(15);
        
        txtPassword = new JPasswordField();
        txtPassword.setColumns(15);
        
        txtComments=new JTextArea();
        txtComments.setRows(4);
        txtComments.setColumns(15);
        
        rbMale=new JRadioButton("Male");
        rbFemale=new JRadioButton();
        rbFemale.setText("Female");
    
        chk1 = new JCheckBox("Reading");
        chk2=new JCheckBox("Playing");
        chk3=new JCheckBox("Others");
        
        cmbAgeGroup = new JComboBox();
    
        btnClose = new JButton("Close");
    
        menuBar1 = new JMenuBar();
        menuFile = new JMenu("File");
        miNew = new JMenuItem("New");
        miOpen = new JMenuItem("Open");
        menuFile.add(miNew);
        menuFile.addSeparator();
        menuFile.add(miOpen);
        menuBar1.add(menuFile);
        
        
        add(lblName);//add on frame
        add(txtName);
        add(txtPassword);
        add(txtComments);
        add(rbMale);
        add(rbFemale);
        add(chk1);add(chk2);add(chk3);
        add(cmbAgeGroup);
        add(btnClose);
        add(menuBar1);
        
        setVisible(true);
    }
    public static void main(String []args){
        new BasicControls();
    }
}