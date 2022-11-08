import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

        // creating constructor for MyFrame
        MyFrame() {
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("CLOCK");
            this.setLayout(new FlowLayout());
            this.setSize(350, 200);
            this.setResizable(false);
            this.setVisible(true);

        }

}
