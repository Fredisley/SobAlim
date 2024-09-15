package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;

public class VentanaInicioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ProgressBar barraProgreso;

    @FXML
    public void initialize() {
        assert barraProgreso != null : "fx:id=\"barraProgreso\" was not injected: check your FXML file 'FXMLDocument.fxml'.";

    }
}

