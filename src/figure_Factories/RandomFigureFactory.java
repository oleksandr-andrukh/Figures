package figure_Factories;

import color.FigureColorGenerator;
import figures.FigureBase;

import java.util.Random;

public class RandomFigureFactory {
    private SquareFactory squareFactory;
    private RightTriangleFactory rightTriangleFactory;
    private CircleFactory circleFactory;
    private RightTrapezeFactory rightTrapezeFactory;
    private FigureColorGenerator figureColorGenerator;

    public RandomFigureFactory() {
        squareFactory = new SquareFactory();
        rightTriangleFactory = new RightTriangleFactory();
        circleFactory = new CircleFactory();
        rightTrapezeFactory = new RightTrapezeFactory();
        figureColorGenerator = new FigureColorGenerator();
    }

    public FigureBase create() throws Exception {
        Random rand = new Random();
        int figureType = rand.nextInt(4);
        switch (figureType) {
            case 0:
                return squareFactory.create();
            case 1:
                return rightTriangleFactory.create();
            case 2:
                return circleFactory.create();
            case 3:
                return rightTrapezeFactory.create();
            default:
                throw new Exception("Unexpected error");
        }
    }
}
