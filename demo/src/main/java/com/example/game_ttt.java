package com.example;

import javafx.application.Application;

import javafx.scene.Scene;

import javafx.scene.layout.GridPane;

//import javafx.scene.control.Label;

import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

import javafx.stage.Stage;




public class game_ttt extends Application {

  public static void main(String[] args) {

    launch(args);

  }

  @Override

  public void start(Stage stage) {

  GridPane pane = new GridPane();




        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                int n = (int)(Math.random() * 3);

                if (n == 0)

                    pane.add(new ImageView(new Image("D:\\javafx\\demo\\src\\ex.gif")), j, i);

                else if (n == 1)

                    pane.add(new ImageView(new Image("D:\\javafx\\demo\\src\\oo.gif")), j, i);

                else

                    continue;

            }

        }

  stage.setTitle("tic-tac-toe");

    stage.setScene(new Scene(pane, 500, 600));

    stage.show();

  }

  

}
