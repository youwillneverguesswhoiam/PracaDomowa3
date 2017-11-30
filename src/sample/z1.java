package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.awt.*;

public class z1 {

    public TextField login;
    public TextField hasło;

    private Controller parentController;
    public void zmienz1(ActionEvent actionEvent) {

<<<<<<< HEAD
        parentController.zz4(actionEvent);
=======
        parentController.zz3(actionEvent);
>>>>>>> 55508856e64f045121677c58d4f3a705ff42c460
    }
    public void setParentController(Controller parentController) {

        this.parentController = parentController;
    }
    public Controller getParentController() {

        return parentController;
    }
    public void zaloguj(ActionEvent actionEvent) {

        final String l = "login";
<<<<<<< HEAD

        final String h = "haslo";
        System.out.println("działa");
        String dupa = login.getText();
        String dupa1 = hasło.getText();
        System.out.println(dupa + "abc");
        if(l.equals(dupa) && h.equals(dupa1)) {
            System.out.println("działaPiotrMistrz");
        }
        parentController.zz4(actionEvent);

    }
}
=======
        System.out.println(login.getText() + "abc");
        final String h = "hasło";
        System.out.println("działa");

        if(l == login.getText() && h == hasło.getText()) {
            System.out.println("działa");
        }

    }
}
>>>>>>> 55508856e64f045121677c58d4f3a705ff42c460
