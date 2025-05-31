import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioBtnExample extends JFrame {
    private JPanel JPanel1;
    private JRadioButton linuxRadioButton;
    private JRadioButton windowsRadioButton;
    private JRadioButton macRadioButton;
    private JButton OKButton;
    private JLabel imageLable;
    private JButton backButton;

    private ImageIcon icnoLinux = new ImageIcon(getClass().getResource("figures/linux.png"));
    private ImageIcon icnoMac = new ImageIcon(getClass().getResource("figures/mac.png"));
    private ImageIcon icnoWin = new ImageIcon(getClass().getResource("figures/windows.png"));

    private static ImageIcon resize(ImageIcon src, int width, int height){
            return new ImageIcon(src.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH));
    }

    public RadioBtnExample() {
        super("Przykład Radio Button");
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
                String tekst = "";
                if(linuxRadioButton.isSelected()) tekst = "Linux";
                if(windowsRadioButton.isSelected()) tekst = "Windows";
                if(macRadioButton.isSelected()) tekst = "Mac";
                JOptionPane.showMessageDialog(RadioBtnExample.this, "Wybrano system: "+tekst);
            }
        });
        linuxRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(linuxRadioButton.isSelected()){
                    imageLable.setIcon(resize(icnoLinux, 120, 220));
                }
            }
        });
        windowsRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(windowsRadioButton.isSelected()){
                    imageLable.setIcon(resize(icnoWin, 120, 100));
                }
            }
        });
        macRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(macRadioButton.isSelected()){
                    imageLable.setIcon(resize(icnoMac, 120, 100));
                }
            }
        });
    }
}
