import javax.swing.*;

public class WelcomeForm extends JFrame{
    private JPanel JPanel1;
    private JProgressBar progressBar1;
    private JLabel lbPleaseWait;

    public WelcomeForm() {
        super("Welcome form");
        this.setContentPane(JPanel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int width = 400, height = 300;
        this.setSize(width, height);

        this.setVisible(true);
        progression();
        //kolejny widok GUI
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }

    private void progression(){
        int counter = 0;
        while (counter<=100){
            lbPleaseWait.setText("Please wait...");
            progressBar1.setValue(counter);
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter+=5;
        }
        dispose();
    }
}
