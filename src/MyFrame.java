import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    // adding the Calendar to get current date and time
    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    // to display the time
    JLabel jTimeLabel;
    String time;

    // creating constructor for MyFrame
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CLOCK");
        this.setLayout(new FlowLayout());
        this.setSize(550, 200);
        this.setResizable(false);

        // format of  our time
        simpleDateFormat = new SimpleDateFormat("hh:mm:ss a  z");
        // instantiating the jLabel
        jTimeLabel = new JLabel();

        jTimeLabel.setSize(MyFrame.WIDTH, 80);
        // changing the font
        jTimeLabel.setFont(new Font("Righteous", Font.PLAIN, 65));
        // changing the foreground color
        jTimeLabel.setForeground(new Color(0x7FFFD4));
        // changing the background color
        jTimeLabel.setBackground(Color.BLACK);
        // to display the background to the frame
        jTimeLabel.setOpaque(true);

        //  adding the label to the jFrame
        this.add(jTimeLabel);
        this.setVisible(true);

        // method tp update our time every 1 second
        setTime();

    }

    public void setTime() {

        while (true) {
            // getting and storing the time in a string
            time = simpleDateFormat.format(Calendar.getInstance().getTime());
            // adding the string to the label
            jTimeLabel.setText(time);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}