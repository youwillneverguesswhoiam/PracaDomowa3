package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;



public class z4 {

    public TextField login;
    public TextField hasło;

    private Controller parentController;

    public void zmienz4(ActionEvent actionEvent) {

        parentController.zz3(actionEvent);
    }

    public void setParentController(Controller parentController) {

        this.parentController = parentController;
    }

    public Controller getParentController() {

        return parentController;
    }
}