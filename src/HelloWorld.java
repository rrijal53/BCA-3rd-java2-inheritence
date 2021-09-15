import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloWorld extends JFrame implements ActionListener {
    JLabel jlName, jlAddress, jlGender, jLabelDisplay;
    JTextField jtName;
    JTextField jtAddress;
    JButton btn;
    JRadioButton rbGender, rbFGender;
    JTabbedPane tabbedPane;
    ButtonGroup bg ;
    public void actionPerformed(ActionEvent e){
        String inputName = jtName.getText();
        jLabelDisplay.setText("Hello " + inputName);
    }
    HelloWorld(){
        jlName = new JLabel("Name");
        jlAddress = new JLabel("Address");
        jlGender = new JLabel("Gender");
        jLabelDisplay = new JLabel();
        jtName = new JTextField(30);
        jtAddress = new JTextField(30);
        rbGender = new JRadioButton("Male");
        rbFGender = new JRadioButton("Female");
        btn = new JButton("Submit");
        bg = new ButtonGroup();
        JPanel panel = new JPanel();
        panel.add(jlAddress);

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.CYAN);
        panel2.add(jlName);
        panel2.add(jtName);

        panel2.add(btn);
        panel2.add(jLabelDisplay);
        btn.addActionListener(this);

        panel.add(jlGender);
        jlName.setBounds(50, 0, 100, 20);

        jlAddress.setBounds(50, 20, 100, 20);
        jlGender.setBounds(50, 40, 100, 20);
        panel.setLayout(null);
        tabbedPane = new JTabbedPane();
        tabbedPane.add("Home", panel);
        tabbedPane.add("Services", panel2 );
        tabbedPane.setBounds(0,0,400,400);
       // getContentPane().setBackground(Color.BLUE);
        add(tabbedPane);
//        bg.add(rbGender);
//        bg.add(rbFGender);

//        add(jlName);
//        add(jtName);
//        add(jlAddress);
//        add(jtAddress);
//        add(jlGender);
//        add(rbGender);
//        add(rbFGender);

//        setSize(300, 300);
        setBounds(100, 100 , 500 ,500);

        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new HelloWorld();
    }
}
