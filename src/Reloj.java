import javax.swing.*;
import java.util.*;

public class Reloj extends JFrame implements Runnable {

    String hora,minutos,segundos,ampm="AM";
    Calendar calendario;
    Thread h1;


    public Reloj() {
        super("EJEMPLO DE JAVA SWING ");
        setContentPane(panelPrincipal);
        h1=new Thread(this);
        h1.start();

    }



    private JPanel panelPrincipal;
    private JTextField texto2;
    private JTextField texto3;
    private JButton detenerButton;
    private JButton detenerButton1;
    private JButton detenerButton2;
    private JLabel Hora;
    private JTextField texto1;


    @Override
    public void run() {
        Thread ct =Thread.currentThread();
        while(ct==h1){
            calcula();
            Hora.setText(hora+" : " +minutos+" : "+segundos+ " : ");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("hhh");
            }
        }

    }

    private void calcula() {
        Calendar calendario =new GregorianCalendar();
        Date HoraActual= new Date();
        calendario.setTime(HoraActual);
if(ampm.equals("PM")){
    int h=calendario.get(Calendar.HOUR_OF_DAY)-12;
    hora=h>9?""+h:"0"+h;
}
else{
    hora=calendario.get(Calendar.HOUR_OF_DAY)>9? ""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
}
minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
    }
}
