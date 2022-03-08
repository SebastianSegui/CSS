package es.ideas.hojascss;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class PrimaryController {

    @FXML
    private AnchorPane pane;
    @FXML
    private Button btnHoja1;
    @FXML
    private Button btnHoja2;
    @FXML
    private Button btnHoja3;
    @FXML
    private Button btnHoja4;
    @FXML
    private Label lblTexto;

    @FXML
    private void hojaEstilos1(ActionEvent event) {
        pane.getStylesheets().clear();
        pane.getStylesheets().add("es/ideas/css/hoja1.css");
    }
    
    @FXML
    private void hojaEstilos2(ActionEvent event) {
        pane.getStylesheets().clear();
        pane.getStylesheets().add("es/ideas/css/hoja2.css");
    }

    @FXML
    private void hojaEstilos3(ActionEvent event) {
        pane.getStylesheets().clear();
        pane.getStylesheets().add("es/ideas/css/hoja3.css");
    }

    @FXML
    private void hojaEstilos4(ActionEvent event) {
        pane.getStylesheets().clear(); //Hoja por defecto sin estilo alguno
    }
}
