module com.adz1q.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.datatransfer;

    opens com.adz1q.javafx2 to javafx.fxml;
    exports com.adz1q.javafx2;
}
