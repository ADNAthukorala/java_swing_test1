import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameJRadioButton extends JFrame implements ActionListener {
    JLabel label;
    JRadioButton radioButton1, radioButton2, radioButton3;

    MyFrameJRadioButton() {
        ButtonGroup group = new ButtonGroup();
        label = new JLabel("Not Selected");
        radioButton1 = new JRadioButton("Orange");
        radioButton2 = new JRadioButton("Apple");
        radioButton3 = new JRadioButton("Grapes");
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);

        this.setLayout(new FlowLayout());
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(label);

        radioButton1.addActionListener(this);
        radioButton2.addActionListener(this);
        radioButton3.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (radioButton1.isSelected()) {
            label.setText(radioButton1.getText());
        }
        if (radioButton2.isSelected()) {
            label.setText(radioButton2.getText());
        }
        if (radioButton3.isSelected()) {
            label.setText(radioButton3.getText());
        }
    }
}
