import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Konwerter extends JFrame{
    private JPanel JPanel1;
    private JButton policzButton;
    private JTextField celsjusz;
    private JLabel Label;
    private JLabel fahrenheitaLbl;

    public Konwerter(){
        super("Kalkulator konwersji temperatury");
        this.setContentPane(this.JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 200;
        this.setSize(width, height);
        //this.pack();

        policzButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    double cels = Double.parseDouble(celsjusz.getText());
                    double fahr = (cels * 9/5)+32;
                    fahrenheitaLbl.setText("Stopnie Fahrenheita (°F): "+fahr+" °F");
                    //celsjusz.setText("");
                }
                catch (NumberFormatException e1){
                    JOptionPane.showMessageDialog(null, "Wprowadz dane!", "Błąd",JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
}
