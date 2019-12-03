package _04_are_you_happy;

import javax.swing.JOptionPane;

public class are_you_happy {
public static void main(String[] args) {
	
int happy = JOptionPane.showConfirmDialog(null, "are you happy?");
System.out.println(happy);
if (happy == 0){
	
	JOptionPane.showMessageDialog(null, "keep doinng what you're doing");
	
}
else {
	
	happy = JOptionPane.showConfirmDialog(null, "do you want to be happy?");
	System.out.println();
	if(happy == 0) {
		
		JOptionPane.showMessageDialog(null, "try not being sad");
		
	}
	else {
		
		JOptionPane.showMessageDialog(null, "keep doing what you're doing");
		
	}
}

}
}

