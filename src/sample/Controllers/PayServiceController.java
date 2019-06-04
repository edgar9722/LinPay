package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.Main;

import javax.swing.text.TabableView;
import javax.swing.text.TableView;
import java.net.URL;
import java.util.ResourceBundle;

public class PayServiceController implements Initializable {
    @FXML
    TableView serviciosTV;
    @FXML
    Button pagarTF, backBTN;
    Main m=new Main();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        pagarTF.setOnAction(event -> {
            System.out.println("hola perras esta es una prueba");
        });
        backBTN.setOnAction(event -> {
            m.primaryStage.show();
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).hide();
        });
    }
}
