//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot hal = new Robot();
		// 3. Ask the user what color they would like the robot to draw
		hal.setX(650);
		hal.setY(350);
		for (int i1 = 0; 1 < 5; i1++) {
			String color = JOptionPane.showInputDialog(null, "What color would you like?");
			// 5. Use an if/else statement to set the pen color that the user requested

			if(color.equalsIgnoreCase("green")) {
				hal.setPenColor(Color.green);
			}
			else if(color.equalsIgnoreCase("blue")) {
				hal.setPenColor(Color.blue);
			}
			else if(color.equalsIgnoreCase("yellow")) {
				hal.setPenColor(Color.yellow);
			}
			else if(color.equalsIgnoreCase("red")){
				hal.setPenColor(Color.red);
			}
			else{
				hal.setRandomPenColor();
			}

			hal.penDown();
			hal.setPenWidth(10);

			hal.hide();
			hal.penDown();
			hal.setSpeed(100);
			int sides = 5;
			int angle = 360 / sides;
				hal.move(i1);
				hal.turn(angle);
				hal.turn(1);

				// 6. If the user doesn’t enter anything, choose a random color
			}
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

			// 2. Make the robot draw a shape (this will take more than one line of code)

		}
	}

