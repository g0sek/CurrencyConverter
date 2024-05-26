module com.example.currency_converter {
    requires javafx.controls;
    requires javafx.fxml;
    requires okhttp3;
    requires com.google.gson;

    opens com.example.currency_converter to javafx.fxml;
    exports com.example.currency_converter;
}