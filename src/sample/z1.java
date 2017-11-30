package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;

public class z1 {

    public TextField login;
    public TextField hasło;
    public static Text rola = new Text();
    public static Text log = new Text();

    private Controller parentController;
    public void zmienz1(ActionEvent actionEvent) {


        parentController.zz4(actionEvent);

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


        final String h = "haslo";
        System.out.println("działa");
        String dupa = login.getText();
        String dupa1 = hasło.getText();
        System.out.println(dupa + "abc");
        if(l.equals(dupa) && h.equals(dupa1)) {
            rola.setText("użytkownik");
            z4.rola.setText("użytkownik");
            z4.log.setText(login.getText());
            Controller.setRola(rola);
            log.setText(login.getText());
            System.out.println(rola.getText());
        }
        parentController.zz4(actionEvent);

    }
}





