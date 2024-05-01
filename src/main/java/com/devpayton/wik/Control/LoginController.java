package com.devpayton.wik.Control;




import com.devpayton.wik.Model.LoginModel;
import com.devpayton.wik.View.LoginView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;


public class LoginController {
    LoginModel loginModel;
    LoginView loginView;


    public LoginController(LoginModel loginModel, LoginView loginView) {
        this.loginModel = loginModel;
        this.loginView = loginView;
        setupKeyListeners();


    }


    private void setupKeyListeners() {


        loginModel.getLoginUSERNAMEField().focusedProperty().addListener((observable, oldValue, newValue) -> handleUsernameFocus(newValue));
        loginModel.getLoginUSERNAMEField().addEventHandler(KeyEvent.KEY_PRESSED, this::handleUsernameKeyPress);


        loginModel.getLoginPASSWORDField().focusedProperty().addListener((observable, oldValue, newValue) -> handlePasswordFocus(newValue));
        loginModel.getLoginPASSWORDField().addEventHandler(KeyEvent.KEY_PRESSED, this::handlePasswordKeyPress);


        loginModel.getLoginButton().setOnAction(this::handleLoginButtonPress);








    }




    private void handleUsernameFocus(boolean isFocused) {
        TextField usernameField = loginModel.getLoginUSERNAMEField();


        if (isFocused) {
            if (usernameField.getText().equals("Username")) {
                usernameField.clear();
            }
        } else  {
            if (usernameField.getText().isEmpty() ) {
                usernameField.appendText("Username");
            }
        }
    }


    private void handlePasswordFocus(boolean isFocused){
        PasswordField passwordField = loginModel.getLoginPASSWORDField();
        if (isFocused){
            if (passwordField.getText().equals("Username")){
                passwordField.clear();
                passwordField.setVisible(true);
            }
        }
        else {
            passwordField.setVisible(true);
        }
    }


    private void  handleUsernameKeyPress(KeyEvent event){
        if (event.getCode() == KeyCode.ENTER){
            if (loginModel.getLoginPASSWORDField().getText().isEmpty()){
                // Checking if the password field is empty if so, a popup of some sort should appear to prompt the user to enter the password to authenticate
            }
            // TODO - Add Logic here
            System.out.println("Pressed enter inside of the username field");
        }
    }


    private void handlePasswordKeyPress(KeyEvent event){


        if(event.getCode() == KeyCode.ENTER){
            if (loginModel.getLoginUSERNAMEField().getText().isEmpty() || loginModel.getLoginUSERNAMEField().getText().equals("Username")){
                // Checking if the username field is empty if so, a popup of some sort should appear to prompt the user to enter the username to authenticate
            }
            // TODO - Add Logic here
            System.out.println("Pressed enter inside of the password field");
        }


    }


    private void handleLoginButtonPress(ActionEvent event){
        // Attempt Login
    }










    private void attemptAuthorization() {


        System.out.println("Username: " + loginModel.getLoginUSERNAMEField().getText() + "\nPassword: " + (loginModel.getLoginPASSWORDField().getText().isEmpty() ? "Null" : loginModel.getLoginPASSWORDField().getText()));
        if (loginModel.getLoginUSERNAMEField().getText().isEmpty() || loginModel.getLoginUSERNAMEField().getText().equals("Username") || loginModel.getLoginPASSWORDField().getText().isEmpty( )){
            // Checking if the fields needed are empty, and  if so, a popup of some sort should appear to prompt the user to enter the username and password to be able to correctly authenticate
        }




    }




}

