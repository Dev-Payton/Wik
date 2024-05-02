package com.devpayton.wik.View;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import org.w3c.dom.Text;


public class LoginView extends BorderPane {

    public VBox getCenterBox() {
        return centerBox;
    }

    private final VBox centerBox = new VBox(10);
    private final StackPane loginWrapper = new StackPane();
    private final Label loginLabel = new Label("Sign in to WIK");
    private final TextField loginUSERNAMEField = new TextField("Username");
    private final PasswordField loginPASSWORDField = new PasswordField();
    private final Button loginButton = new Button("Login");
    private final Label registerLabel = new Label("Not a member?");
    private final Button registerButton = new Button("Click Here");
    private final HBox registerBox = new HBox(10);
    private final Separator separator = new Separator();
    TextField clearTextPassword = new TextField("Password");
    private boolean displayErrorMessage = true;



    public TextField getClearTextPassword() {
        return clearTextPassword;
    }

    public void setClearTextPassword(TextField clearTextPassword) {
        this.clearTextPassword = clearTextPassword;
    }


    public void setDisplayErrorMessage(boolean displayErrorMessage) {
        this.displayErrorMessage = displayErrorMessage;
    }



    public LoginView( ) {
        setupInitAlign();
        setLoginCss();

    }



    private void setupInitAlign() {
        VBox.setMargin(loginLabel, new Insets(0, 0, 25, 0));
        registerBox.setAlignment(Pos.CENTER);
        registerBox.getChildren().addAll(registerLabel, registerButton);
        separator.setPadding(new Insets(5, 0, 5, 0));
        loginUSERNAMEField.setMaxWidth(250);
       loginPASSWORDField.setMaxWidth(250);
       clearTextPassword.setMaxWidth(250);
        loginButton.setMaxWidth(170);
        loginButton.setMaxHeight(20);
        loginButton.setPrefHeight(20.0);
        loginWrapper.getChildren().addAll(centerBox);
        StackPane.setAlignment(centerBox, Pos.CENTER);
        this.setLeft(loginWrapper);
        centerBox.getChildren().addAll(
                loginLabel,
                loginUSERNAMEField,
                clearTextPassword,
                loginButton,
                separator,
                registerBox
        );
        centerBox.setPrefSize(400, 400);
        centerBox.setAlignment(Pos.CENTER);
        centerBox.setPadding(new Insets(100, 125, 100, 125));
    }


    private void setLoginCss() {
        this.getStyleClass().add("login-border-pane");
        centerBox.getStyleClass().add("login-center-box");
        loginLabel.getStyleClass().add("login-label");
        loginPASSWORDField.getStyleClass().add("login-password-field");
        loginUSERNAMEField.getStyleClass().add("login-username-field");
        loginWrapper.getStyleClass().add("login-wrapper");
        loginButton.getStyleClass().add("login-button");
        registerLabel.getStyleClass().add("register-label");
        registerButton.getStyleClass().add("register-button");
        clearTextPassword.getStyleClass().add("clear-text-password");
    }


    public void displayErrorMessage(String message) {
        if (this.displayErrorMessage){
            Label errorLabel = new Label(message);
            errorLabel.setPadding(new Insets(0, 0, 0, 60));
            HBox errorHandlerBox = new HBox(10);
            //errorHandlerBox.setStyle("-fx-background-color: #4e5657;");
            errorHandlerBox.getChildren().addAll(errorLabel);
            errorLabel.setStyle("-fx-font-weight: bold; -fx-text-fill: #FF0000; fx-font-family: 'Arial'; -fx-font-size: 10px;");
            centerBox.getChildren().add(3,errorHandlerBox);
        }

    }

    public void setClearTextBoxPos(){
        centerBox.getChildren().add(2, clearTextPassword);
    }
    public void setPasswordBoxPos(){
        centerBox.getChildren().add(2, loginPASSWORDField);
    }


    public TextField getLoginUSERNAMEField() {
        return loginUSERNAMEField;
    }

    public PasswordField getLoginPASSWORDField() {
        return loginPASSWORDField;
    }

    public Button getLoginButton() {
        return loginButton;
    }
}