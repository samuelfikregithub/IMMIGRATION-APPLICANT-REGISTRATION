package com.example.lst;

import javafx.scene.control.Alert;

import java.sql.Connection;
import java.sql.DriverManager;


public class Db{

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String USERNAME = "DANNY";
    private static final String PASSWORD = "0000";
    Connection connection = null;
    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    public Connection conMethod() {
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (connection != null)
                alert.setContentText("Connected successfuly");
            else
                alert.setContentText("Not Connected ");

        } catch (Exception e) {


            alert.setContentText(e.toString());
        }
        alert.showAndWait();

        return connection;
    }

}
