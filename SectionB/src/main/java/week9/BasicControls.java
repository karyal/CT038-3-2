package week9;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.ButtonGroup;
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
    JButton btnSave;
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
        setLayout(new GridLayout(10,2));
        
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
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rbMale);
        bg.add(rbFemale);
        
        chk1 = new JCheckBox("Reading");
        chk2=new JCheckBox("Playing");
        chk3=new JCheckBox("Others");
        
        String txtAgeGroups[]={"1-15","16-30","31-45","45+"};
        cmbAgeGroup = new JComboBox(txtAgeGroups);
    
        btnSave = new JButton("Save");
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
        add(new JLabel("Password : "));
        add(txtPassword);
        add(new JLabel("Comments : "));
        add(txtComments);
        add(new JLabel("Gender : "));
        add(rbMale);
        add(new JLabel(""));
        add(rbFemale);
        add(new JLabel("Hobbies : "));
        add(chk1);
        add(new JLabel(""));
        add(chk2);
        add(new JLabel(""));
        add(chk3);
        add(new JLabel("Age Group : "));
        add(cmbAgeGroup);
        add(btnSave);
        add(btnClose);
        setVisible(true);
    }
    public static void main(String []args){
        new BasicControls();
    }
}