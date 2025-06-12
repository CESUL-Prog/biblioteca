package br.cesul.biblioteca.ui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.Node;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {

        stage.setScene(new Scene(tabs, 700, 480));
        stage.setTitle("Biblioteca");
        stage.show();
    }


    private Tab makeTab(String title, Node content) {

    }

    public static void main(String[] args) { launch(args); }
}
