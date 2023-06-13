package com.example;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.paint.Color;
public class radio extends Application{
	

	     protected Text text = new Text(50, 50, "Hello Java Programmers");

	     @Override
	     public void start(Stage primaryStage) {
	         HBox paneForButtons = new HBox(20);
	         Button btLeft = new Button("LEFT");
	         Button btRight = new Button("RIGHT");
	         paneForButtons.getChildren().addAll(btLeft, btRight);
	         paneForButtons.setAlignment(Pos.CENTER);
	         BorderPane pane = new BorderPane();
	         pane.setBottom(paneForButtons);

	         HBox paneForRadioButtons = new HBox(20);
	         RadioButton rbRed = new RadioButton("Red");
	         RadioButton rbYellow = new RadioButton("Yellow");
	         RadioButton rbBlack = new RadioButton("Black");
	         RadioButton rbOrange = new RadioButton("Orange");
	         RadioButton rbGreen = new RadioButton("Green");
	         paneForRadioButtons.getChildren().addAll(rbRed, rbYellow,
	             rbBlack, rbOrange, rbGreen);

	         ToggleGroup group = new ToggleGroup();
	         rbRed.setToggleGroup(group);
	         rbYellow.setToggleGroup(group);
	         rbBlack.setToggleGroup(group);
	         rbOrange.setToggleGroup(group);
	         rbGreen.setToggleGroup(group);

	         Pane paneForText = new Pane();
	         paneForText.setStyle("-fx-border-color: black");
	         paneForText.getChildren().add(text);
	         pane.setCenter(paneForText);
	         pane.setTop(paneForRadioButtons);

	         btLeft.setOnAction(e-> text.setX(text.getX() - 10));
	         btRight.setOnAction(e-> text.setX(text.getX() + 10));

	         rbRed.setOnAction(e-> {
	             if (rbRed.isSelected()) {
	                 text.setFill(Color.RED);
	             }
	         });

	         rbYellow.setOnAction(e-> {
	             if (rbYellow.isSelected()) {
	                 text.setFill(Color.YELLOW);
	             }
	         });

	         rbBlack.setOnAction(e-> {
	             if (rbBlack.isSelected()) {
	                 text.setFill(Color.BLACK);
	             }
	         });

	         rbOrange.setOnAction(e-> {
	             if (rbOrange.isSelected()) {
	                 text.setFill(Color.ORANGE);
	             }
	         });

	         rbGreen.setOnAction(e-> {
	             if (rbGreen.isSelected()) {
	                 text.setFill(Color.GREEN);
	             }
	         });

	         Scene scene = new Scene(pane, 650, 350);
	         primaryStage.setTitle("GUI program");
	         primaryStage.setScene(scene);
	         primaryStage.show();
	     }
	     public static void main(String[] args) {
	    	    launch(args);
	    	  }
	 }