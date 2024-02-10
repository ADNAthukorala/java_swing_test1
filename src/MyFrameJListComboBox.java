import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrameJListComboBox extends JFrame implements ListSelectionListener, ActionListener {
    JList<String> listBox;
    JComboBox<String> comboBox;

    MyFrameJListComboBox() {
        String[] carBrands = {"Nissan-GTR", "Lamborghini", "BMW", "Ferrari", "Suzuki", "Mitsubishi", "Mazda"};

        // Created a list box
        listBox = new JList<>(carBrands);
        listBox.setVisibleRowCount(4);
        listBox.addListSelectionListener(this);

        // Created a combo box
        comboBox = new JComboBox<>(carBrands);
        comboBox.addActionListener(this);

        this.setLayout(new FlowLayout());
        this.add(new JScrollPane(listBox));
        this.add(comboBox);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        if (e.getSource() == listBox) {
            System.out.println(listBox.getSelectedValuesList());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedItem());
        }
    }
}
