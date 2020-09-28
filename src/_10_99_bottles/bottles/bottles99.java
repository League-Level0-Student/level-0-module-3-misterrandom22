package _10_99_bottles.bottles;

import javax.swing.JOptionPane;

public class bottles99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=10; i > 0 ; i--) {

			if (i==1) {
				JOptionPane.showMessageDialog(null, i + " bottle beer on the wall " + i + " bottle of beer. take one down pass it around "+ (i-1) +" bottles of beer on the wall");	
			}
			else {JOptionPane.showMessageDialog(null, i + " bottles of beer on the wall " + i + " bottles of beer. take one down pass it around "+ (i-1) +" bottles of beer on the wall");
			}
		}

	}
}