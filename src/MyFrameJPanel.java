import javax.swing.*;
import java.awt.*;

public class MyFrameJPanel extends JFrame {
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;
    JPanel panel1, panel2;

    MyFrameJPanel() {
        btn1 = new JButton("Button 1");
        btn2 = new JButton("Button 2");
        btn3 = new JButton("Button 3");
        btn4 = new JButton("Button 4");
        btn5 = new JButton("Button 5");
        btn6 = new JButton("Button 6");
        btn7 = new JButton("Button 7");
        btn8 = new JButton("Button 8");
        btn9 = new JButton("Button 9");
        btn10 = new JButton("Button 10");

        // Panel 1
        panel1 = new JPanel();
        panel1.setLayout(new FlowLayout());
        panel1.setBackground(Color.GREEN);
        panel1.add(btn5);
        panel1.add(btn6);
        panel1.add(btn7);

        // Panel 2
        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(3,1));
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btn10);

        this.setLayout(new BorderLayout());
        this.add(btn1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.EAST);
        this.add(btn3, BorderLayout.SOUTH);
        this.add(btn4, BorderLayout.WEST);
        this.add(panel1, BorderLayout.CENTER);
    }
}
