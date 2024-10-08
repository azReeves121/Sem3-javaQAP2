public class MyLine {
    private MyPoint begin; // A point representing the beginning of the line
    private MyPoint end;   // A point representing the end of the line

    // Constructor with no arguments
    public MyLine() {
        this.begin = new MyPoint(0, 0);  // Default begin point at (0, 0)
        this.end = new MyPoint(1, 1);    // Default end point at (1, 1)
    }

    // Constructor with two MyPoint instances
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Constructor with coordinates (x1, y1) and (x2, y2)
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    // Getters and Setters for begin and end points
    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Getters and Setters for individual x and y of begin and end points
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX(int x) {
        this.begin.setX(x);
    }

    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int y) {
        this.begin.setY(y);
    }

    public void setBeginXY(int x, int y) {
        this.begin.setXY(x, y);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int x) {
        this.end.setX(x);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int y) {
        this.end.setY(y);
    }

    public void setEndXY(int x, int y) {
        this.end.setXY(x, y);
    }

    // Calculate the length of the line
    public double getLength() {
        return begin.distance(end);
    }

    // Get the slope of the line
    public double getSlope() {
        if (end.getX() == begin.getX()) {
            throw new ArithmeticException("Slope is undefined for vertical lines.");
        }
        return (double)(end.getY() - begin.getY()) / (end.getX() - begin.getX());
    }

    // String representation of the line
    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
