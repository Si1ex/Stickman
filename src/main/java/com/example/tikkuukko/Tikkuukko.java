package com.example.tikkuukko;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;

public class Tikkuukko extends Application {
    @Override
    public void start(Stage stage) {

        Circle paa = new Circle();
        paa.setCenterX(200);
        paa.setCenterY(100);
        paa.setRadius(35);
        paa.setStroke(Color.BLACK);
        paa.setFill(Color.WHITE);

        Pane pane = new Pane();
        pane.getChildren().addAll(paa);

        Line vartalo = new Line();
        vartalo.setStartX(paa.getCenterX());
        vartalo.setStartY(paa.getCenterY() + paa.getRadius());
        vartalo.setEndX(paa.getCenterX());
        vartalo.setEndY(paa.getCenterY() + paa.getRadius() + 140);
        vartalo.setStroke(Color.BLACK);
        pane.getChildren().addAll(vartalo);

        Line kasiv = new Line();
        kasiv.setStartX(vartalo.getStartX());
        kasiv.setStartY(vartalo.getStartY()+20);
        kasiv.setEndX(170);
        kasiv.setEndY(220);
        kasiv.setRotate(0);
        kasiv.setStroke(Color.BLACK);
        pane.getChildren().addAll(kasiv);

        Line kasio = new Line();
        kasio.setStartX(vartalo.getStartX());
        kasio.setStartY(vartalo.getStartY()+20);
        kasio.setEndX(230);
        kasio.setEndY(220);
        kasio.setRotate(0);
        kasio.setStroke(Color.BLACK);
        pane.getChildren().addAll(kasio);

        Line jalkav = new Line();
        jalkav.setStartX(vartalo.getEndX());
        jalkav.setStartY(vartalo.getEndY());
        jalkav.setEndX(150);
        jalkav.setEndY(350);
        jalkav.setRotate(0);
        jalkav.setStroke(Color.BLACK);
        pane.getChildren().addAll(jalkav);

        Line jalkao = new Line();
        jalkao.setStartX(vartalo.getEndX());
        jalkao.setStartY(vartalo.getEndY());
        jalkao.setEndX(250);
        jalkao.setEndY(350);
        jalkao.setRotate(0);
        jalkao.setStroke(Color.BLACK);
        pane.getChildren().addAll(jalkao);

        Scene pohja = new Scene(pane, 500, 500);
        stage.setTitle("Tikku-ukko");
        stage.setScene(pohja);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}