import javax.swing.*;
import java.awt.*;

class MyFrame extends JFrame {
    JLabel label;
    MyFrame() {
        label = new JLabel();
        label.setText("Hello World");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.blue);

        this.add(label);
    }
}

public class Main {
    public static void main(String[] args) {

        MyFrame frame = new MyFrame();
        frame.setTitle("Application");
        frame.setSize(420, 420);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}