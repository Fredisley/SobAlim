package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import model.ListClass;
import model.Message;


public class TerritorioFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textNombre;
    
    @FXML
    private StackPane parent;

    @FXML
    private TextField textPoblacion;

    @FXML
    private TextField textExtencion;

    @FXML
    private TextField textTierras;
    
    private ListClass repositorio;
    
    

    @FXML
    void aceptar(ActionEvent event) {
        try {
           String nombre = this.textNombre.getText();
           int poblacion =  Integer.parseInt(this.textPoblacion.getText());
           double extencion = Double.parseDouble( this.textExtencion.getText());
           double tierras = Double.parseDouble(this.textTierras.getText());
           repositorio.crearTerritorio(nombre, poblacion, extencion, tierras);
           Stage currentStage = (Stage) parent.getScene().getWindow();
           currentStage.close();
        } catch (Exception e){
                e.printStackTrace();
                Message.error("ERROR", "Error en la operacion");
             }
        }

        @FXML
        void cancelar(ActionEvent event) {
                Stage currentStage = (Stage) parent.getScene().getWindow();
                currentStage.close();
    }

    public void initAttributes(ListClass repositorio){
        this.repositorio = repositorio;
    }
    
    @FXML
    public void initialize() {
       

    }
}

