
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _09_robot_walk_of_fame;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {
		Robot hal = new Robot();
		// 1. Set the X position of the robot so that it starts on the left. 
		// You also need to show the robot to see the result of this line.
		hal.setX(100);
		hal.penDown();
		hal.setSpeed(100);
		hal.setPenColor(Color.BLACK);
		for (int q = 0 ; q < 5 ; q++) {

			// 2. Make the robot draw a star shape. Hint: 144.
			for (int i = 0 ; i < 5 ; i++) {
				// 3. Set the size of the star to 30.
				hal.move(70);
				hal.turn(144);

			}
			hal.penUp();
			hal.turn(90);
			hal.move(70);
			hal.turn(-90);
			hal.penDown();
		}
		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of stars like this:
		 * http://bit.ly/RobotWalk
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}

}
