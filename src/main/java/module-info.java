module com.devpayton.wik {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.slf4j;

    exports com.devpayton.wik.Control;
    opens com.devpayton.wik.Control;
    exports com.devpayton.wik;
    opens com.devpayton.wik;
    exports com.devpayton.wik.View;
    opens com.devpayton.wik.View;
    exports com.devpayton.wik.Model;
    opens com.devpayton.wik.Model;


}