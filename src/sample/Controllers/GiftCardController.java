package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class GiftCardController implements Initializable {
    @FXML
    Button backBTN;
    Main m=new Main();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        backBTN.setOnAction(event -> {
            m.primaryStage.show();
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).hide();
        });
    }
}
