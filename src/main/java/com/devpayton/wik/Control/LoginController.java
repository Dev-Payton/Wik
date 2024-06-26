package com.devpayton.wik.Control;


import com.devpayton.wik.Model.LoginModel;
import com.devpayton.wik.View.LoginView;
import com.devpayton.wik.Model.SceneManager;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LoginController {
    private static final Logger log = LoggerFactory.getLogger(LoginController.class);
    SceneManager sceneManager;
    LoginModel loginModel;
    LoginView loginView;



    public LoginController(LoginModel loginModel, LoginView loginView, SceneManager sceneManager) {
        this.sceneManager = sceneManager;
        this.loginModel = loginModel;
        this.loginView = loginView;
        setupKeyListeners();


    }


    private void setupKeyListeners() {


        loginView.getLoginUSERNAMEField().focusedProperty().addListener((observable, oldValue, newValue) -> handleUsernameFocus(newValue));
        loginView.getLoginUSERNAMEField().addEventHandler(KeyEvent.KEY_PRESSED, this::handleUsernameKeyPress);


        loginView.getLoginPASSWORDField().focusedProperty().addListener((observable, oldValue, newValue) -> handlePasswordFocus(newValue));
        loginView.getLoginPASSWORDField().addEventHandler(KeyEvent.KEY_PRESSED, this::handlePasswordKeyPress);

        loginView.getClearTextPassword().focusedProperty().addListener((observable, oldValue, newValue) -> handleClearTextPasswordFocus(newValue));


        loginView.getLoginButton().setOnAction(this::handleLoginButtonPress);

        loginView.getRegisterButton().setOnAction(this::handleRegisterButtonKeyPress);


    }


    private void handleUsernameFocus(boolean isFocused) {
        TextField usernameField = loginView.getLoginUSERNAMEField();


        if (isFocused) {
            if (usernameField.getText().equals("Username")) {
                usernameField.clear();
            }
        } else {
            if (usernameField.getText().isEmpty()) {
                usernameField.appendText("Username");
            }
        }
    }


    private void handleClearTextPasswordFocus(boolean isFocused) {
        if (isFocused) {
            loginView.getCenterBox().getChildren().remove(loginView.getClearTextPassword());
            loginView.setPasswordBoxPos();
            loginView.getLoginPASSWORDField().requestFocus();
        }
    }

    private void handlePasswordFocus(boolean isFocused) {

        PasswordField passwordField = loginView.getLoginPASSWORDField();
        if (isFocused) {
            if (passwordField.getText().equals("Username")) {
                passwordField.clear();
                passwordField.setVisible(true);
                loginView.getClearTextPassword().requestFocus();

            }
        } else if (passwordField.getText().isEmpty() || passwordField.getText().equals("Password")){
            loginView.getCenterBox().getChildren().remove(loginView.getLoginPASSWORDField());
            loginView.getClearTextPassword().clear();
            loginView.getClearTextPassword().appendText("Password");
            loginView.setClearTextBoxPos();
        }

    }


    private void handleUsernameKeyPress(KeyEvent event) {
        if (event.getCode() == KeyCode.ENTER) {
            if (loginView.getLoginPASSWORDField().getText().isEmpty()) {
                // Checking if the password field is empty if so, a popup of some sort should appear to prompt the user to enter the password to authenticate

                loginView.displayErrorMessage("Username or Password is invalid!");
                loginView.setDisplayErrorMessage(false);

            }

            // TODO - Add Logic here for user authentication
            String tmpLog = "Pressed 'Enter' ";
            tmpLog += loginView.getLoginUSERNAMEField().getText() != null ? "\nUsername: " + loginView.getLoginUSERNAMEField().getText() : "";
            tmpLog += loginView.getLoginPASSWORDField().getText() != null ? "\nPassword: " + loginView.getLoginPASSWORDField().getText() : "";
            System.out.println(tmpLog);
            tmpLog = "";
        }
    }


    private void handlePasswordKeyPress(KeyEvent event) {


        if (event.getCode() == KeyCode.ENTER) {
            if (loginView.getLoginUSERNAMEField().getText().isEmpty() || loginView.getLoginUSERNAMEField().getText().equals("Username")) {
                // Checking if the username field is empty if so, a popup of some sort should appear to prompt the user to enter the username to authenticate
            }
            // TODO - Add Logic here
            System.out.println("Pressed enter inside of the password field");
        }


    }

    private void handleRegisterButtonKeyPress(ActionEvent event){
        System.out.println("Attempting to handle registration form...");

        sceneManager.initializeRegistrationModel();
        sceneManager.showRegisterView();

    }


    private void handleLoginButtonPress(ActionEvent event) {
        // Attempt Login
    }


    private void attemptAuthorization() {


        System.out.println("Username: " + loginView.getLoginUSERNAMEField().getText() + "\nPassword: " + (loginView.getLoginPASSWORDField().getText().isEmpty() ? "Null" : loginView.getLoginPASSWORDField().getText()));
        if (loginView.getLoginUSERNAMEField().getText().isEmpty() || loginView.getLoginUSERNAMEField().getText().equals("Username") || loginView.getLoginPASSWORDField().getText().isEmpty()) {
            // Checking if the fields needed are empty, and  if so, a popup of some sort should appear to prompt the user to enter the username and password to be able to correctly authenticate
        }


    }


}

