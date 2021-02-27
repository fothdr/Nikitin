package App;

import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;

import javax.swing.JOptionPane;

//import javax.swing.JOptionPane;

public class UploadListener implements ActionListener {
	public static String filePath;

	public void actionPerformed(ActionEvent arg0) {
		try {
		filePath = JOptionPane.showInputDialog("¬ведите путь до текстового файла:");
		} catch (NullPointerException e ) {

		}
		
	}
}