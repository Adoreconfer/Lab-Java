package Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditTask extends JFrame{
    private JPanel JPanel1;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTextField textField2;
    private JButton editButton;
    private JButton backButton;

    public EditTask(DefaultListModel<Task> model, Task task, int index) {
        super("Edit task");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);


        textField1.setText(task.getTytul());
        comboBox1.setSelectedItem(task.getPriorytet());
        textField2.setText(task.getData());


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Zadanie1 zadanie1 = new Zadanie1();
                zadanie1.setVisible(true);
            }
        });
        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String newTytul = textField1.getText();
                String newPriority = (String) comboBox1.getSelectedItem();
                String newData = textField2.getText();

                model.set(index, new Task(newTytul, task.getOpis(), newPriority, newData));

                dispose();
                Zadanie1 zadanie1 = new Zadanie1();
                zadanie1.setVisible(true);
            }
        });
    }
}
