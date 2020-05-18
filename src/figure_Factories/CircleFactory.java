package figure_Factories;

import color.FigureColorGenerator;
import color.FigureColor;
import figures.Circle;

import java.util.Random;

public class CircleFactory {
    public Circle create() {
        FigureColorGenerator figureColorGenerator = new FigureColorGenerator();
        FigureColor figureColor = figureColorGenerator.getColor();
        Random rand = new Random();
        int randomRadius = 1 + rand.nextInt(10);

        return new Circle(figureColor, randomRadius);
    }
}
