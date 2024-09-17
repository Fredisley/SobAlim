package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ListClass;
import model.Territorio;

public class TerritorioFormEditController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textNombre;

    @FXML
    private TextField textPoblación;

    @FXML
    private TextField textExtension;

    @FXML
    private TextField textTierras;
    
    private ListClass repositorio;
    
    private Territorio territorio;

    @FXML
    void aceptar(ActionEvent event) {

    }
    
    public void initAttributes(ListClass repositorio, Territorio territorio){
        this.repositorio = repositorio;
        this.territorio = territorio;
        this.textNombre.setText(territorio.getNombre());
        this.textPoblación.setText(Integer.toString(territorio.getPoblacion()));
        this.textExtension.setText(Double.toString(territorio.getExtencionGeografica()));
        this.textTierras.setText(Double.toString(territorio.getTierrasProductivas()));
    }

    @FXML
    void cancelar(ActionEvent event) {
        Stage currentStage = (Stage) textNombre.getScene().getWindow();
        currentStage.close();
    }

    @FXML
    public void initialize() {
        

    }
}

