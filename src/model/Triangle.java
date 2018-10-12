package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//треугольник
public class Triangle implements Shape {
    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.RED);
        gr.fillPolygon(new double[]{125, 25, 250},
                new double[]{25,250,250},3
                );
    }
}
