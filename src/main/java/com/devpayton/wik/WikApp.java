package com.devpayton.wik;

import com.devpayton.wik.Control.LoginController;
import com.devpayton.wik.Model.LoginModel;
import com.devpayton.wik.View.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class WikApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        stage.setTitle("WIK!");

        LoginModel loginModel = new LoginModel();
        LoginView loginView = new LoginView(loginModel);
        LoginController loginController = new LoginController(loginModel, loginView);

        Scene loginScene = new Scene(loginView, 1200, 800);
        loginScene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("style.css")).toExternalForm());


        stage.setScene(loginScene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}