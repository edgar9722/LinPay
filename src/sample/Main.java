package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;


public class Main extends Application {

    public static Stage primaryStage;

    @Override
    public void start(Stage _primaryStage) throws Exception{
        primaryStage=_primaryStage;
        primaryStage.setWidth(400);
        primaryStage.setHeight(650);

        Parent root = FXMLLoader.load(getClass().getResource("/sample/FXML/Login.fxml"));

        Scene scene = new Scene(root, 100, 300);
        scene.getStylesheets().add("/sample/Complements/dark-theme.css");
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.setTitle("LinPay By Edgar & Juan Luis");

        primaryStage.show();


    }

    public void abrirEscena(ActionEvent event, String escena, Object controller, String titulo){
        try {
            Stage invoiceStage=new Stage();
            invoiceStage.initStyle(StageStyle.UNDECORATED);
            invoiceStage.setTitle(titulo);
            Parent root= null;
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/FXML/" +escena));
            loader.setController(controller);
            root=loader.load();
            Scene scene=new Scene(root);
            invoiceStage.setScene(scene);
            invoiceStage.show();
            ((Stage)(((Button) event.getSource()).getScene().getWindow())).hide();
        }catch (IOException e ){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
