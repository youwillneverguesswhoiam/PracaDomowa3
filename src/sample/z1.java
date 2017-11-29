package sample;

import javafx.event.ActionEvent;

public class z1 {
    private Controller parentController;
    public void zmienz1(ActionEvent actionEvent) {
        parentController.zz2(actionEvent);
    }
    public void setParentController(Controller parentController) {
        this.parentController = parentController;
    }
    public Controller getParentController() {
        return parentController;
    }
}
