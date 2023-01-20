import javax.swing.*;
import java.awt.*;
public class FlowLayoutFrame extends JFrame{
    JButton uno=new JButton("uno");
    JButton due=new JButton("due");
    JButton tre=new JButton("tre");
    JButton quattro=new JButton("quattro");
    JButton cinque=new JButton("cinque");
    public FlowLayoutFrame(){
        super("Flow Layout");
        Container c=this.getContentPane();
        c.setLayout(new FlowLayout());

        c.add(uno);
        c.add(due);
        c.add(tre);
        c.add(quattro);
        c.add(cinque);
        this.setSize(300,100);
        this.setVisible(true);
    }
}
