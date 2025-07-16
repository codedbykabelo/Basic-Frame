

package ac.tut.ui;

import java.awt.Color;
import javax.swing.JFrame;

public class MyFirstFrame extends JFrame {

    public MyFirstFrame() {
        setTitle("MASHA KABELO");
        setSize(200, 250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);
        setResizable(true);
        setForeground(Color.red);
    }
    
}