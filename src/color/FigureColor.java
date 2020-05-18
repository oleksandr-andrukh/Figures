package color;

public enum FigureColor {

    RED("красный"),
    BLUE("синий"),
    GREEN("зеленый"),
    YELLOW("желтый"),
    BLACK("черный"),
    WHITE("белый"),
    GRAY("серый");

    private final String description;

    FigureColor(String value) {
        description = value;
    }

    public String getDescription() {
        return description;
    }
}
