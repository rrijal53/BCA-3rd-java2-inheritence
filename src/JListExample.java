import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JListExample extends JFrame{
    JList<String> jlist;
    JButton button;

   public  JListExample(){
        String[] mylist = new String[]{"BIM", "BBA", "BCA"};

        jlist = new JList<>(mylist);
        button = new JButton("CLICK ME");
        add(jlist);
        add(button);
        setSize(300,400);
        setLayout(new FlowLayout());
        button.addActionListener(e -> button.setText(String.valueOf(jlist.getSelectedIndex())));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JListExample();
    }
}


