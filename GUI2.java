//Name: Are Oelsner
//My GUI code

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.awt.image.*;


/**Creates the GUI */
public class GUI2 extends JFrame {
	private static int width = 600;
	private static int height = 600;
	public static void GUI2() {
		JFrame frame = new JFrame("My Simulation");
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(width, height);
		
		
		frame.getContentPane().setBackground(Color.BLACK);
		Container content = frame.getContentPane();
		content.setBackground(Color.BLACK);
		content.setLayout(new FlowLayout());
		content.add(new JButton("Click"));
		
		frame.setVisible(true);

	//	JLabel draw = new JLabel(
	}
	public static void clear() {
        offscreen.setColor(color);
        offscreen.fillRect(0, 0, width, height);
        offscreen.setColor(penColor);
        draw();
    }

	public static void main(String[] args) {
		GUI2();
	}
}

/*	private static double xmin = -55, xmax = 55, ymin = -55, ymax = 55;
	
	public static GUI bSim = new GUI(); //may be jma

	private static BufferedImage offscreenImage, onscreenImage;
	private static Graphics2D offscreen, onscreen;


	private static long nextDraw = -1;
}
*/

