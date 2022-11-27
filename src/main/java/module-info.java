module com.example.calcolatrice2 {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.calcolatrice2 to javafx.fxml;
    exports com.example.calcolatrice2;
}