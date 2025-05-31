import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel JPanel1;
    private JTextField loginUser;
    private JButton loginButton;
    private JButton closeButton;
    private JPasswordField passwordField1;
    private JLabel outputLabel;

    String user = "admin", password = "admin";
    public LoginForm(){
        super("Login");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);
        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userNameInput = loginUser.getText();
                String userPINInput = new String(passwordField1.getPassword());

                if(userNameInput.equals(user) && userPINInput.equals(password)){
                    outputLabel.setText("Zalogowano do systemu, witaj: "+userNameInput);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        throw new RuntimeException(ex);
                    }
                    dispose();
                    Menu menu = new Menu();
                    menu.setVisible(true);
                }
                else{
                    outputLabel.setText("Podano błędne dane logowania spróbuj ponownie");
                    loginUser.setText("");
                    passwordField1.setText("");
                }
            }
        });
    }
}
