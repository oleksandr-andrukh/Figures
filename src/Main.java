import figures.FigureBase;
import figure_Factories.RandomFigureFactory;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws Exception {
        RandomFigureFactory randomFigureFactory = new RandomFigureFactory();
        Random rand = new Random();
        int numberOfFigures = 1 + rand.nextInt(10);
        FigureBase[] figures = new FigureBase[numberOfFigures];
        for (int i = 0; i < numberOfFigures; i++) {
            FigureBase generatedFigure = randomFigureFactory.create();
            figures[i] = generatedFigure;
        }
        drawFiguresArray(figures);
    }

    public static void drawFiguresArray(FigureBase[] figures) {
        for (int i = 0; i < figures.length; i++)
            figures[i].draw();
    }
}


