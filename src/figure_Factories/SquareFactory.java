package figure_Factories;

import color.FigureColorGenerator;
import color.FigureColor;
import figures.Square;

import java.util.Random;

public class SquareFactory {
    public Square create() {
        FigureColorGenerator figureColorGenerator = new FigureColorGenerator();
        FigureColor figureColor = figureColorGenerator.getColor();
        Random rand = new Random();

        int sideLength = 1 + rand.nextInt(10);

        return new Square(figureColor, sideLength);
    }
}
