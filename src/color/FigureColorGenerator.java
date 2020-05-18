package color;

import java.util.Random;

public class FigureColorGenerator {
    public FigureColor getColor() {
        Random random = new Random();

        int randomIndex = random.nextInt(FigureColor.values().length);

        return FigureColor.values()[randomIndex];
    }
}
