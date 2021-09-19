import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener, KeyListener, ItemListener, MouseListener {
    JLabel jLabelDisplay;
    JTextField jtf;
    JComboBox<String> comboBox;
   public void itemStateChanged(ItemEvent e){
       String selected = (String) e.getItem();
       jLabelDisplay.setText(selected);
   }

    public void actionPerformed(ActionEvent e){
        String selected = (String)comboBox.getSelectedItem();
        jLabelDisplay.setText(selected);
    }


    Calculator(){
        comboBox = new JComboBox<>(new String[]{"Nepal" ,"US", "India", "China"});
        comboBox.addItemListener(this);

        jtf = new JTextField(20);
        jtf.addKeyListener(new KeyAdapter(){
            public void keyTyped(KeyEvent e) {
                jLabelDisplay.setText(e.getKeyChar() +"");
            }
        });
        add(jtf);
        jLabelDisplay =  new JLabel();
        comboBox.addActionListener(this);
       // addMouseListener(this);
        add(comboBox);
        add(jLabelDisplay);
        setSize(500,500);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        new Calculator();
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("PRESSSED " +  e.getKeyChar());

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("RELEEASED " + e.getKeyChar());

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        jLabelDisplay.setText("ENTERED " +  e.getX() + " " + e.getX());
    }

    @Override
    public void mouseExited(MouseEvent e) {
        jLabelDisplay.setText("EXITED " + e.getX() + " " + e.getX());
    }
}
