module com.devpayton.wik {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.devpayton.wik.Control;
    exports com.devpayton.wik;
    opens com.devpayton.wik;
    opens com.devpayton.wik.Control;
    exports com.devpayton.wik.View;
    exports com.devpayton.wik.Model;
}