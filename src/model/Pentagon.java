package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//5-угольник
public class Pentagon implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.BLACK);
        gr.fillPolygon(new double[]{25, 137.5, 250, 225,50},
                new double[]{125,25,125, 250,250},5
        );
    }
}
