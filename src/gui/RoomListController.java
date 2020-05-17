package gui;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Rooms;

public class RoomListController implements Initializable{

	@FXML
	private Button btNew;
	
	@FXML
	private TableView<Rooms> tableViewRoom;
	
	@FXML
	private TableColumn<Rooms, Integer> tableColumnId;
	
	@FXML
	private TableColumn<Rooms, String> tableColumnName;
	
	@FXML
	public void onBtNewAction() {
		System.out.println("bynovo");
	}
	
	@FXML
	public void onTableViewRoomAction() {
		System.out.println("tableview");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {

		initializeNodes();
		
	}

	//inicializa o comportamento da tabela
	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("idRooom"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("roomName"));
		
		//Faz a tableView acompanhar a altura da janela
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewRoom.prefHeightProperty().bind(stage.heightProperty());
	}

}
