package com.example;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class PremiereFenetre extends Application {
    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.WHITE);

        ObservableList<Node> liste = root.getChildren();

        Line ligne = new Line(100,100,200,100);
        Rectangle rectangle = new Rectangle(0,0,100,100);
        Circle cercle = new Circle(250,100,50);

        liste.add(ligne);
        liste.add(rectangle);
        liste.add(cercle);

        primaryStage.setTitle("Ma première fenêtre");
        primaryStage.setScene(scene);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}