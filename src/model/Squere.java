package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

//квадрат
public class Squere implements Shape {

    @Override
    public void draw(GraphicsContext gr) {
        gr.setFill(Color.BLUE);
        gr.fillPolygon(new double[]{25, 250, 250, 25},
                new double[]{25,25,250, 250},4
        );
        //gr.fillRoundRect(110, 60, 30, 30, 10, 10);
    }
}
