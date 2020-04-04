package Controller;

import Model.Model;
import View.ViewFrame;
import View.ViewPanel;

public class Controller {

	private ViewFrame frame;
	private ViewPanel panel;
	private Model model;
	
	public Controller(ViewFrame frame, ViewPanel panel, Model model) {
		
		this.panel = panel;
		this.frame = frame;
		this.model = model;
		
		this.frame.addKeyboardListener(new ControllerListener(panel, model));

	}

	
}
