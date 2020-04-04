package stickman;

import Controller.Controller;
import Model.Model;
import View.ViewFrame;
import View.ViewPanel;

public class Stickmain {

	public static void main(String[] args) {
		ViewFrame frame = new ViewFrame();
		ViewPanel panel = new ViewPanel(frame);
		Model model = new Model();
		Controller controller = new Controller(frame, panel, model);
		
	}

}
