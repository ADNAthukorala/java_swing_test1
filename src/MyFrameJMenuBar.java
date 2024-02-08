import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrameJMenuBar extends JFrame implements ActionListener {
    JMenuBar menuBar;
    JMenu fileMenu, helpMenu;
    JMenuItem newItem, openItem, closeItem;

    MyFrameJMenuBar() {
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        helpMenu = new JMenu("Help");
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        closeItem = new JMenuItem("Close");

        newItem.addActionListener(this);
        openItem.addActionListener(this);
        closeItem.addActionListener(this);

        fileMenu.setMnemonic(KeyEvent.VK_F); // ALT + F
        helpMenu.setMnemonic(KeyEvent.VK_H); // ALT + H

        newItem.setMnemonic(KeyEvent.VK_N); // ALT + N
        openItem.setMnemonic(KeyEvent.VK_O); // ALT + O
        closeItem.setMnemonic(KeyEvent.VK_C); // ALT + C

        fileMenu.add(newItem);
        fileMenu.addSeparator();
        fileMenu.add(openItem);
        fileMenu.addSeparator();
        fileMenu.add(closeItem);

        menuBar.add(fileMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            System.out.println("NEW");
        }
        if (e.getSource() == openItem) {
            System.out.println("OPEN");
        }
        if (e.getSource() == closeItem) {
            System.exit(0);
        }
    }
}
