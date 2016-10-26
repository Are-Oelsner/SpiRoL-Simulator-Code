//Name: Are Oelsner
//My GUI code

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**Creates the GUI */
public class GUI extends JFrame implements KeyListener {
	private static int width = 600;
	private static int height = 600;

	private static JFrame frame;

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
	
}

/*	private static double xmin = -55, xmax = 55, ymin = -55, ymax = 55;
	
	public static GUI bSim = new GUI(); //may be jma

	private static BufferedImage offscreenImage, onscreenImage;
	private static Graphics2D offscreen, onscreen;


	private static long nextDraw = -1;
}
*/
