package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {

	public void run() {
//		1. Have a robot start on the left side of the window near the bottom. 
// 
//		2. Draw a flat-topped house of height 100 with grass after it (see picture). 
//
//		3. Extract the piece of code that draws the house into a method. Draw 10 houses. 
//
//		4. Change the method to take (int height) as a parameter. Draw 9 houses of different heights 
//
//		5. Make the method take a String instead of an int. 
//
//		        “small”                 60 
//
//		        “medium”             120 
//
//		        “large”                 250 
//
//		6. Make the method take a color as well as a height. The houses are drawn in that color. 
//
//		[optional] Set the scene to night by setting the background to black 
//
//		7. Give the houses peaked roofs 
//
//		8. Extract that roof code into a method “drawPointyRoof” and create a new method: “drawFlatRoof”. 
//
//		9. Make large houses have flat roofs 
		
		byte x = 4;
		System.out.println(x);
		Robot ajax = new Robot("batman");
		
		ajax.setWindowColor(Color.black);
		ajax.setX(25);
		ajax.setY(500);
//		/*1*/ drawHouse(ajax, 100, Color.blue);
//		/*2*/drawHouseWithPointyRoof(ajax, 200, Color.pink);
//		/*3*/ drawHouse(ajax, 150, Color.cyan);
//		/*4*/ drawHouse(ajax, 125, Color.gray);
//		/*5*/drawHouseWithPointyRoof(ajax, 175, Color.darkGray);
//		/*6*/ drawHouse(ajax, 145, Color.yellow);
//		/*7*/ drawHouse(ajax, 134, Color.magenta);
//		/*8*/ drawHouseWithPointyRoof(ajax, 156, Color.lightGray);
//		/*9*/ drawHouseWithPointyRoof(ajax, 143, Color.blue);
		/*1*/ drawHouseS(ajax, "small", Color.blue);
		/*2*/drawHouseWithPointyRoofS(ajax, "medium", Color.pink);
		/*3*/ drawHouseS(ajax, "large", Color.cyan);
		/*4*/ drawHouseS(ajax, "small", Color.gray);
		/*5*/drawHouseWithPointyRoofS(ajax, "small", Color.darkGray);
		/*6*/ drawHouseS(ajax, "medium", Color.yellow);
		/*7*/ drawHouseS(ajax, "large", Color.magenta);
		/*8*/ drawHouseWithPointyRoofS(ajax, "large", Color.lightGray);
		/*9*/ drawHouseWithPointyRoofS(ajax, "small", Color.blue);

	}
	private static void drawHouse(Robot ajax, int height, Color color)	{
		ajax.setSpeed(15);
		ajax.penDown();
		ajax.setPenColor(color);
		ajax.move(height);
		ajax.turn(90);
		ajax.move(50);
		ajax.turn(90);
		ajax.move(height);
		ajax.turn(-90);
		ajax.setPenColor(Color.green);
		ajax.move(50);
		ajax.turn(-90);
	}
	private static void drawHouseWithPointyRoof(Robot ajax, int height, Color color)	{
		ajax.setSpeed(15);
		ajax.penDown();
		ajax.setPenColor(color);
		ajax.move(height);
		drawPointyRoof(ajax);
		ajax.move(height);
		ajax.turn(-90);
		ajax.setPenColor(Color.green);
		ajax.move(50);
		ajax.turn(-90);
	}
	private static void drawHouseS(Robot ajax, String heightS, Color color)	{
		int height;
		if(heightS.equalsIgnoreCase("small"))	{
			height = 90;
		}
		if(heightS.equalsIgnoreCase("medium")) {
			height = 140;
		}
		if(heightS.equalsIgnoreCase("large")) {
			height = 190;
		}
		else {
			height = 100;
		}
		ajax.setSpeed(15);
		ajax.penDown();
		ajax.setPenColor(color);
		ajax.move(height);
		ajax.turn(90);
		ajax.move(50);
		ajax.turn(90);
		ajax.move(height);
		ajax.turn(-90);
		ajax.setPenColor(Color.green);
		ajax.move(50);
		ajax.turn(-90);
	}
	private static void drawHouseWithPointyRoofS(Robot ajax, String heightS, Color color)	{
		int height;
		if(heightS.equalsIgnoreCase("small"))	{
			height = 90;
		}
		if(heightS.equalsIgnoreCase("medium")) {
			height = 140;
		}
		if(heightS.equalsIgnoreCase("large")) {
			height = 190;
		}
		else {
			height = 100;
		}
		ajax.setSpeed(15);
		ajax.penDown();
		ajax.setPenColor(color);
		ajax.move(height);
		drawPointyRoof(ajax);
		ajax.move(height);
		ajax.turn(-90);
		ajax.setPenColor(Color.green);
		ajax.move(50);
		ajax.turn(-90);
	}
	private static void drawPointyRoof(Robot ajax)	{
		ajax.turn(45);
		ajax.move(50);
		ajax.turn(90);
		ajax.move(50);
		ajax.turn(45);
	}
	
}
