
import javax.swing.*;

public class Main extends JFrame {

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main main = new Main();
            }
        });
    }

    public Main(){

        setVisible(true);
        setSize(800,600);
        setTitle("Flappy Mexican");
        setLocationRelativeTo(null);

    }

}

