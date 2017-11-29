package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Controller {
    public Pane plansza;
    public void plansza1(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
        try {
            Parent pane = loader.load();
            Login cntr = loader.getController();
            cntr.setParentController(this);
            plansza.getChildren().clear();
            plansza.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
