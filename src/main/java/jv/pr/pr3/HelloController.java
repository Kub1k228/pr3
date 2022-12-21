package jv.pr.pr3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    public static void main(String[] args) {
        HelloApplication a =new HelloApplication();
        a.sum_with_for();
        a.sum_with_do_while();
        a.sum_with_while();
    }
}