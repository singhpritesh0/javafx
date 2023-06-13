package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
//import javafx.scene.text.Text;
import javafx.stage.Stage;

 public class key_event extends Application {
@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
 // Create a pane and set its properties
 Pane pane = new Pane();
 pane.setPadding(new Insets(30, 30, 30, 30));
 Circle circle = new Circle(30, 30, 30);
 pane.getChildren().add(circle);
 //Text text = new Text(20, 20, "A");
 //pane.getChildren().add(text);
 circle.setOnKeyPressed(e -> {
switch (e.getCode()) {

case UP:
    circle.setCenterY(circle.getCenterY() >
        circle.getRadius() ? circle.getCenterY() - 15 :
        circle.getCenterY());
    break;
case DOWN:
    circle.setCenterY(circle.getCenterY() <
        pane.getHeight() - circle.getRadius() ?
        circle.getCenterY() + 15 : circle.getCenterY());
    break;
case LEFT:
    circle.setCenterX(circle.getCenterX() >
        circle.getRadius() ? circle.getCenterX() - 15 :
        circle.getCenterX());
    break;
case RIGHT:
    circle.setCenterX(circle.getCenterX() <
        pane.getWidth() - circle.getRadius() ?
        circle.getCenterX() + 15 : circle.getCenterX());
    default:
 	   circle.setCenterX(150);
		 circle.setCenterY(150);
 }
 });

 // Create a scene and place it in the stage
 Scene scene = new Scene(pane);
 primaryStage.setTitle("KeyEventDemo"); // Set the stage title
primaryStage.setScene(scene); // Place the scene in the stage
 primaryStage.show(); // Display the stage

 circle.requestFocus(); // text is focused to receive key input
 }
public static void main(String[] args) {
	 Application.launch(args);
	 }
}
