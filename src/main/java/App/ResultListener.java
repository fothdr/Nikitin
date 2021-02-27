package App;

import java.awt.event.*;

import javax.swing.JOptionPane;

public class ResultListener implements ActionListener {


	public void actionPerformed(ActionEvent reslt) {
		try {
			String sA = subversion.textSideA.getText().replace(",", ".");
			String sB = subversion.textSideB.getText().replace(",", ".");
			String sH = subversion.textHeight.getText().replace(",", ".");
			double valueA = Double.parseDouble(sA);
			double valueB = Double.parseDouble(sB);
			double valueH = Double.parseDouble(sH);
			if ((valueA <= 0 || valueB <=0 || valueH <= 0)) {
			JOptionPane.showMessageDialog(null, "Введите положительное число!" , "Ответ", JOptionPane.PLAIN_MESSAGE);
			
			}
			if ((((valueA + valueB) / 2) * valueH) == Double.POSITIVE_INFINITY) {
			JOptionPane.showMessageDialog(null, "Вы ввели слишком большое число!" , "Ответ", JOptionPane.PLAIN_MESSAGE);
			}
			if (!(valueA <= 0 || valueB <=0 || valueH <= 0) && !((((valueA + valueB) / 2) * valueH) == Double.POSITIVE_INFINITY)){
			JOptionPane.showMessageDialog(null, "Ответ: " + (((valueA + valueB) / 2) * valueH) , "Ответ", JOptionPane.PLAIN_MESSAGE);
			}
			}
			catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Введите число!" , "Ответ", JOptionPane.PLAIN_MESSAGE);
		}
	}
}