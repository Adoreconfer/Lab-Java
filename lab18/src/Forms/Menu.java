package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JButton zadanie1Button;
    private JPanel panel1;
    private JButton zadanie2Button;

    public Menu(){
        super("Menu");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 400;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);

        zadanie1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Zadanie1 zadanie1 = new Zadanie1();
                zadanie1.setVisible(true);
            }
        });
        zadanie2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Zadanie2 zadanie2 = new Zadanie2();
                zadanie2.setVisible(true);
            }
        });
    }
}
