package figures;

import color.FigureColor;

public abstract class FigureBase {
    private FigureColor color;

    protected FigureBase(FigureColor color) {
        this.color = color;
    }

    public abstract String getName();

    public abstract double getArea();

    protected abstract String getDescription();

    public void draw(){
        System.out.println(toString());
    }

    public String toString() {
        String result = " Фигура: " + getName() + ", площадь: " + getArea() + " кв. ед., " + getDescription() + ", цвет: " + color.getDescription() + ".";
        return result;
    }
}