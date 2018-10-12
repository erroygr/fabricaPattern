package sample;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import model.Shape;
import model.ShapeFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Controller {

    @FXML
    public TextField value1;
    @FXML
    public Canvas can;

    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("[0-5]");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public void addPikcher() {
        GraphicsContext gr = can.getGraphicsContext2D();


        if(checkWithRegExp(value1.getText())==false || value1.getText().equals("") ){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0 до 5!");
            alert.showAndWait();
            return;
        }else {
            int numberOfSides = Integer.parseInt(value1.getText());
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape1 = shapeFactory.createShape(numberOfSides);
            gr.clearRect(0, 0, 250, 485);
            shape1.draw(gr);
        }


    }

}
