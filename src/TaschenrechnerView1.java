import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenrechnerView1 {
    private JTextField anzeige;
    private JButton sevenButton;
    private JButton fourButton;
    private JButton oneButton;
    private JButton clearButton;
    private JButton eightButton;
    private JButton fiveButton;
    private JButton twoButton;
    private JButton nullButton;
    private JButton nineButton;
    private JButton sixButton;
    private JButton threeButton;
    private JButton equalButton;
    private JButton addbutton;
    private JButton subbutton;
    private JPanel MainPanel;
    private String anzeigeText;

    public TaschenrechnerView1() {
        TaschenrechnerModel1 model = new TaschenrechnerModel1();

        nullButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "0";
                anzeige.setText(anzeigeText);
            }
        });
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "1";
                anzeige.setText(anzeigeText);
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "2";
                anzeige.setText(anzeigeText);
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "3";
                anzeige.setText(anzeigeText);
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "4";
                anzeige.setText(anzeigeText);
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "5";
                anzeige.setText(anzeigeText);
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "6";
                anzeige.setText(anzeigeText);
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "7";
                anzeige.setText(anzeigeText);
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "8";
                anzeige.setText(anzeigeText);
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "9";
                anzeige.setText(anzeigeText);
            }
        });
        addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeige.getText()));
                model.setOperator("+");
                anzeigeText = "";
                anzeige.setText(anzeigeText);
            }
        });
        subbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeige.getText()));
                model.setOperator("-");
                anzeigeText = "";
                anzeige.setText(anzeigeText);
            }
        });
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setZweiterOperand(Integer.parseInt(anzeige.getText()));
                int ergebnis = model.getErgebnis();
                anzeigeText = ergebnis + "";
                anzeige.setText(anzeigeText);
                model.zurücksetzen();
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = "";
                anzeige.setText(anzeigeText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("TaschenrechnerView1");
        frame.setContentPane(new TaschenrechnerView1().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
