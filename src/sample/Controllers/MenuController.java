package sample.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import sample.Complements.Mssql;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import sample.Main;
public class MenuController implements Initializable {
    @FXML
    Button PayBTN,transferBTN,ActivityBTN,debtsBTN,outBTN,abonarBTN;
    @FXML Label balance;
    Main m = new Main();
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        PayBTN.setOnAction(event -> {
            PayServiceController payServiceController = new PayServiceController();
            m.abrirEscena(event,"PayService.fxml",payServiceController,"hola");

        });

        transferBTN.setOnAction(event -> {
            TransferController transferController = new TransferController();
            m.abrirEscena(event,"Transfer.fxml",transferController,"Transfer");

        });
        ActivityBTN.setOnAction(event -> {
            ActividadController actividadController = new ActividadController();
            m.abrirEscena(event,"Actividad.fxml",actividadController,"actividad");

        });

        abonarBTN.setOnAction(event -> {
            GiftCardController giftCardController = new GiftCardController();
            m.abrirEscena(event,"GiftCard.fxml",giftCardController,"hola");

        });
        outBTN.setOnAction(event -> {
            m.primaryStage.show();
            ((Stage) (((Button) event.getSource()).getScene().getWindow())).hide();

        });
    }
}





/*  Stage servicioStage=new Stage();
    servicioStage.setTitle("Servicio");
    FXMLLoader loader = new FXMLLoader(getClass().getResource("/sample/sample.FXML/Servicio.fxml"));
    ServicioController servicioController = new ServicioController(); */
