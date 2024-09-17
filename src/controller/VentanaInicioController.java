package controller;

import com.sun.deploy.util.FXLoader;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressBar;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import model.CreateDatabase;
import model.ListClass;

public class VentanaInicioController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ProgressBar barraProgreso;
    
    private CreateDatabase database;
    private ListClass repositorio;

    
      
    public void initAttributtes(ListClass repositorio){
        this.repositorio = repositorio;
    }

    @FXML
    public void initialize() {
       
    
        barraProgreso.setProgress(0);
     // Usar un Task para actualizar la barra de progreso
        Task<Void> task = new Task<Void>() {
            @Override
            protected Void call() throws Exception {
                for (int i = 0; i <= 100; i++) {
                    Thread.sleep(50); // Simula el tiempo de carga
                    updateProgress(i, 100);
                }
                return null;
            }

            @Override
            protected void succeeded() {
                super.succeeded();
                Platform.runLater(() -> openNextWindow()); // Asegura que se ejecute en el hilo de la interfaz
            }
        };

        // Vincula la barra de progreso al Task
        barraProgreso.progressProperty().bind(task.progressProperty());

        // Inicia el hilo
        new Thread(task).start();
    }

    private void openNextWindow() {
        try {
            // Carga la nueva ventana
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/FXMLMainWindows.fxml"));
            Parent root = loader.load();
            MainWindowController controller = loader.getController();
            controller.initAttributtes(this.repositorio);
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.setTitle("SobAlim");
            stage.getIcons().add(new Image("/resource/image/icon.jpg"));
            stage.setResizable(false);
            stage.setScene(scene);
            stage.show();

            // Cierra la ventana actual
            Stage currentStage = (Stage) barraProgreso.getScene().getWindow();
            currentStage.close();
        } catch (IOException  e) {
            e.printStackTrace();
        }
    }    
    
}

