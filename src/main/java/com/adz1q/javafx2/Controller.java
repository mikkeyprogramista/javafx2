package com.adz1q.javafx2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private Hyperlink link;

    @FXML
    private Button btnClick;

    @FXML
    private Label lblInfo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnClick.setOnAction(e -> lblInfo.setText("Clicked!"));
        btnClick.setOnMouseExited(e -> lblInfo.setText("Unhovered!"));
        link.setOnAction(e -> {
            try {
                Desktop.getDesktop().browse(new URI("http://youtube.com"));
            } catch (IOException | URISyntaxException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
}
