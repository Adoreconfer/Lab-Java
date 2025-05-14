import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kliker extends JFrame{
    private JButton klikB;
    private JLabel scoreLbl;
    private JPanel JPanel1;
    private JTextField textField1;
    private JLabel record;
    private int recordv;
    private JButton ok;
    private JLabel recordLbl;
    private int score;


    public Kliker() {
        super("Clicker");
        this.setContentPane(JPanel1);
        int width = 400, height = 300;
        this.setSize(width, height);

        klikB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(score==recordv){
                    JOptionPane.showMessageDialog(null, "You broke the record!");
                }
                score++;
                scoreLbl.setText(String.valueOf(score));
            }
        });
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    recordv = Integer.parseInt(textField1.getText());
                    textField1.setText("");
                    recordLbl.setText("Record: "+recordv);
                }
                catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(null, "Set record", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
