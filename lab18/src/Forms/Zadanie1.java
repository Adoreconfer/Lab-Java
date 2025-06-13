package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame{
    private JPanel JPanel1;
    private JList list1;
    private JList list2;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton backButton;

    public Zadanie1(){
        super("Zadanie 1");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 400;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);

        DefaultListModel<String> model = new DefaultListModel<>();
        list1.setModel(model);
        model.addElement("a");
        model.addElement("b");
        model.addElement("c");


        DefaultListModel<String> model1 = new DefaultListModel<>();
        list2.setModel(model1);
        model1.addElement("d");
        model1.addElement("f");
        model1.addElement("e");

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = list1.getSelectedIndex();
                model1.addElement(model.getElementAt(index));
                model.remove(index);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = list2.getSelectedIndex();
                model.addElement(model1.getElementAt(index));
                model1.remove(index);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < model.size(); i++) {
                    model1.addElement(model.getElementAt(i));
                }

                model.clear();
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (int i = 0; i < model1.size(); i++) {
                    model.addElement(model1.getElementAt(i));
                }

                model1.clear();
            }
        });
    }
}
