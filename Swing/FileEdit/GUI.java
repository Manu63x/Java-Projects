import javax.swing.*;
import java.awt.*;
public class GUI {
    JFrame frmPrin;
    static JMenuBar mb;
    static JMenu x;
    static JMenuItem m1, m2;
    JTextArea txtAreaFile;
    String path = "";
    public GUI(){
        frmPrin = new JFrame("File Editor");
        txtAreaFile = new JTextArea();
        mb = new JMenuBar();
        x = new JMenu("File");
        m1 = new JMenuItem("Apri");
        m1.addActionListener(new ItemFileMenuListener(this));
        m2 = new JMenuItem("Salva");
        m2.addActionListener(new ItemFileMenuListener(this));
        Container c = frmPrin.getContentPane();
        c.setLayout(new BorderLayout());
        x.add(m1);
        x.add(m2);
        mb.add(x);
        c.add(mb, BorderLayout.NORTH);
        c.add(txtAreaFile, BorderLayout.CENTER);
        Dimension dimension=new Dimension(600,400);
        frmPrin.setSize(dimension);
        frmPrin.setVisible(true);
    }
}