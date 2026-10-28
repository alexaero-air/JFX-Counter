package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;

public class CounterApp extends Application{

    private int visitors = 0;


    @Override
    public void start(Stage stage){
        Label countLabel = new Label("Посетителей: " + visitors);

        Button enterButton = new Button("ПРИШЕЛ");
        enterButton.setOnAction(event ->{
            visitors++;
            countLabel.setText("Посетителей: " + visitors);
        });

        Button leaveButton = new Button("УШЕЛ");
        leaveButton.setOnAction(event ->{
            if (visitors == 0){
            } else {
                visitors--;
                countLabel.setText("Посетителей: " + visitors);
            }
        });

        Button resetButton = new Button("СБРОСИТЬ");
        resetButton.setOnAction(event ->{
            visitors = 0;
            countLabel.setText("Посетителей: " + visitors);
        });

        // Всё, что находится в блоке VBox root, то и видно на экране.
        VBox root = new VBox(
                12,
                countLabel,
                enterButton,
                leaveButton,
                resetButton);
        root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 360, 220);
        stage.setTitle("Счетчик посетителей");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
