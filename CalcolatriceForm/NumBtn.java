import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class NumBtn implements ActionListener{
    Calcolatrice c;
    int numero;
    public NumBtn(Calcolatrice c, int numero){
        this.c=c;
        this.numero=numero;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        c.num.setText(c.num.getText() + numero);
    }
}
