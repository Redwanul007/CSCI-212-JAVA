
import javax.swing.*;
import java.awt.*;

public class CandleGUI extends JFrame {
    private GridLayout gl;
    public   JLabel label1,label2;

    public CandleGUI()
    {
        GridLayout gl = new GridLayout(1,2);
        gl.setHgap(10);
        gl.setVgap(2);
        label1 = new JLabel("");
        label2 = new JLabel("");
        setLayout(gl);
        add(label1);
        add(label2);
        setTitle("Candles");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,400);
        setVisible(true);
    }

}