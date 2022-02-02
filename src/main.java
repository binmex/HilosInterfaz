import javax.swing.*;

public class main {
    public static void main (String [] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame =new Reloj();
                frame.setSize(500,500);
                frame.setVisible(true);
            }
        });
        new Reloj();
    }
}
