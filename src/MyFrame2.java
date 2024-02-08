import javax.swing.*;
import java.awt.*;

public class MyFrame2 extends JFrame {
    MyFrame2() {
        JLabel label;
        JButton button;
        JTextField textField;
        String message = "Welcome";

        label = new JLabel(message);
        button = new JButton("Click");
        textField = new JTextField();

        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(button);
    }
}
