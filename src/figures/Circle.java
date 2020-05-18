package figures;

import color.FigureColor;
import common.Utils;

public class Circle extends FigureBase {

    private double radius;

    public Circle(FigureColor color, double radius) {
        super(color);
        this.radius = radius;
    }

    public String getName() {
        return "круг";
    }

    public double getArea() {
        return Utils.round(Math.PI * (radius * radius));
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String getDescription() {
        return "радиус: " + getRadius() + " ед.";
    }
}