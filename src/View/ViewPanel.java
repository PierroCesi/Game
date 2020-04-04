package View;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

//public static int height=600;
//public static int width=1000;

public class ViewPanel extends JPanel {

	private int playerX = 450;
	private int playerY = 400;
	
	private ViewFrame frame;
	private Graphics g;
	
	public ViewPanel(ViewFrame frame) {
		this.frame = frame;
		frame.setContentPane(this);
	}
	
	public void paintComponent(Graphics g) {
		setG(g);
		super.paintComponents(g);	
		drawRect(g);
		drawBase(g);
		
		frame.repaint();
	}
	
	public void drawBase(Graphics g) {
		g.setColor(Color.white);	
		g.fillRect(0, 500, 1000, 10);
	}
	
	public void drawRect(Graphics g){
		g.setColor(Color.white);	
		g.fillRect(playerX, playerY, 50, 50);
	}
	
/*---------------------------------------------*/
	
	public void setPlayerX(int playerX) {
		this.playerX = playerX;
	}

	public void setPlayerY(int playerY) {
		this.playerY = playerY;
	}
	
	public ViewFrame getFrame() {
		return this.frame;
	}

	public Graphics getG() {
		return g;
	}

	public void setG(Graphics g) {
		this.g = g;
	}
	
	
	
}
