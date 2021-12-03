import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TaschenrechnerView {
    private JTextField anzeige;
    private JPanel mainPanel;
    private JButton nullButton;
    private JButton zweiButton;
    private JButton einsButton;
    private JButton dreiButton;
    private JButton fünfButton;
    private JButton achtButton;
    private JButton sechsButton;
    private JButton neunButton;
    private JButton vierButton;
    private JButton siebenButton;
    private JButton gleichButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton clearButton;
    private String anzeigeText;

    public static void main(String[] args) {
        JFrame frame = new JFrame("TaschenrechnerView");
        frame.setContentPane(new TaschenrechnerView().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public TaschenrechnerView() {

        TaschenrechnerModel model = new TaschenrechnerModel();

        nullButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "0";
                anzeige.setText(anzeigeText);
            }
        });
        einsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "1";
                anzeige.setText(anzeigeText);
            }
        });
        zweiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "2";
                anzeige.setText(anzeigeText);
            }
        });
        dreiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "3";
                anzeige.setText(anzeigeText);
            }
        });
        vierButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "4";
                anzeige.setText(anzeigeText);
            }
        });
        fünfButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "5";
                anzeige.setText(anzeigeText);
            }
        });
        sechsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "6";
                anzeige.setText(anzeigeText);
            }
        });
        siebenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "7";
                anzeige.setText(anzeigeText);
            }
        });
        achtButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "8";
                anzeige.setText(anzeigeText);
            }
        });
        neunButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                anzeigeText = anzeige.getText();
                anzeigeText = anzeigeText + "9";
                anzeige.setText(anzeigeText);
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeige.getText()));
                model.setOperator("+");
                anzeigeText = "";
                anzeige.setText(anzeigeText);
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setErsterOperand(Integer.parseInt(anzeige.getText()));
                model.setOperator("-");
                anzeigeText = "";
                anzeige.setText(anzeigeText);
            }
        });
        gleichButton.addActionListener(new ActionListener() {
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
}
