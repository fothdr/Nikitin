package App;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class ListenerInfo implements ActionListener {

	
	public void actionPerformed(ActionEvent arg0) {
		if (UploadListener.filePath == null) {
			JOptionPane.showMessageDialog(null, subversion.ourinfo, "Информация", JOptionPane.PLAIN_MESSAGE);
		} else {
		try {
			//InputStream input = getClass().getResourceAsStream(filePath);
			//BufferedReader reader = new BufferedReader(new InputStreamReader(input, "Cp1251"));
			BufferedReader reader = new BufferedReader(new FileReader(UploadListener.filePath));
			String line;
			subversion.ourinfo = "";
			while ((line = reader.readLine()) != null) {
				subversion.ourinfo += line;
			}
			reader.close();
			JOptionPane.showMessageDialog(null, subversion.ourinfo, "Информация", JOptionPane.PLAIN_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Файл не найден!" , "Ответ", JOptionPane.PLAIN_MESSAGE);

		} catch (NullPointerException e ) {
			
        }
		}
		
		
		
	}

	
}
