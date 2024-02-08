import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameJCheckBox extends JFrame implements ActionListener {
    JCheckBox isBold, isItalic;
    JTextField textField;

    MyFrameJCheckBox() {
        textField = new JTextField("ADNA",10);
        isBold = new JCheckBox("Bold", false);
        isItalic = new JCheckBox("Italic", false);

        this.setLayout(new FlowLayout());
        this.add(isBold);
        this.add(isItalic);
        this.add(textField);

        isBold.addActionListener(this);
        isItalic.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int bold = 0;
        int italic = 0;

        if(isBold.isSelected()) {
            bold = Font.BOLD;
        }
        if (isItalic.isSelected()) {
            italic = Font.ITALIC;
        }

        textField.setFont(new Font("Times New Roman", bold | italic, 12));
    }
}
