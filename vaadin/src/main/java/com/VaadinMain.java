package com;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Arrays;

public class VaadinMain extends Application {
    private Stage stage;
    private static int i = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        this.stage = primaryStage;
        stage.setTitle("Hello Application");
        initialize();
        stage.show();
    }

    private void initialize() {
        ObservableList<String> list = FXCollections.observableList(Arrays.asList("John", "Michel", "Trevor", "Francklin"));
        Button button = new Button("Click me");
        TextField field = new TextField();
        AnchorPane pane = new AnchorPane();
        VBox vBox = new VBox();

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll(list);
        i++;
        button.setOnAction(v -> {
            int result = listView.getSelectionModel().getSelectedIndex();
            System.out.println(result);
            int flag = JOptionPane.showConfirmDialog(null, field.getText());
            System.out.println(i);
            if (flag == 0) {
                System.exit(0);
            } else
                initialize();
        });

        vBox.getChildren().add(button);
        vBox.getChildren().add(field);
        vBox.getChildren().add(listView);
        pane.getChildren().addAll(vBox);
        Scene scene = new Scene(pane, 640, 480);
        stage.setScene(scene);

    }
}
