package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import Geometry2D.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;


import java.util.Random;

public class Controller {

    @FXML
    private Button circle1;

    @FXML
    private Button square1;

    @FXML
    private Pane Pain_iz_Naruto;

    private GraphicsContext kontekst;


    public void initialize() {
        Random r = new Random();//туть место для ваших случайных чисел. Поиграем в лото?
        // nextInt (max-1-min)+min; // туть мы избавляемся от нулей, получая рандомное число
        circle1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                myFigure sercle = new myCircle(
                        (double) (r.nextInt(100 - 1 - 1) + 1));
                Circle c = new Circle(
                        sercle.getR(),
                        (double)( r.nextInt(100 - 1 - 1) + 1),
                (double) (r.nextInt(100 - 1 - 1) + 1),
                Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)
                ));
                Pain_iz_Naruto.getChildren().addAll(c);
            }

        });

        square1.addEventHandler(MouseEvent.MOUSE_PRESSED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                myFigure sqr = new myRectangle(
                        (double)(r.nextInt(100-1-1)+1),
                        (double)(r.nextInt(100-1-1)+1));
                Rectangle kv = new Rectangle(
                        sqr.getA(),
                        sqr.getB(),
                        (double)(r.nextInt(100-1-1)+1),
                        (double)(r.nextInt(100-1-1)+1));

                kv.setFill(
                        Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256))
                );
                        Pain_iz_Naruto.getChildren().addAll(kv);


            }
        });


    }

}
