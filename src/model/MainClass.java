
package model;

import controller.VentanaInicioController;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MainClass extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        ListClass repositorio = new ListClass();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/VentanaInicio.fxml"));
        Parent root = loader.load();
        VentanaInicioController controller = loader.getController();
        controller.initAttributtes(repositorio);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("SobAlim");
        stage.getIcons().add(new Image("/resource/image/icon.jpg"));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}

