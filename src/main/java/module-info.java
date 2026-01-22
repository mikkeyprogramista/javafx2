module com.adz1q.javafx2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.adz1q.javafx2 to javafx.fxml;
    exports com.adz1q.javafx2;
}