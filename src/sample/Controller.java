package sample;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.TabPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class Controller {
    public Pane plansza;
    public Pane plansza1;
    public void zz1(Event actionEvent) {
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
    public void zz2(Event  actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("z2.fxml"));
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
    public void zz3(Event  actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("z3.fxml"));
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
    public void zz4(Event  actionEvent) {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("z4.fxml"));
        try {
            Parent pane = loader.load();
            z4 cntr = loader.getController();
            cntr.setParentController(this);
            plansza.getChildren().clear();
            plansza.getChildren().add(pane);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
