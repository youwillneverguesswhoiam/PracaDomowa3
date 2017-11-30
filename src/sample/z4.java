package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;


public class z4 {

    public TextField login;
    public TextField hasło;
    public static Text rola = z1.rola;
    public static Text log = z1.log;
    public TextArea rola1;
    public TextArea rola2;


    public z4 () {
        rola.setText(Controller.getRola().getText());

        System.out.print ("To jest uzytkownik"+Controller.getRola().getText());
    }
    private Controller parentController;
    public void initialize() {
        System.out.print ("To jest init"+Controller.getRola().getText());

        rola1.setText(Controller.getRola().getText());
        rola2.setText(log.getText());

    }
    public void zmienz4(ActionEvent actionEvent) {

        parentController.zz1(actionEvent);
    }

    public void setParentController(Controller parentController) {

        this.parentController = parentController;
    }

    public Controller getParentController() {

        return parentController;
    }
}