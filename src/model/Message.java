package model;

import javafx.scene.control.Alert;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public final class Message{

    public static void information(String title,String message){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        //ImageView icon = new ImageView("");
        //.setFitHeight(32);
        //icon.setFitWidth(32);
        //alert.setGraphic(icon);
        alert.setHeaderText(null);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void error(String title, String message){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        //ImageView icon = new ImageView("");
        //icon.setFitHeight(32);
        //icon.setFitWidth(32);
        //alert.setGraphic(icon);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText(message);
        alert.showAndWait();
    }

    public static void warning(String title, String message){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        //ImageView icon = new ImageView(image);
        //icon.setFitHeight(32);
        //icon.setFitWidth(32);
        //alert.setGraphic(icon);
        alert.setHeaderText(null);
        alert.setTitle("Warning");
        alert.setContentText(message);
        alert.showAndWait();
    }
}
