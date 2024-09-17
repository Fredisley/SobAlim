package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListCell;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ListClass;
import model.Message;
import model.Territorio;

public class TerritorioFormEditController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textNombre;

    @FXML
    private TextField textPoblacion;

    @FXML
    private TextField textExtension;

    @FXML
    private TextField textTierras;
    
    private ListClass repositorio;
    
    private Territorio territorio;

    @FXML
    void aceptar(ActionEvent event) {
           try {
           String nombre = this.textNombre.getText();
           int id = this.territorio.getId();
           int poblacion =  Integer.parseInt(this.textPoblacion.getText());
           double extencion = Double.parseDouble( this.textExtension.getText());
           double tierras = Double.parseDouble(this.textTierras.getText());
           repositorio.updateTerritorio(id, nombre, poblacion, extencion, tierras);
           Stage currentStage = (Stage) textNombre.getScene().getWindow();
           currentStage.close();
        } catch (Exception e){
                e.printStackTrace();
                Message.error("ERROR", "Error en la operacion");
             }
    }
    
    public void initAttributes(ListClass repositorio, Territorio territorio){
        this.repositorio = repositorio;
        this.territorio = territorio;
        this.textNombre.setText(territorio.getNombre());
        this.textPoblacion.setText(Integer.toString(territorio.getPoblacion()));
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

