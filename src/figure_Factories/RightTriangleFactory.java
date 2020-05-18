package figure_Factories;

import color.FigureColorGenerator;
import color.FigureColor;
import figures.RightTriangle;

import java.util.Random;

public class RightTriangleFactory {
    public RightTriangle create() {
        FigureColorGenerator figureColorGenerator = new FigureColorGenerator();
        FigureColor figureColor = figureColorGenerator.getColor();
        Random rand = new Random();
        double sideLength1 = 1 + rand.nextInt(10);
        double sideLength2 = 1 + rand.nextInt(10);

        return new RightTriangle(figureColor, sideLength1, sideLength2);
    }
}
