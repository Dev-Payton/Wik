package com.devpayton.wik.Control;



import com.devpayton.wik.Model.LoginModel;
import com.devpayton.wik.Model.RegisterModel;
import com.devpayton.wik.View.LoginView;
import com.devpayton.wik.Model.SceneManager;
import com.devpayton.wik.View.RegisterView;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





public class RegisterController {

    RegisterModel registerModel;
    RegisterView registerView;
    SceneManager sceneManager;
    public RegisterController(RegisterModel registerModel, RegisterView registerView, SceneManager sceneManager){
        this.registerModel = registerModel;
        this.registerView = registerView;
        this.sceneManager = sceneManager;
    }

}
