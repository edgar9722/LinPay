package sample.Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import sample.Complements.Mssql;
import sample.DAOS.LoginDAO;
import sun.rmi.log.LogOutputStream;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
  static  Mssql mssql = new Mssql();
  static  LoginDAO loginDAO = new LoginDAO();
    @FXML
    JFXTextField username;
    @FXML
    JFXPasswordField password;
    @FXML
    JFXButton loginBTN;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mssql.Connect("SA","<Barong58>");
        loginBTN.setOnAction(event -> {
            validar(username.getText(),password.getText());
        });
    }
    public static void validar(String username , String password){
        loginDAO.loginV();

    }


}
