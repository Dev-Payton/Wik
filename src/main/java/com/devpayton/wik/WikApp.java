package com.devpayton.wik;

import com.devpayton.wik.Database.DatabaseConnection;
import com.devpayton.wik.Model.SceneManager;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class WikApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //#------------------------------------------------- Setting up Title and Database Connections
        stage.setTitle("WIK!");
        DatabaseConnection.initializeDatabase();
        //#----------------------------------------------------- Setting up Required MVC Layout
        SceneManager sceneManager = new SceneManager(stage);
        sceneManager.showLoginView();


        stage.setResizable(false);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}