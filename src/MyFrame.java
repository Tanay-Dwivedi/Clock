import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    // adding the Calendar to get current date and time
    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    SimpleDateFormat simpleTimeFormat;
    // to display the time
    JLabel jTimeLabel;
    // to display the date
    JLabel jDayLabel;
    String time;
    String day;

    // creating constructor for MyFrame
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CLOCK");
        this.setLayout(new FlowLayout());
        this.setSize(550, 200);
        this.setResizable(false);

        // format of  our time
        simpleTimeFormat = new SimpleDateFormat("hh:mm:ss a  z");
        // format of our date
        simpleDateFormat = new SimpleDateFormat("EEEE");

        // instantiating the time label
        jTimeLabel = new JLabel();
        // changing the font
        jTimeLabel.setFont(new Font("Verdana", Font.BOLD, 50));
        // changing the foreground color
        jTimeLabel.setForeground(new Color(0x7FFFD4));
        // changing the background color
        jTimeLabel.setBackground(Color.BLACK);
        // to display the background to the frame
        jTimeLabel.setOpaque(true);

        // instantiating the day label
        jDayLabel = new JLabel();
        // changing the font
        jDayLabel.setFont(new Font("Ink Free", Font.PLAIN, 35));

        //  adding the time label to the jFrame
        this.add(jTimeLabel);
        // adding the day label to the jFrame
        this.add(jDayLabel);

        this.setVisible(true);

        // method tp update our time every 1 second
        setTime();

    }

    public void setTime() {

        while (true) {
            // getting and storing the time in a string
            time = simpleTimeFormat.format(Calendar.getInstance().getTime());
            // adding the string to the label
            jTimeLabel.setText(time);

            // getting and storing the time in a string
            day = simpleDateFormat.format(Calendar.getInstance().getTime());
            // adding the string to the label
            jDayLabel.setText(day);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

}