module com.example.otimizaestoque {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.otimizaestoque to javafx.fxml;
    exports com.example.otimizaestoque;
}