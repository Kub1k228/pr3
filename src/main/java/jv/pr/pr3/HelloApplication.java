package jv.pr.pr3;
import java.util.Random;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication {
    int a[]=new int [10];

    public HelloApplication() {
        for (int i= 0;i<10;i++){
            Random objGenerator = new Random();
            a[i]=objGenerator.nextInt(100);
        }
    }
    public void sum_with_for(){
       int sum =0;
        for (int i=0;i<10;i++){
            sum+=a[i];
        }
        System.out.println(sum);
    }
    public void sum_with_while(){
        int sum =0;
        int i=0;
        while(i<10){

            sum+=a[i];
            i++;
        }

        System.out.println(sum);

    }
    public void sum_with_do_while(){
        int sum =0;
        int i =0;
        do{

            sum+=a[i];
            i++;
        }
        while(i<10);
        System.out.println(sum);
    }
}