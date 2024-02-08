import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameJTextArea extends JFrame implements ActionListener {
    JTextArea textArea;
    JButton button;

    MyFrameJTextArea() {
        textArea = new JTextArea(10, 40);
        button = new JButton("Add Text");

        this.setLayout(new FlowLayout());
        this.add(textArea);
        this.add(button);

        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            textArea.insert("ADNA", textArea.getCaretPosition());
        }
    }
}
