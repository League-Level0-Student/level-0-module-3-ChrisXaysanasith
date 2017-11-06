
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.AWTException;
import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) throws AWTException {

		//3. ask the user what color they would like the robot to draw
Robot chris = new Robot();		
chris.penDown();
chris.setPenWidth(10);
chris.setSpeed(100);
String state = JOptionPane.showInputDialog("what color would you like the robot to draw");
for (int i = 0; i <5; i++) {
	
	chris.move(90);
	chris.turn(90);	
	if(state.equalsIgnoreCase("Red")) {
chris.setPenColor(Color.RED);
	}
	if(state.equalsIgnoreCase("Pink")) {
chris.setPenColor(Color.PINK);
	}
	if(state.equalsIgnoreCase("Black")) {
chris.setPenColor(Color.BLACK);
	

} else {
	chris.setRandomPenColor();
}


		//4. use an if/else statement to set the pen color that the user requested
        //5. if the user doesn’t enter anything, choose a random color

        //6. put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//2. set the pen width to 10
		
	    //1. make the robot draw a shape (this will take more than one line of code)


	}
}
}
