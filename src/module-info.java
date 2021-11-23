module tacacaExpressViews {
	requires javafx.controls;
	requires javafx.fxml;
	
	exports gui;
	opens gui to javafx.fxml;
	
	opens entities to javafx.fxml;
	//opens entities.Unity to javafx.fxml;
	
	exports entities;
    //exports sample.model;
	
	opens application to javafx.graphics, javafx.fxml;
}
