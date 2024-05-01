package com.devpayton.wik.Model;

import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class LoginModel {

   public VBox centerBox = new VBox(10);
    StackPane loginWrapper = new StackPane();
    Label loginLabel = new Label("Sign in to WIK");
    TextField loginUSERNAMEField = new TextField("Username");
    PasswordField loginPASSWORDField = new PasswordField();
    Button loginButton = new Button("Login");
    Label registerLabel = new Label("Not a member?");
    Button registerButton = new Button("Click Here");
    HBox registerBox = new HBox(10);
    Separator separator = new Separator();

    public Tooltip getPasswordGenTooltip() {
        return passwordGenTooltip;
    }

    public void setPasswordGenTooltip(Tooltip passwordGenTooltip) {
        this.passwordGenTooltip = passwordGenTooltip;
    }

    Tooltip passwordGenTooltip = new Tooltip("Generate Secure Password?");


    public VBox getCenterBox() {
        return centerBox;
    }

    public void setCenterBox(VBox centerBox) {
        this.centerBox = centerBox;
    }

    public StackPane getLoginWrapper() {
        return loginWrapper;
    }

    public void setLoginWrapper(StackPane loginWrapper) {
        this.loginWrapper = loginWrapper;
    }

    public Label getLoginLabel() {
        return loginLabel;
    }

    public void setLoginLabel(Label loginLabel) {
        this.loginLabel = loginLabel;
    }

    public TextField getLoginUSERNAMEField() {
        return loginUSERNAMEField;
    }

    public void setLoginUSERNAMEField(TextField loginUSERNAMEField) {
        this.loginUSERNAMEField = loginUSERNAMEField;
    }

    public PasswordField getLoginPASSWORDField() {
        return loginPASSWORDField;
    }

    public void setLoginPASSWORDField(PasswordField loginPASSWORDField) {
        this.loginPASSWORDField = loginPASSWORDField;
    }

    public Button getLoginButton() {
        return loginButton;
    }

    public void setLoginButton(Button loginButton) {
        this.loginButton = loginButton;
    }

    public Label getRegisterLabel() {
        return registerLabel;
    }

    public void setRegisterLabel(Label registerLabel) {
        this.registerLabel = registerLabel;
    }

    public Button getRegisterButton() {
        return registerButton;
    }

    public void setRegisterButton(Button registerButton) {
        this.registerButton = registerButton;
    }

    public HBox getRegisterBox() {
        return registerBox;
    }

    public void setRegisterBox(HBox registerBox) {
        this.registerBox = registerBox;
    }

    public Separator getSeparator() {
        return separator;
    }

    public void setSeparator(Separator separator) {
        this.separator = separator;
    }
}
