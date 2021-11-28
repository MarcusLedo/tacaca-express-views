package gui;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import entities.BusinessUnity;
import entities.Employee;
import entities.Unity;
import gui.util.Alerts;
import gui.util.Utils;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import services.EmployeeService;
import services.UnityService;

public class EmployeeListController implements Initializable{
	
	
	private EmployeeService service;
	
	@FXML
	private TableView<Employee> tableViewEmployee;
	
	@FXML
	private TableColumn<Employee, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Employee, String> tableColumnName;
	
	@FXML
	private Button btNew;
	
	private ObservableList<Employee> obsList;
	
	
	public void setEmployeeService(EmployeeService service) {
		this.service = service;
	}
	
	@FXML
	public void onBtNewAction(ActionEvent event) {
		Stage parentStage = Utils.currentStage(event);
		Unity obj = new BusinessUnity();
		createDialogForm(obj, "/gui/UnityForm.fxml", parentStage);
	}
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {		
		initializeNodes();
	}


	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("employeeId"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));
		
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewEmployee.prefHeightProperty().bind(stage.heightProperty());
	}
	
	public void updateTableView() throws ParseException {
		List<Employee> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewEmployee.setItems(obsList);
	}
	
	private void createDialogForm(Unity obj, String absoluteName, Stage parentStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			Pane pane = loader.load();
			
			UnityFormController controller = loader.getController();
			controller.setUnity(obj);
			controller.setUnityService(new UnityService());
			//controller.subscribeDataChangeListener(this);
			controller.updateFormData();
			
			Stage dialogStage = new Stage();
			dialogStage.setTitle("Enter Department data");
			dialogStage.setScene(new Scene(pane));
			dialogStage.setResizable(false);
			dialogStage.initOwner(parentStage);
			dialogStage.initModality(Modality.WINDOW_MODAL);
			dialogStage.showAndWait();
		} catch (IOException e) {
			e.printStackTrace();
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}

}
