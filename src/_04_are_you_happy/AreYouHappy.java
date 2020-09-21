package _04_are_you_happy;

import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {

		String question = JOptionPane.showInputDialog("Are you happy?");

		if (question.equalsIgnoreCase("no")){

			String q2 = JOptionPane.showInputDialog("Do you want to be happy?");
			if(q2.equalsIgnoreCase("no")) {
				JOptionPane.showMessageDialog(null, "Keep doing What you are doing.");
			}
			else if(q2.equalsIgnoreCase("yes"))	{
				JOptionPane.showMessageDialog(null, "Change something.");
			}

		}
		else if (question.equalsIgnoreCase("yes"))
			JOptionPane.showMessageDialog(null, "Keep doing what you are doing.");
	}
}