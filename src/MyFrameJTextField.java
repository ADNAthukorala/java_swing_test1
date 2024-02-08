import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameJTextField extends JFrame implements ActionListener {
    JLabel label;
    JButton button;
    JTextField textField;
    String message = "Empty Field";
    MyFrameJTextField() {
        label = new JLabel(message);
        button = new JButton("Click");
        textField = new JTextField(15);

        this.setLayout(new FlowLayout());
        this.add(textField);
        this.add(button);
        this.add(label);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            message = textField.getText();
        }
        if (textField.getText().isEmpty()) {
            message = "Empty Field";
        }
        label.setText(message);
    }
}
