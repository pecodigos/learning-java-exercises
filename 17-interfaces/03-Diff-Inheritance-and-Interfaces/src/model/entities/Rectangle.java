package model.entities;

import model.enums.Color;

public class Rectangle extends AbstractShape{

    private Double width;
    private Double height;

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return height * width;
    }
}
