package Forms;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ContactsForm extends JFrame{
    private JPanel JPanel1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JButton saveNewButton;
    private JButton saveExistingButton;
    private JList list1;
    private JLabel ageLbl;

    public ContactsForm(){
        super("Contacts");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 400;
        this.setSize(width, height);
        this.setLocationRelativeTo(null);

        DefaultListModel<Osoba> model = new DefaultListModel<>();
        list1.setModel(model);

        model.addElement(new Osoba("Jan Kowalski", "jk7@gmail.com", 100000000, "ul. Zielona", "01.07.2001"));
        model.addElement(new Osoba("Marian Nowak", "mn7@gmail.com", 100000001, "ul. Zielona", "01.07.2002"));
        model.addElement(new Osoba("Janina Urban", "mn7@gmail.com", 100000002, "ul. Zielona", "01.07.2001"));

        list1.addListSelectionListener(e -> {
            if (!e.getValueIsAdjusting()) {
                Osoba selected = (Osoba) list1.getSelectedValue();
                if (selected != null) {
                    textField1.setText(selected.getImie());
                    textField2.setText(selected.getEmail());
                    textField3.setText(String.valueOf(selected.getNumer()));
                    textField4.setText(selected.getAddress());
                    textField5.setText(selected.getDataofbirth());
                    ageLbl.setText(obliczWiek(selected.getDataofbirth()) + " years");
                    saveExistingButton.setEnabled(true);
                }
            }
        });
        saveExistingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String imie = textField1.getText();
                String email = textField2.getText();
                long phone = Long.parseLong(textField3.getText());
                String address = textField4.getText();
                String birth = textField5.getText();

                model.set(list1.getSelectedIndex(), new Osoba(imie, email, phone, address, birth));
                JOptionPane.showMessageDialog(null, "Data has been edited!");
            }
        });
        saveNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String imie = textField1.getText();
                String email = textField2.getText();
                long phone = Long.parseLong(textField3.getText());
                String address = textField4.getText();
                String birth = textField5.getText();

                model.addElement(new Osoba(imie, email, phone, address, birth));
                JOptionPane.showMessageDialog(null, "Added new user!");
            }
        });
    }

    private int obliczWiek(String dataUrodzenia) {
        try {
            java.time.format.DateTimeFormatter formatter = java.time.format.DateTimeFormatter.ofPattern("dd.MM.yyyy");
            java.time.LocalDate birthDate = java.time.LocalDate.parse(dataUrodzenia, formatter);
            java.time.LocalDate today = java.time.LocalDate.now();
            return java.time.Period.between(birthDate, today).getYears();
        } catch (Exception e) {
            System.err.println("Błąd parsowania daty: " + dataUrodzenia);
            return 0;
        }
    }
}
