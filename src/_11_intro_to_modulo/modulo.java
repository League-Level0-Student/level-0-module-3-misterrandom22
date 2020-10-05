package _11_intro_to_modulo;

import java.util.Random;

public class modulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1; i<=1000; i++) {
			// do some code
			if (i % 20 == 0){
				System.out.println(i);
			}
		}

		int number = new Random().nextInt(100);
		if (number % 2 == 0) {
			System.out.println("number is even");
		}
		else {
			System.out.println("number is odd");
		}


	}

}
