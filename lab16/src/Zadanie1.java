import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie1 extends JFrame{
    private JPanel JPanel1;
    private JPasswordField passwordField1;
    private JButton OKButton;
    private JPasswordField passwordField2;
    private JButton backButton;

    public Zadanie1(){
        super("Zadanie 1 | Password");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);


        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String pass1 = new String(passwordField1.getPassword());
                String pass2 = new String(passwordField2.getPassword());
                if(pass1.equals(pass2)){
                    if(pass1.equals("codejava")){
                        JOptionPane.showMessageDialog(null, "Congratulations! You entered correct password.");
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Wrong password!");
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Passwords do not match!");
                }
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
