import javax.swing.*;
import java.awt.*;
public class BorderLayoutFrame extends JFrame{
    JButton nord = new JButton("Nord");
    JButton est = new JButton("Est");
    JButton sud = new JButton("Sud");
    JButton ovest = new JButton("Ovest");
    JButton centro = new JButton("Centro");
    public BorderLayoutFrame(){
        super("Border Layout");
        Container c = this.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(nord, BorderLayout.NORTH);
        c.add(est, BorderLayout.EAST);
        c.add(sud, BorderLayout.SOUTH);
        c.add(ovest, BorderLayout.WEST);
        c.add(centro, BorderLayout.CENTER);
        setSize(400,400);
        setVisible(true);
        setResizable(false);
    }
}