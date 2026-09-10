package homework;

public class Line {
    private int length;

    public Line(int length) {
        this.length = length;
    }

    public boolean isSameLine(Line line) {
        return line != null && this.length == line.length;
    }
}