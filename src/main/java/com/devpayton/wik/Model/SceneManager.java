package com.devpayton.wik.Model;

import com.devpayton.wik.Control.LoginController;
import com.devpayton.wik.Control.RegisterController;
import com.devpayton.wik.View.LoginView;
import com.devpayton.wik.View.RegisterView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {

    //TODO: Clean up instance fields so that there is less verbose code

    Stage stage;
    //------------------------------------------------------------------# LOGIN PAGE
    LoginModel loginModel;
    LoginView loginView;
    LoginController loginController;
    Scene loginScene;
    //------------------------------------------------------------------# REGISTER PAGE
    RegisterModel registerModel;
    RegisterView registerView;
    RegisterController registerController;
    Scene registerScene;


    public SceneManager(Stage stage) {
        this.stage = stage;
        initializeLoginModel();

    }

    public void initializeLoginModel() {
        loginModel = new LoginModel();
        loginView = new LoginView();
        loginController = new LoginController(loginModel, loginView, this);

    }

    public void showLoginView() {
        loginScene = new Scene(loginView, 1000, 700);
        loginScene.getStylesheets().add(getClass().getResource("/com/devpayton/wik/loginstyles.css").toExternalForm());
        loginView.setLoginCss();
        stage.setScene(loginScene);

    }

    public void initializeRegistrationModel() {
            registerModel = new RegisterModel();
            registerView = new RegisterView();
            registerController = new RegisterController(registerModel, registerView, this);
    }

    public void showRegisterView(){
        registerScene = new Scene(registerView, 1000,700);
        registerScene.getStylesheets().add(getClass().getResource("/com/devpayton/wik/registerstyles.css").toExternalForm());
        stage.setScene(registerScene);

    }



}
