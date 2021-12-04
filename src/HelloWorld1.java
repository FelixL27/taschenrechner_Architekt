import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HelloWorld1 {
    private JButton halloButton;
    private JPanel mainPanel;
    private JTextField nameField;
    private JCheckBox informalCheckBox;

    public HelloWorld1() {
        halloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message();
            }
        });

        nameField.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                Color mintgruen = Color.decode("#ade3d1");
                nameField.setBackground(mintgruen);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                nameField.setBackground(null);
            }
        });

        nameField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                message();
            }
        });
    }

    public void message() {
        String name = nameField.getText();
        System.out.println(name);
        boolean informell = informalCheckBox.isSelected();
        if (informell) {
            JOptionPane.showMessageDialog(halloButton, "Yo " + name);
        } else {
            JOptionPane.showMessageDialog(halloButton, "Herzlich Wilkommen " + name);
        }
    }

    public static void main (String[] args) {
        JFrame frame = new JFrame("HelloWorld1");
        frame.setContentPane(new HelloWorld1().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
