package App;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ChangeComboBoxListener implements ActionListener {
	int[] numbers;
    static boolean isArray = false;
    public void actionPerformed(ActionEvent e) {
    	int i = subversion.changeBox.getSelectedIndex();
    	if (PictureListener.isCreated) {
        switch (i){
            case 0:{
                PictureListener.picLabel.setBounds(250,-10,100,150);
                break;
            }
            case 1:{
                PictureListener.picLabel.setBounds(150,-10,100,150);
                break;
            }
            case 2:{
                PictureListener.picLabel.setBounds(40,-10,100,150);
                break;
            }
            
        }
    }
    	switch (i) {
    	case 3:{
	    	ArrayMaker arrayMaker = new ArrayMaker();
	    	numbers = arrayMaker.getArray();
	    	String messageNumbers = "";
	    	for(int n: numbers) {
	    		messageNumbers += Integer.toString(n) + "\n";
	    	}
	    	JOptionPane.showMessageDialog(null, messageNumbers , "Массив", JOptionPane.PLAIN_MESSAGE);
	    	isArray = true;
	    	break;
    	}
    	case 4:{
	    	if(isArray) {
	    		SortArray sortArray = new SortArray();
				numbers = sortArray.sortArray(numbers);
				String messageNumbers = "";
				for(int n: numbers) {
	        		messageNumbers += Integer.toString(n) + "\n";
	        	}
	        	JOptionPane.showMessageDialog(null, messageNumbers , "Отсортированный массив", JOptionPane.PLAIN_MESSAGE);
    	}
    	break;
    }
    }}
}