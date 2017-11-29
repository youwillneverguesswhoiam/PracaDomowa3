package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Controller {
    public Pane plansza;

    public void z1(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("z1.fxml"));
        try {
            Parent pane = loader.load();
            z1 cntr = loader.getController();
            cntr.setParentController(this);
            plansza.getChildren().clear();
            plansza.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void z2(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("z1.fxml"));
        try {
            Parent pane = loader.load();
            z2 cntr = loader.getController();
            cntr.setParentController(this);
            plansza.getChildren().clear();
            plansza.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void z3(ActionEvent actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("z1.fxml"));
        try {
            Parent pane = loader.load();
            z3 cntr = loader.getController();
            cntr.setParentController(this);
            plansza.getChildren().clear();
            plansza.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
