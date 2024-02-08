import javax.swing.*;
import java.awt.*;

public class MyFrameJCheckBox extends JFrame {
    JCheckBox isBold, isItalic;
    JTextField textField;

    MyFrameJCheckBox() {
        textField = new JTextField(10);
        isBold = new JCheckBox("Bold");
        isItalic = new JCheckBox("Italic");

        this.setLayout(new FlowLayout());
        this.add(isBold);
        this.add(isItalic);
        this.add(textField);
    }
}
