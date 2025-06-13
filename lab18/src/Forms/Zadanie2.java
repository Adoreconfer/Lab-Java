package Forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie2 extends JFrame{
    private JPanel JPanel1;
    private JComboBox comboBox1;
    private JTextArea textArea1;
    private JButton bButton;
    private JButton iButton;
    private JButton zButton;
    private JButton pButton;
    private JButton backButton;

    public Zadanie2(){
        super("Zadanie 2");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 400;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);

        Font currentFont = textArea1.getFont();
        enum Kolor{
            //Czerwony, Zielony, Niebieski, Żółty, Szary, Fioletowy
            Czerwony(java.awt.Color.RED),
            Zielony(java.awt.Color.GREEN),
            Niebieski(java.awt.Color.BLUE),
            Żółty(java.awt.Color.YELLOW),
            Szary(java.awt.Color.GRAY),
            Fioletowy(new Color(168, 5, 168));
            Color color;
            Kolor(java.awt.Color color) {
                this.color = color;
            }
            public java.awt.Color getColor() {
                return color;
            }
            @Override
            public String toString() {
                return name();
            }
        }
        for (Kolor kolor : Kolor.values()) {
            comboBox1.addItem(kolor);
        }

        comboBox1.addActionListener(e -> {
            Kolor selected = (Kolor) comboBox1.getSelectedItem();
            if (selected != null) {
                textArea1.setForeground(selected.getColor());
            }
        });
        bButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setFont(currentFont.deriveFont(Font.BOLD));
            }
        });
        iButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setFont(currentFont.deriveFont(Font.ITALIC));
            }
        });
        zButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (currentFont.getSize() > 1) {
                    textArea1.setFont(new Font(
                            currentFont.getName(),
                            currentFont.getStyle(),
                            currentFont.getSize() - 1
                    ));
                }
            }
        });
        pButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea1.setFont(new Font(
                        currentFont.getName(),
                        currentFont.getStyle(),
                        currentFont.getSize() + 1
                ));
            }
        });
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
    }
}
