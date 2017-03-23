package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import sample.models.Car;
import sample.models.Property;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    private TextField ammountEdit;
    @FXML
    private TextArea propertyDescription;
    @FXML
    private ListView productsView;

    private int clickNumber;
    private ObservableList<Property> items = FXCollections.observableArrayList();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (int i = 0; i < 50; i++) {
            items.add(new Car(123.0f, 123.0f, "qwe", "qwe", 123123.9f, Car.Privod.BACK));
        }
        productsView.setItems(items);
    }

    @FXML
    private void onBuyButtonClicked(MouseEvent mouseEvent) {
        items.remove(clickNumber);
        clickNumber++;
    }

    @FXML
    private void onOrderButtonClicked(MouseEvent mouseEvent) {

    }
}