module jv.pr.pr3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens jv.pr.pr3 to javafx.fxml;
    exports jv.pr.pr3;
}