package _05_horoscope;

import javax.swing.JOptionPane;

public class horoscope {
	public static void main(String[] args) {
		String horoscope=JOptionPane.showInputDialog(null, "what is your horoscope?");
		
		if(horoscope.equalsIgnoreCase("aries")) {
			
			JOptionPane.showMessageDialog(null, "next sunday you will find two dimes and a penny");
			
		}
		
		if(horoscope.equalsIgnoreCase("taurus")) {
			
			JOptionPane.showMessageDialog(null, "you will eat some avacadoe toast on tuesday");
			
		}
		
		if(horoscope.equalsIgnoreCase("gemini")) {
			
			JOptionPane.showMessageDialog(null, "you will fight a basalisk next friday at four twenty-seven PM");
			
		}
		
		if(horoscope.equalsIgnoreCase("cancer")) {
			
			JOptionPane.showMessageDialog(null, "coincodentally you will eat some crab");
			
		}
		
		if(horoscope.equalsIgnoreCase("leo")) {
			
			JOptionPane.showMessageDialog(null, "you will purposfully step on a catterpillar");
			
		}
		
		if(horoscope.equalsIgnoreCase("virgo")) {
			
			JOptionPane.showMessageDialog(null, "you will accidentally step on a catterpillar");
			
		}
		
		if(horoscope.equalsIgnoreCase("capricorn")) {
			
			JOptionPane.showMessageDialog(null, "next thursday you will break something detremental to the survival of man");
			
		}
		
	}

}
