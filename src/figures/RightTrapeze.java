package figures;

import color.FigureColor;
import common.Utils;

public class RightTrapeze extends FigureBase {
    private double a;
    private double b;
    private double h;

    public RightTrapeze(FigureColor color, double a, double b, double h) {
        super(color);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public String getName() {
        return "трапеция";
    }

    public double getArea() {
        return (0.5 * (a + b) * h);
    }

    public double getLateralLength() {
        double halfOfDifference = (b - a) * 0.5;
        double hypot = Math.hypot(h, halfOfDifference);
        return Utils.round(hypot);
    }

    public double getSideA() {
        return a;
    }

    public double getSideB() {
        return b;
    }

    @Override
    public String getDescription() {
        double lateralLength = getLateralLength();
        return "длины оснований: " + getSideA() + ", " + getSideB() + " ед., длины сторон: " + lateralLength + ", " + lateralLength + " ед.";
    }
}
