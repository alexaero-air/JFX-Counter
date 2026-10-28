package org.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class CounterApp extends Application{
    @Override
    public void start(Stage stage){
        Label countLabel = new Label("Посетителей: 0");
        VBox root = new VBox(12, countLabel);
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
