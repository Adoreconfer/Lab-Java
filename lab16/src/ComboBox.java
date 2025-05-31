import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame{
    private JPanel JPanel1;
    private JButton OKButton;
    private JButton backButton;
    private JComboBox comboBox1;
    private JLabel showtext;

    public ComboBox() {
        super("ComboBox");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String date = "Wybrano jezyk: " + comboBox1.getItemAt(comboBox1.getSelectedIndex());
                showtext.setText(date);
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
