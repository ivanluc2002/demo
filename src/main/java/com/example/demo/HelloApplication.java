package com.example.demo;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class HelloApplication extends Application {
    Sprite sp1;
    Sprite sp2;


    public static void main(String[] args) {
        launch();
    }


    public void buildSprites() {
         sp1 = new Sprite("gold.png", 50, 50);
         sp2 = new Sprite("banana.png", 50, 50);

        sp1.setX(10);
        sp1.setY(300);

    }

        @Override
    public void start(Stage primaryStage) throws Exception {
        Timer timer=startimer();

        buildSprites();

        primaryStage.setTitle("My First JavaFX App");
        Group root = new Group();


        root.getChildren().add(sp1.imgView);
        root.getChildren().add(sp2.imgView);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }





     private Timer startimer() {
         Timer timer=new Timer("timer");


         TimerTask task=new TimerTask() {
             @Override
             public void run() {
                

                 Platform.runLater(()->{

                 });

             }
         };
         long delay =0;
         long period=1000L;
         timer.schedule(task,delay,period);
         return timer;
    }



}