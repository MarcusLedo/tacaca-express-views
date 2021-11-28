package gui;

import java.net.URL;
import java.text.ParseException;
import java.util.ResourceBundle;

import entities.BusinessUnity;
import entities.Unity;
import gui.util.Constraints;
import gui.util.Utils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import services.UnityService;

public class UnityFormController implements Initializable{
	
	
	private Unity entity;
	
	private UnityService service;
	
	@FXML
	private TextField txtId;
	
	@FXML
	private TextField txtName;
	
	@FXML
	private Button btSave;
	
	@FXML
	private Button btCancel;
	
	@FXML
	public void onBtSaveAction() throws ParseException {
		entity = getFormData();
		//service.getList().add(new BusinessUnity(22, "aaaaaaaa"));
		System.out.println("aqui");
		service.saveOrUpdate(new BusinessUnity(22, "aaaaaaaa"));
	}
	
	@FXML
	public void onBtCancelAction() {
		System.out.println("Cancel");
	}
	
	
	public void setUnity(Unity entity) {
		this.entity = entity;
	}
	
	public void setUnityService(UnityService service) {
		this.service = service;
	}
	
	private Unity getFormData() {
		Unity obj = new BusinessUnity();
		
		obj.setBranch(Utils.tryParseToInt(txtId.getText()));
		obj.setName(txtName.getText());
		
		
		return obj;
	}
	

	@Override
	public void initialize(URL url, ResourceBundle rb) {		
		initializeNodes();
	}
	
	private void initializeNodes() {
		Constraints.setTextFieldInteger(txtId);
	}
	
	public void updateFormData() {
		txtId.setText(String.valueOf(entity.getBranch()));
		txtName.setText(entity.getName());
	}

}
