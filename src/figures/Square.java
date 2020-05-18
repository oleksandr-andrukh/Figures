package figures;

import color.FigureColor;

public class Square extends FigureBase {
    private double sideLength;

    public Square(FigureColor color, double sideLength) {
        super(color);
        this.sideLength = sideLength;
    }

    public String getName() {
        return "квадрат";
    }

    public double getArea() {
        return (Math.pow(sideLength, 2));
    }

    @Override
    public String getDescription() {
        return "длина стороны: " + getSideLength() + " ед.";
    }

    public double getSideLength() {
        return sideLength;
    }

}
