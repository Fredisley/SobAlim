package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.ListClass;
import model.Message;
import model.Territorio;

public class RecursosFormController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<Territorio> cbTerritorios;

    @FXML
    private TextField textTrabajadores;

    @FXML
    private TextField textViandas;

    @FXML
    private TextField textHortalizas;

    @FXML
    private TextField textGranos;

    @FXML
    private TextField textFrutales;

    private ListClass repositorio;

    @FXML
    void aceptar(ActionEvent event) {
        try {
            int territorioId = this.cbTerritorios.getValue().getId();
            int trabajadores = Integer.parseInt(this.textTrabajadores.getText());
            double viandas = Double.parseDouble(this.textViandas.getText());
            double hortalizas = Double.parseDouble(this.textHortalizas.getText());
            double frutas = Double.parseDouble(this.textFrutales.getText());
            double granos = Double.parseDouble(this.textGranos.getText());
            this.repositorio.crearRecursoAgronomo(viandas, hortalizas, frutas, granos, territorioId, trabajadores);
            Stage stage = (Stage) textFrutales.getScene().getWindow();
            stage.close();
        } catch (Exception e) {
            Message.error("ERROR", "Introdusca valores validos");
        }
    }

    @FXML
    void cancelar(ActionEvent event) {
        Stage stage = (Stage) textFrutales.getScene().getWindow();
        stage.close();
    }

    public void initAttributes(ListClass repositorio) throws Exception {
        this.repositorio = repositorio;
        this.repositorio.cargarTerritorio();
        this.cbTerritorios.setItems(this.repositorio.getTerritorios());
    }

    @FXML
    public void initialize() {

    }
}
