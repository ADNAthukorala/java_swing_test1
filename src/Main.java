import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        frame.setTitle("First Application");

        frame.setSize(420, 420);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

        frame.getContentPane().setBackground(new Color(255, 54, 123));
    }
}