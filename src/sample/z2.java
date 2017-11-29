package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class z2 {
    private Controller parentController;

    public javafx.scene.control.TableView<Człowiek> tabelka;
    @FXML public TextField tI;
    @FXML public TextField tN;
    @FXML public TextField tWi;
    @FXML public TextField tWz;
    @FXML public TextField tP;

    public String [] lista = {"Imię", "Nazwisko","Wiek", "Wzrost", "Pesel"};

    @FXML public void stworz(ActionEvent actionEvent) {
        tabelka.getItems().add(new Człowiek(tI.getText(), tN.getText(), Integer.parseInt(tWi.getText()), Integer.parseInt(tWz.getText()), Integer.parseInt(tP.getText())));
    }

    public void initialize() {
        int licznik=0;

        for (javafx.scene.control.TableColumn<Człowiek, ?> column : tabelka.getColumns()) {
            javafx.scene.control.TableColumn<Człowiek, String> textColumn = (javafx.scene.control.TableColumn<Człowiek, String>) column;
            if (licznik <5) {
                textColumn.setCellValueFactory(new PropertyValueFactory<>(lista[licznik]));
                licznik++;
            }
            else
                textColumn.setCellValueFactory(new PropertyValueFactory<>(lista[4]));

        }
    }


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