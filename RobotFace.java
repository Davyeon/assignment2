package week2;

/*This program is my Robot Face*/

import java.awt.Color;
import java.awt.color.*;
import acm.program.*;
import acm.graphics.*;

public class RobotFace extends GraphicsProgram {
	

	/* This is where I'll put the sizes for the robot's face*/
	private static final int HEAD_HEIGHT = 320;
	private static final int HEAD_WIDTH = 200;
	private static final int MOUTH_HEIGHT = 40;
	private static final int MOUTH_WIDTH = 130;
	private static final int EYE_RADIUS = 35;
	
	public void run() {
		makeHead();
		makeLeftEye();
		makeRightEye();
		makeMouth();
		
		}
	
	/*this is where the robot's head will be introduced*/
	private void makeHead() {
		double startingWidth = ((getWidth()/2) - (HEAD_WIDTH/2));
        double startingHeight = ((getHeight()/2) - (HEAD_HEIGHT/2));
        GRect rect1 = new GRect(startingWidth, startingHeight, HEAD_WIDTH, HEAD_HEIGHT);
		
        /*this is where the head gets its color*/
        rect1.setFilled(true);
        rect1.setFillColor(Color.GRAY);
		add(rect1);
	}
	
	/*this is where we add the LEFT eye*/
	private void makeLeftEye() {
		double startingWidth = getWidth()/2 - HEAD_WIDTH/4 - EYE_RADIUS/2;
        double startingHeight = getHeight()/2 - HEAD_HEIGHT/4 - EYE_RADIUS/2;
		GOval circle1 = new GOval(startingWidth, startingHeight, EYE_RADIUS, EYE_RADIUS);
		
		/*this is where the LEFT eye gets its color*/
		circle1.setColor(Color.YELLOW);
		circle1.setFilled(true);
		circle1.setFillColor(Color.YELLOW);
		add(circle1);
	}
	
	/*this is where we add the RIGHT eye*/
	private void makeRightEye() {
		double startingWidth = getWidth()/2 + HEAD_WIDTH/4 - EYE_RADIUS/2;
        double startingHeight = getHeight()/2 - HEAD_HEIGHT/4 - EYE_RADIUS/2;
		GOval circle2 = new GOval(startingWidth, startingHeight, EYE_RADIUS, EYE_RADIUS);
		
		/*this is where the RIGHT eye gets its color*/
		circle2.setColor(Color.YELLOW);
		circle2.setFilled(true);
		circle2.setFillColor(Color.YELLOW);
		add(circle2);
	}
	
	/*This is my process for making the mouth*/
	private void makeMouth() {
		double startingWidth = ((getWidth()/2) - (MOUTH_WIDTH/2));
        double startingHeight = ((getHeight()/2) + (MOUTH_HEIGHT/4));
        GRect rect2 = new GRect(startingWidth, startingHeight, MOUTH_WIDTH, MOUTH_HEIGHT);
		
        /* This is where the mouth will get it's color*/
        rect2.setColor(Color.WHITE);
        rect2.setFilled(true);
        rect2.setFillColor(Color.white);
		add(rect2);
	}
}