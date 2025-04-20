module com.example.cdbl_final {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cdbl_final to javafx.fxml;
    exports com.example.cdbl_final;
}