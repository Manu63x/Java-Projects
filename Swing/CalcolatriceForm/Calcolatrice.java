import java.awt.*;
import javax.swing.*;
public class Calcolatrice {
    JFrame frmPrin;
    JTextField num;
    JButton add;
    JButton diff;
    JButton mol;
    JButton div;
    JButton eq;
    //num buttons
    JButton b0;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JPanel pnlNord;
    JPanel pnlCen;
    JPanel pnlEast;
    public Calcolatrice(){
        frmPrin = new JFrame("Calcolatrice");
        Container c = frmPrin.getContentPane();
        c.setLayout(new BorderLayout());
        num = new JTextField();
        add = new JButton("+");
        diff = new JButton("-");
        mol = new JButton("x");
        div = new JButton(":");
        eq = new JButton("=");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        //pnl allocation
        pnlNord = new JPanel();
        pnlCen = new JPanel();
        pnlEast = new JPanel();
        //pnl nord
        pnlNord.setLayout(new GridLayout(1,3));
        pnlNord.add(num);
        //pnl center
        pnlCen.setLayout(new GridLayout(4, 3));
        pnlCen.add(b0);
        pnlCen.add(b1);
        pnlCen.add(b2);
        pnlCen.add(b3);
        pnlCen.add(b4);
        pnlCen.add(b5);
        pnlCen.add(b6);
        pnlCen.add(b7);
        pnlCen.add(b8);
        pnlCen.add(b9);
        //pnl east
        pnlEast.setLayout(new GridLayout(4, 1));
        pnlEast.add(add);
        pnlEast.add(diff);
        pnlEast.add(mol);
        pnlEast.add(div);
        //listeners assignment
        add.addActionListener(new AscSomma(this));
        diff.addActionListener(new AscDiff(this));
        mol.addActionListener(new AscMol(this));
        div.addActionListener(new AscDiv(this));
        eq.addActionListener(new AscEq(this));
        b0.addActionListener(new NumBtn(this, 0));
        b1.addActionListener(new NumBtn(this, 1));
        b2.addActionListener(new NumBtn(this, 2));
        b3.addActionListener(new NumBtn(this, 3));
        b4.addActionListener(new NumBtn(this, 4));
        b5.addActionListener(new NumBtn(this, 5));
        b6.addActionListener(new NumBtn(this, 6));
        b7.addActionListener(new NumBtn(this, 7));
        b8.addActionListener(new NumBtn(this, 8));
        b9.addActionListener(new NumBtn(this, 9));
        c.add(pnlNord, BorderLayout.NORTH);
        c.add(pnlCen, BorderLayout.CENTER);
        c.add(pnlEast, BorderLayout.EAST);

        Dimension dimension=new Dimension(600,400);
        frmPrin.setSize(dimension);
        frmPrin.setVisible(true);
    }
}
