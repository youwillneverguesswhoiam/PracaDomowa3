package sample;

import javafx.event.ActionEvent;

public class z2 {
    private Controller parentController;
    public void zmienz2(ActionEvent actionEvent) {
        parentController.zz1(actionEvent);
    }
    public void setParentController(Controller parentController) {
        this.parentController = parentController;
    }
    public Controller getParentController() {
        return parentController;
    }
}
