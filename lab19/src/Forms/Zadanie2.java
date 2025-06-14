package Forms;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class Zadanie2 extends JFrame{
    private JPanel panel1;
    private JButton deleteButton;
    private JTable table1;
    private JButton addButton;
    private JButton backButton;
    private JButton clearButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JScrollPane scrollPane;
    private DefaultTableModel tableModel;

    public Zadanie2() {
        super("Zadanie 2");
        this.setContentPane(panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 600, height = 400;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);

        String[] columnNames = {"Name", "Email", "Phone", "Address"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table1.setModel(tableModel);
        scrollPane.setViewportView(table1);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                textField4.setText("");
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = textField1.getText();
                String email = textField2.getText();
                String phone = textField3.getText();
                String address = textField4.getText();
                if (name == null || name.trim().isEmpty() ||
                        email == null || email.trim().isEmpty() ||
                        phone == null || phone.trim().isEmpty() ||
                        address == null || address.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Fill all fields");
                }
                else{
                    String[] rowData = {name, email, phone, address};
                    tableModel.addRow(rowData);
                }
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int selectedRow = table1.getSelectedRow();
                    tableModel.removeRow(selectedRow);
                }
                catch (ArrayIndexOutOfBoundsException e1){
                    JOptionPane.showMessageDialog(null, "Not selected");
                }
            }
        });
    }
}
