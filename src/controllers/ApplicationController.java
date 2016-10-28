package controllers;

public class ApplicationController {
	
	static ApplicationController controller;
	
	private ApplicationController() {}
	
	public static ApplicationController getInstance() {
		
		if (controller == null) controller = new ApplicationController();
		return controller;
		
	}
	
	public void loadSavedData() {
		
	}
	
	public void createPool() {
		
	}
	
	public void mutatePool() {
		
	}
	
	public void savePool() {
		
	}

}
