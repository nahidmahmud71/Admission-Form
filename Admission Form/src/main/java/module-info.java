module com.sslwireless.form {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.sslwireless.form to javafx.fxml;
    exports com.sslwireless.form;
}