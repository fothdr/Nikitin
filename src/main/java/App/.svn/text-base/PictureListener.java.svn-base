package App;

import javax.swing.*;
import java.awt.event.*;



public class PictureListener implements ActionListener {
    public static boolean isCreated = false;
    public static JLabel picLabel;
    
    public  void actionPerformed(ActionEvent e) {
        if (!isCreated) {
            isCreated = true;
            subversion.changeBox.setEnabled(true);
            picLabel = new JLabel(new Picture().picture);//new ImageIcon(new Picture().picture));
            picLabel.setBounds(250, -10, 100, 150);
            subversion.main_panel.add(picLabel);
            subversion.main_GUI.repaint();
        }
    }
}