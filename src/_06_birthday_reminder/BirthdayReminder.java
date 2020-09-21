
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "september 2nd";
		String dadsBirthday = "June 9th";
		String myBirthday = "June 20th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String bday = JOptionPane.showInputDialog("What is your name?");
		// 3. Print out what the user typed
		System.out.println("3"+5);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(bday.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, bday+", your birthday is "+momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(bday.equalsIgnoreCase("dad")) {
			JOptionPane.showMessageDialog(null, bday+", your birthday is "+dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(bday.equalsIgnoreCase("carlos")) {
			JOptionPane.showMessageDialog(null, bday+", your birthday is "+myBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, bday+" I'm sorry. I don't remember your birhtday.");
		}
	} 
}
