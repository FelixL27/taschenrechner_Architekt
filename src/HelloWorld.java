import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HelloWorld {
    private JPanel mainPanel;
    private JButton halloButton;
    private JTextField nameField;
    private JLabel nameLabel;
    private JCheckBox informalCheckBox;

    public HelloWorld() {
        halloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMessage();
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
                showMessage();
            }
        });
    }

    public void showMessage(){
        String name = nameField.getText();
        System.out.println(name);
        boolean informell = informalCheckBox.isSelected();
        String message;
        if(informell) {
            message = "Yo, " + name + "!";
        }
        else {
            message = "Herzlich willkommen, " + name + "!";
        }
        JOptionPane.showMessageDialog(halloButton, message);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelloWorld");
        frame.setContentPane(new HelloWorld().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
