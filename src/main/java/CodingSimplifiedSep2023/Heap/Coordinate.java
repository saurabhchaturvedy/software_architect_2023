package CodingSimplifiedSep2023.Heap;

public class Coordinate {


    int x;
    int y;

    Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int distanceFromOrigin() {
        return x * x + y * y;
    }


    public String toString() {
        return "[" + x + "," + y + "]";
    }
}
