package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Rooms;
import model.services.RoomService;

public class RoomListController implements Initializable {

	private RoomService service;

	private ObservableList<Rooms> obsList;

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

	public void setRoomService(RoomService service) {
		this.service = service;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

		initializeNodes();

	}

	// inicializa o comportamento da tabela
	private void initializeNodes() {
		tableColumnId.setCellValueFactory(new PropertyValueFactory<>("idRooom"));
		tableColumnName.setCellValueFactory(new PropertyValueFactory<>("roomName"));

		// Faz a tableView acompanhar a altura da janela
		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewRoom.prefHeightProperty().bind(stage.heightProperty());
	}

	public void updateTableView() {
		if (service == null) {
			throw new IllegalStateException("Serviço está nulo");
		}
		List<Rooms> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewRoom.setItems(obsList);
	}

}
