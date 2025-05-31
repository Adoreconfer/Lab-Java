import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckBoxExample extends JFrame{
    private JPanel JPanel1;
    private JButton wsteczButton;
    private JButton okButton;
    private JButton wyjścieButton1;
    private JCheckBox javaPrice3500CheckBox;
    private JCheckBox cSPrice3500CheckBox;
    private JCheckBox cPrice4000CheckBox;
    private JCheckBox pythonPrice5000CheckBox;

    public CheckBoxExample(){
        super("Przykład CheckBox");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "";
                float price = 0;
                if(javaPrice3500CheckBox.isSelected()){
                    price+=3500;
                    text+=javaPrice3500CheckBox.getText()+"\n";
                }
                if(cSPrice3500CheckBox.isSelected()){
                    price+=3500;
                    text+=cSPrice3500CheckBox.getText()+"\n";
                }
                if(cPrice4000CheckBox.isSelected()){
                    price+=4000;
                    text+=cPrice4000CheckBox.getText()+"\n";
                }
                if(pythonPrice5000CheckBox.isSelected()){
                    price+=5000;
                    text+=pythonPrice5000CheckBox.getText()+"\n";
                }
                text+="---------------------------------\n";
                JOptionPane.showMessageDialog(null, text+" Razem: "+price+" PLN");
            }
        });
        wsteczButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });
        wyjścieButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                dispose();
                LoginForm loginForm= new LoginForm();
                loginForm.setVisible(true);
            }
        });
    }
}
