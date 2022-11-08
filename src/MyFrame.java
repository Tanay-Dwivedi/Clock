import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    // adding the Calendar to get current date and time
    Calendar calendar;
    SimpleDateFormat simpleDateFormat;
    // to display the time
    JLabel jLabel;
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
            jLabel = new JLabel();

            // getting and storing the time in a string
            time = simpleDateFormat.format(Calendar.getInstance().getTime());
            // adding the string to the label
            jLabel.setText(time);

            //  adding the label to the jFrame
            this.add(jLabel);
            this.setVisible(true);

        }
}
