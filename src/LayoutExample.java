import javax.swing.*;
import java.awt.*;
public class LayoutExample {
    public LayoutExample(){
        JFrame f = new JFrame();
        JLabel jl = new JLabel("TEST");
        JLabel jl2 = new JLabel("TEST2");
        JLabel jl3 = new JLabel("TEST3");
        JLabel jl4 = new JLabel("TEST4");
        JLabel jl5 = new JLabel("TEST5");
        f.add(jl);
        f.add(jl2);
        f.add(jl3);
        f.add(jl4);
        f.add(jl5);
//        f.setBounds(100, 100, 500, 500);
        f.setSize(200,200);
        f.setVisible(true);
        f.setLayout(new GridLayout(2, 2, 2, 3));

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
            new LayoutExample();
    }
}
