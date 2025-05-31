import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Zadanie2 extends JFrame{
    private JPanel JPanel1;
    private JRadioButton małaRadioButton;
    private JRadioButton sredniaRadioButton;
    private JRadioButton duzaRadioButton;
    private JCheckBox pomidorCheckBox;
    private JCheckBox serCheckBox;
    private JCheckBox pepperoniCheckBox;
    private JCheckBox pieczarkiCheckBox;
    private JCheckBox ananasCheckBox;
    private JCheckBox oreganoCheckBox;
    private JButton OKButton;
    private JButton backButton;
    private JComboBox comboBox1;
    private JLabel obslugaLbl;

    public Zadanie2(){
        super("Zadanie 2 | Pizza");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);


        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                Menu menu = new Menu();
                menu.setVisible(true);
            }
        });

        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "";
                double cena = 0;
                if(małaRadioButton.isSelected()) {
                    cena+=10;
                    text+=małaRadioButton.getText()+": 10 zł\n";
                }
                if(sredniaRadioButton.isSelected()) {
                    cena+=20;
                    text+=sredniaRadioButton.getText()+": 20 zł\n";
                }
                if(duzaRadioButton.isSelected()) {
                    cena+=30;
                    text+=duzaRadioButton.getText()+": 30 zł\n";
                }
                if(pomidorCheckBox.isSelected()){
                    cena+=5;
                    text+=pomidorCheckBox.getText()+": 5 zł\n";
                }
                if(serCheckBox.isSelected()){
                    cena+=6;
                    text+=serCheckBox.getText()+": 6 zł\n";
                }
                if(pepperoniCheckBox.isSelected()){
                    cena+=7;
                    text+=pomidorCheckBox.getText()+": 7 zł\n";
                }
                if(pieczarkiCheckBox.isSelected()){
                    cena+=6;
                    text+=pieczarkiCheckBox.getText()+": 6 zł\n";
                }
                if(ananasCheckBox.isSelected()){
                    cena+=8;
                    text+=ananasCheckBox.getText()+": 8 zł\n";
                }
                if(oreganoCheckBox.isSelected()){
                    cena+=4;
                    text+=oreganoCheckBox.getText()+": 4 zł\n";
                }
                text+=obslugaLbl.getText()+": "+comboBox1.getItemAt(comboBox1.getSelectedIndex())+"\n";
                JOptionPane.showMessageDialog(null, text+"---------\nRazem: "+cena);
            }
        });
    }
}
