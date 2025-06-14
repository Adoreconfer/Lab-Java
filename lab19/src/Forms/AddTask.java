package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddTask extends JFrame{
    private JPanel JPanel1;
    private JTextField textField1;
    private JTextArea textArea1;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JButton addTaskButton;
    private JButton backButton;

    public AddTask(DefaultListModel<Task> model){
        super("Add task");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 400;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Zadanie1 zadanie1 = new Zadanie1();
                zadanie1.setVisible(true);
            }
        });
        addTaskButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tytul = textField1.getText();
                String opis = textArea1.getText();
                String priorytet = comboBox1.getItemAt(comboBox1.getSelectedIndex()).toString();
                String data = textField2.getText();
                model.addElement(new Task(tytul, opis, priorytet, data));
                dispose();
                Zadanie1 zadanie1 = new Zadanie1();
                zadanie1.setVisible(true);
            }
        });
    }
}
