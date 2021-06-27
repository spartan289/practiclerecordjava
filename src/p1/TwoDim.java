package p1;

public class TwoDim {
    private int x;
    private int y;
    public TwoDim(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Coordinate: x= " + x + "y= "+y;
    }
}
