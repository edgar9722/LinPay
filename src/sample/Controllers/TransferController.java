package sample.Controllers;

import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class TransferController implements Initializable {
    @FXML
    Button backBTN,transferBTN;
    Main m=new Main();
    @FXML
    JFXTextField cantTransTF,idUserTF;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        backBTN.setOnAction(event -> {
            m.primaryStage.show();
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).hide();
        });
        transferBTN.setOnAction(event -> {
            int iduser = Integer.parseInt(idUserTF.getText());
            double cantidad = Double.parseDouble(cantTransTF.getText());
            System.out.println(cantidad);


        });
    }
}
