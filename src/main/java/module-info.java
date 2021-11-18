module com.example.f21comp1011gcw10 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires com.google.gson;
    requires java.net.http;

    opens com.example.f21comp1011gcw10 to javafx.fxml, com.google.gson;
    exports com.example.f21comp1011gcw10;
    exports com.example.f21comp1011gcw10.Controllers;
    opens com.example.f21comp1011gcw10.Controllers to com.google.gson, javafx.fxml;
}