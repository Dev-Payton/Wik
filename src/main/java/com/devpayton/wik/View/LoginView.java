package com.devpayton.wik.View;

import com.devpayton.wik.Model.LoginModel;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class LoginView extends BorderPane {
    LoginModel loginModel;


    public LoginView(LoginModel loginModel) {
        this.loginModel = loginModel;

        setupInitAlign();
        setLoginCss();

    }

    private void setupInitAlign() {
        VBox.setMargin(loginModel.getLoginLabel(), new Insets(0, 0, 25, 0));
        loginModel.getRegisterBox().setAlignment(Pos.CENTER);
        loginModel.getRegisterBox().getChildren().addAll(loginModel.getRegisterLabel(), loginModel.getRegisterButton());
        loginModel.getSeparator().setPadding(new Insets(5, 0, 5, 0));
        loginModel.getLoginUSERNAMEField().setMaxWidth(200);
        loginModel.getLoginPASSWORDField().setMaxWidth(200);
        loginModel.getLoginButton().setMaxWidth(170);
        loginModel.getLoginButton().setMaxHeight(20);
        loginModel.getLoginButton().setPrefHeight(20.0);
        loginModel.getLoginWrapper().getChildren().addAll(loginModel.getCenterBox());
        StackPane.setAlignment(loginModel.getCenterBox(), Pos.CENTER);
        this.setLeft(loginModel.getLoginWrapper());
        loginModel.getCenterBox().getChildren().addAll(
                loginModel.getLoginLabel(),
                loginModel.getLoginUSERNAMEField(),
                loginModel.getLoginPASSWORDField(),
                loginModel.getLoginButton(),
                loginModel.getSeparator(),
                loginModel.getRegisterBox()
        );
        loginModel.getCenterBox().setPrefSize(300, 400);
        loginModel.getCenterBox().setAlignment(Pos.CENTER);
        loginModel.getLoginWrapper().setPadding(new Insets(100, 125, 100, 125));
    }


    private void setLoginCss() {
        this.getStyleClass().add("login-border-pane");
        loginModel.getCenterBox().getStyleClass().add("login-center-box");
        loginModel.getLoginLabel().getStyleClass().add("login-label");
        loginModel.getLoginPASSWORDField().getStyleClass().add("login-password-field");
        loginModel.getLoginUSERNAMEField().getStyleClass().add("login-username-field");
        loginModel.getLoginWrapper().getStyleClass().add("login-wrapper");
        loginModel.getLoginButton().getStyleClass().add("login-button");
        loginModel.getRegisterLabel().getStyleClass().add("register-label");
        loginModel.getRegisterButton().getStyleClass().add("register-button");
    }


}
