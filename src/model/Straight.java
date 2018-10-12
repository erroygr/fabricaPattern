package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Straight implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setStroke(Color.PINK);
        gr.setLineWidth(10);

        gr.strokePolygon(new double[]{25, 250},
                new double[]{125,25},2
        );


    }
}
