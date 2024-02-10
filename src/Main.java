import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Created a frame class
class MyFrame extends JFrame {
    JLabel label;
    JButton button;

    // Created a constructor for the frame class
    MyFrame() {
        // Created a new JLabel object
        label = new JLabel();
        label.setText("Hello World");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(Color.blue);

        // Created a new JButton object
        button = new JButton();
        button.setText("Click Me");

        // Added created components to the frame
        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(button);

    }
}

class MyFrameJButton extends JFrame implements ActionListener {
    JLabel label;
    JButton incrementButton, decrementButton;
    int count = 0;

    MyFrameJButton() {
        label = new JLabel("Count " + count);
        incrementButton = new JButton("Increment");
        decrementButton = new JButton("Decrement");

        this.setLayout(new FlowLayout());
        this.add(label);
        this.add(decrementButton);
        this.add(incrementButton);

        incrementButton.addActionListener(this);
        decrementButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == incrementButton) {
            count++;
        }
        if (e.getSource() == decrementButton) {
            count--;
        }
        label.setText("Count " + count);
    }
}

//        MyFrameJMenuBar frame = new MyFrameJMenuBar();
//        frame.setTitle("Application");
//        frame.setSize(420, 420);
//        frame.setLocationRelativeTo(null);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);

public class Main {
    public static void main(String[] args) {
//        String userName = JOptionPane.showInputDialog("Enter your name");
//        if (userName != null) {
//            JOptionPane.showMessageDialog(null,"Your name is " + userName);
//        }
    }
}