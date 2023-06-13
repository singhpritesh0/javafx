package com.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
    public class CircleColor extends Application {









		@Override // Override the start method in the Application class

		 public void start(Stage primaryStage) {

		// Create a circle and set its properties

		 Circle circle = new Circle();

	circle.setCenterX(150);

		 circle.setCenterY(150);

		 circle.setRadius(45);

	     circle.setStroke(Color.RED);

		 circle.setFill(Color.WHITE);

		

		

		 Pane pane = new Pane();

		 pane.getChildren().add(circle);

		pane.setOnMousePressed(e-> circle.setFill(Color.RED));

	      pane.setOnMouseReleased(e-> circle.setFill(Color.BLUE));

		

		

		Scene scene = new Scene(pane, 300, 300);

		 primaryStage.setTitle("ShowCircle"); // Set the stage title

		 primaryStage.setScene(scene); // Place the scene in the stage

		 primaryStage.show(); // Display the stage

		 }

		

	 public static void main(String[] args) {

		 Application.launch(args);

		 }

}
