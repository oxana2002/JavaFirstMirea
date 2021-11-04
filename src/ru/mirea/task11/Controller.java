package ru.mirea.task11;

//import java.awt.*;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;


public class Controller {
    @FXML
    private TextField txt;

    @FXML
    private Label podskazka;

    @FXML
    private TextArea text_area;

    @FXML
    private RadioButton consolas;
    @FXML
    private RadioButton arial_black;
    @FXML
    private RadioButton monotype_corsiva;
    @FXML
    private ColorPicker color_picker;
   /* @FXML
    private ToggleGroup fonts;*/

    public void change_color_text_area(ActionEvent event)
    {
//        Color cl = color_picker.getValue();
//        String str = (String) cl;
        String str = Integer.toHexString(color_picker.getValue().hashCode());
        text_area.setStyle("-fx-text-fill: " + str + ";");
    }

    @FXML
    public void change_text_area(ActionEvent event)
    {
        if (consolas.isSelected())
            text_area.setFont(Font.font("Consolas", 14));
        if (arial_black.isSelected())
            text_area.setFont(Font.font("Arial Black", 14));
        if (monotype_corsiva.isSelected())
            text_area.setFont(Font.font("Monotype Corsiva", 14));


    }

    @FXML
    public void mouseEntered(MouseEvent event)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        String msg = "";
        Label id = (Label) event.getSource();
        if (id.getId().equals("north"))
            msg = "на Север";
        else if (id.getId().equals("east"))
            msg = "на Восток";
        else if (id.getId().equals("south"))
            msg = "на Юг";
        else if (id.getId().equals("west"))
            msg = "на Запад";
        else if (id.getId().equals("center"))
            msg = "в Центр";

        alert.setHeaderText("Добро пожаловать " + msg + "!");
        alert.showAndWait();
    }

    private static int count_attempts = 0;
    private static int hidden_num = -1;
    public void pressButton(ActionEvent event) {
//        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        if (count_attempts == 0)
            hidden_num = (int) (Math.random() * 21);

        int in = Integer.parseInt(txt.getText());
        if (count_attempts < 3 && in == hidden_num) {
            podskazka.setText("Поздравляю)");
//            alert.setHeaderText("Вы угадали!");
//            alert.setContentText("Было загадано: " + hidden_num + "\nЗагадано новое число у Вас снова 3 попытки!");
            count_attempts = 0;
        } else if (count_attempts < 2) {
            if (in > hidden_num)
                podskazka.setText("Меньше");
//                alert.setHeaderText("Загаданное число меньше");
            else
                podskazka.setText("Больше");
//                alert.setHeaderText("Загаданное число больше");
            count_attempts++;
        } else {
            podskazka.setText("Game over");
//            alert.setHeaderText("Вы проиграли!");
//            alert.setContentText("Было загадано: " + hidden_num + "\nЗагадано новое число у Вас снова 3 попытки!");
            count_attempts = 0;
        }

//        alert.showAndWait();
    }

//        @FXML
//        public void initialize() {
//            text_area.setFont(Font.font("Consolas", 14));
//            text_area.setStyle("-fx-text-fill: black;");
//        }
}
