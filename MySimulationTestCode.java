//My Ball Class
//First attempt at OOP
//Are Oelsner

import java.awt.Color;
import java.awt.Graphics2D;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;


/** Runs Program */
public class BallSimulator {
	public static void main(String[] args) {
		if (args.length < 3) {
			System.out.print("Program requires three inputs <mass> <timestep> <gravity>");
		}
		double mass, x, y, x2, y2, vx, vy, vx2, vy2, ax, ay, t;
		mass = Double.parseDouble(args[0]);
		x = 0.0;
		y = 0.0;
		vx = 0.0;
		vy = 0.0;
		ax = 0.0;
		ay = Double.parseDouble(args[3]);


		Ball ball = new Ball(x, y, vx, vy);
	}
}



/** My Ball Class */
class Ball {
	double mass;
	double xLocation;
	double yLocation;
	double xVelocity;
	double yVelocity;
	double xDrag;
	double yDrag;
	double fGravity;
	double fWind;

	
	public Ball(double x, double y, double vx, double vy) {
		xLocation = x;
		yLocation = y;
		xVelocity = vx;
		yVelocity = vy;
	}

	public void setBallState(double Mass, double x, double y, double vx, double vy) {
		mass = Mass;
		
		xLocation = x;
		yLocation = y;
		xVelocity = vx;
		yVelocity = vy;
	}

	public void calcDrag(double d) {
		if (d < 0 || d > 1) {
			System.out.print("Drag must be between 0 and 1");
		}
		else {
			xDrag = -d * xVelocity;
			yDrag = -d * yVelocity;
		}
	}

	public void drawBall() {
		StdDraw.filledCircle(xLocation, yLocation, 2);
	}
}



/**Creates the GUI */
class GUI extends javax.swing.JFrame implements KeyListener {
	public GUI() {
		super("My Ball Simulation");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		frame.setVisible(true);
		frame.getContentPane().setBackground(Color.BLACK);
		Container content = frame.getContentPanel();
		content.setBackground(Color.BLUE);
		content.setLayout(new FlowLayout());
		content.add(new JButton("Click"));
	}
	private static int width = 600;
	private static int height = 600;
}
//	private static double xmin = -55, xmax = 55, ymin = -55, ymax = 55;
	
//	public static GUI bSim = new GUI(); //may be jma

	private static BufferedImage offscreenImage, onscreenImage;
	private static Graphics2D offscreen, onscreen;

	private static JFrame frame;

	private static long nextDraw = -1;
}



/**Simulates the Ball's movement */
class Simulator {

}



/**Calculates Physics */
class Vector {

}




