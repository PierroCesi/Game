package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;

import Model.Model;
import View.ViewPanel;

public class ControllerListener implements KeyListener, ActionListener {

	private Timer tm = new Timer(30, this);

	private ViewPanel panel;
	private Model model;
	
	public ControllerListener(ViewPanel panel, Model model) {
		this.panel = panel;
		this.model = model;	
		tm.start();

	}

	
	/*-----------------------------------------------------*/
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		if(arg0.getKeyChar()=='z') {
			model.setUpKey(true);
		}
		
		if(arg0.getKeyChar()=='q') {
			model.setLeftKey(true);
		}
		
		if(arg0.getKeyChar()=='s') {
			model.setDownKey(true);
		}
		
		if(arg0.getKeyChar()=='d') {
			model.setRightKey(true);
		}
		
		if(arg0.getKeyChar()==' ') {
			model.setJump(true);
		}
		
		if(arg0.getKeyChar()=='p')  {
			panel.getFrame().repaint();

		}
		System.out.println("Z : "+model.isRightKey());
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getKeyChar()=='z') {
			model.setUpKey(false);
		}
		
		if(arg0.getKeyChar()=='q') {
			model.setLeftKey(false);
		}
		
		if(arg0.getKeyChar()=='s') {
			model.setDownKey(false);
		}
		
		if(arg0.getKeyChar()=='d') {
			model.setRightKey(false);
		}
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(model.isUpKey()==true) {
			model.moveUp();
			panel.setPlayerY(model.getPlayerY());
		}
		
		if(model.isLeftKey()==true) {
			model.moveLeft();
			panel.setPlayerX(model.getPlayerX());	
		}
		
		if(model.isDownKey()==true) {
			model.moveDown();
			panel.setPlayerY(model.getPlayerY());
		}
		
		if(model.isRightKey()==true) {
			model.moveRight();
			panel.setPlayerX(model.getPlayerX());

		}
		
		
		if(model.isJump()==true && model.getJumpCount() != 0) {
			model.setJumpCount(model.getJumpCount()-1);
			model.jump();
			panel.setPlayerY(model.getPlayerY());
		} else {
			model.setJumpCount(12);
			model.setJump(false);
		}
		if(model.getPlayerY() < 449 && model.isJump() == false) {
			model.setGravityCount(model.getGravityCount()+1);
			model.gravity();
			panel.setPlayerY(model.getPlayerY());
			
		}
	}
	


}
