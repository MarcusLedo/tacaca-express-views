package gui;

import java.net.URL;
import java.text.ParseException;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import entities.Unity;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import services.UnityService;

public class UnityListController implements Initializable{
	
	
	private UnityService service;
	
	@FXML
	private TableView<Unity> tableViewUnity;
	
	@FXML
	private TableColumn<Unity, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Unity, String> tableColumnName;
	
	@FXML
	private Button btNew;
	
	private ObservableList<Unity> obsList;
	
	
	public void setUnityService(UnityService service) {
		this.service = service;
	}
	
	@FXML
	public void onBtNewAction() {
		System.out.println("Button");
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		initializeNodes();
	}


	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("branch"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewUnity.prefHeightProperty().bind(stage.heightProperty());
	}
	
	public void updateTableView() throws ParseException {
		List<Unity> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewUnity.setItems(obsList);
	}

}
