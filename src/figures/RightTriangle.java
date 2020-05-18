package figures;

import color.FigureColor;
import common.Utils;

public class RightTriangle extends FigureBase {
    private double cathetus1;
    private double cathetus2;

    public RightTriangle(FigureColor color, double cathetus1, double cathetus2) {
        super(color);
        this.cathetus1 = cathetus1;
        this.cathetus2 = cathetus2;
    }

    public String getName() {
        return "треугольник";
    }

    public double getHypotenuse() {
        return Utils.round(Math.hypot(cathetus1, cathetus2));
    }

    public double getArea() {
        return (cathetus1 * cathetus2) * 0.5;
    }

    public double getCathetus1() {
        return cathetus1;
    }

    public double getCathetus2() {
        return cathetus2;
    }

    @Override
    public String getDescription() {
        return "катеты: " + getCathetus1() + ", " + getCathetus2() + " ед., гипотенуза: " + getHypotenuse() + " ед.";
    }
}