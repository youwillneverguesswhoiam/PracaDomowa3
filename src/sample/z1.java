package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.awt.*;

public class z1 {

    public TextField login;
    public TextField hasło;

    private Controller parentController;
    public void zmienz1(ActionEvent actionEvent) {

        parentController.zz3(actionEvent);
    }
    public void setParentController(Controller parentController) {

        this.parentController = parentController;
    }
    public Controller getParentController() {

        return parentController;
    }
    public void zaloguj(ActionEvent actionEvent) {

        final String l = "login";
        System.out.println(login.getText() + "abc");
        final String h = "hasło";
        System.out.println("działa");

        if(l == login.getText() && h == hasło.getText()) {
            System.out.println("działa");
        }

    }
}
