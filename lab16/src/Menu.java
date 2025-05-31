import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JPanel JPanel1;
    private JButton radioBoxBtn;
    private JButton checkBoxBtn;
    private JButton wylogujButton;
    private JButton wyjscieButton;
    private JButton przykładComboBoxButton;
    private JButton zadanie1Button;
    private JButton zadanie2Button;

    public Menu() {
        super("Menu");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);

        wylogujButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                LoginForm loginForm = new LoginForm();
                loginForm.setVisible(true);
            }
        });
        checkBoxBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                CheckBoxExample checkBoxExample = new CheckBoxExample();
                checkBoxExample.setVisible(true);
            }
        });
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
        radioBoxBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                RadioBtnExample radioBtnExample = new RadioBtnExample();
                radioBtnExample.setVisible(true);
            }
        });
        przykładComboBoxButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                ComboBox comboBox = new ComboBox();
                comboBox.setVisible(true);
            }
        });
    }
}
