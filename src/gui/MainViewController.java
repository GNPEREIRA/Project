package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemAdvogados;
	
	@FXML
	private MenuItem menuItemSalas;
	
	@FXML
	private MenuItem menuItemSobre;
	
	//EventsHandlers
	@FXML
	public void onMenuItemAdvogadosAction() {
		System.out.println("Clicou advogados");
	}
	
	@FXML
	public void onMenuItemSalasAction() {
		System.out.println("Clicou salas");
	}
	
	@FXML
	public void onMenuItemSobreAction() {
		System.out.println("Clicou Sobre");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		
	}

}
