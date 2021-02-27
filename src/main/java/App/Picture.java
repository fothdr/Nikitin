package App;

import javax.imageio.*;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.*;


public class Picture extends JComponent {
    //BufferedImage picture;
    ImageIcon picture;
    {
      //  try {
        	picture = new ImageIcon(App.subversion.class.getResource("/Logo.jpg"));
           // picture = ImageIO.read(new File("src/main/resources/Logo.jpg"));
// new File(getClass().getResource("src\\main\\resources\\Logo.jpg"))); //("src/main/resources/Logo.jpg"));
      /*  } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
    }
