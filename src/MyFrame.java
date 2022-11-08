import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    // adding the Calendar to get current date and time
    Calendar calendar;
    SimpleDateFormat simpleDayFormat;
    SimpleDateFormat simpleTimeFormat;
    SimpleDateFormat simpleDateFormat;
    // to display the time
    JLabel jTimeLabel;
    // to display the day
    JLabel jDayLabel;
    // to display the date
    JLabel jDateLabel;
    String time;
    String day;
    String date;

    // creating constructor for MyFrame
    MyFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("CLOCK");
        this.setLayout(new FlowLayout());
        this.setSize(550, 200);
        // this.setResizable(false);

        // format of  our time
        simpleTimeFormat = new SimpleDateFormat("HH:mm:ss {z}");
        // format of our day
        simpleDayFormat = new SimpleDateFormat("EEEE");
        // format of our date
        simpleDateFormat = new SimpleDateFormat("dd MMMMM, yyyy");

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

        // instantiating the date label
        jDateLabel = new JLabel();
        // changing the font
        jDateLabel.setFont(new Font("Ink Free", Font.PLAIN, 25));

        //  adding the time label to the jFrame
        this.add(jTimeLabel);
        // adding the day label to the jFrame
        this.add(jDayLabel);
        // adding date label to the frame
        this.add(jDateLabel);

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

            // getting and storing the day in a string
            day = simpleDayFormat.format(Calendar.getInstance().getTime());
            // adding the string to the label
            jDayLabel.setText(day);

            // getting and storing the date in a string
            date = simpleDateFormat.format(Calendar.getInstance().getTime());
            // adding the string to the label
            jDateLabel.setText(date);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}