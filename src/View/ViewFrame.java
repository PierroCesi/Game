package View;

import java.awt.Color;

import javax.swing.JFrame;

import Controller.ControllerListener;

public class ViewFrame extends JFrame {

	public static int height=600;
	public static int width=1000;
	
	public ViewFrame() {
		this.setVisible(true);
		this.setSize(width, height);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setBackground(Color.black);
		
	}
	
	public void addKeyboardListener(ControllerListener controllerListener) {
		
		this.addKeyListener(controllerListener);
	}
	
}
