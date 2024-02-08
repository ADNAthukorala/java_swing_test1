import javax.swing.*;
import java.awt.*;

public class MyFrameLayouts extends JFrame {
    JButton button1, button2, button3, button4, button5;

    MyFrameLayouts() {
        button1 = new JButton("Button 1");
        button2 = new JButton("Button 2");
        button3 = new JButton("Button 3");
        button4 = new JButton("Button 4");
        button5 = new JButton("Button 5");

//        this.setLayout(new BorderLayout());
//        this.add(button1, BorderLayout.NORTH);
//        this.add(button2, BorderLayout.EAST);
//        this.add(button3, BorderLayout.SOUTH);
//        this.add(button4, BorderLayout.WEST);
//        this.add(button5, BorderLayout.CENTER);

        FlowLayout f = new FlowLayout();
        f.setAlignment(FlowLayout.CENTER);
        f.setHgap(30);
        f.setVgap(50);
        this.setLayout(f);
        this.add(button1, BorderLayout.NORTH);
        this.add(button2, BorderLayout.EAST);
        this.add(button3, BorderLayout.SOUTH);
        this.add(button4, BorderLayout.WEST);
        this.add(button5, BorderLayout.CENTER);

    }
}
