package figure_Factories;

import color.FigureColorGenerator;
import color.FigureColor;
import common.Utils;
import figures.RightTrapeze;

import java.util.Random;

public class RightTrapezeFactory {
    public RightTrapeze create() {
        FigureColorGenerator figureColorGenerator = new FigureColorGenerator();
        FigureColor figureColor = figureColorGenerator.getColor();
        Random rand = new Random();
        int baseLengthA = 1 + rand.nextInt(10);
        int baseLengthB = baseLengthA + 1 + rand.nextInt(10);
        int height = 1 + rand.nextInt(10);


        return new RightTrapeze(figureColor, baseLengthA, baseLengthB, height);
    }
}
