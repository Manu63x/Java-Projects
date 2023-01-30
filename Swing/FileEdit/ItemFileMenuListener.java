import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.nio.file.Files;
import java.io.*;
public class ItemFileMenuListener implements ActionListener {
    GUI gui;
    public ItemFileMenuListener(GUI gui){
        this.gui=gui;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Apri")){
            JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
            int returnValue = jfc.showOpenDialog( null);
            if(returnValue == JFileChooser.APPROVE_OPTION){
                File selectedFile = jfc.getSelectedFile();
                gui.path = selectedFile.toPath().toString();
                try {
                    String str = Files.readString(selectedFile.toPath());
                    gui.txtAreaFile.setText(str);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(gui.frmPrin, "Errore!", "Dialog", 0);
                }
            }
        }
        if(e.getActionCommand().equals("Salva")){
            try {
                FileWriter fw = new FileWriter(gui.path);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(gui.txtAreaFile.getText());
                bw.close();
                JOptionPane.showMessageDialog(gui.frmPrin, "File salvato con successo!", "Dialog", 1);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(gui.frmPrin, "Errore!", "Dialog", 0);
            }
        }
    }
}