
public class PointSET {

    // construct an empty set of points
    public PointSET() {}

    // is the set empty?
    public boolean isEmpty() { return true; }

    // number of points in the set
    public int size() { return 0; }

    // add the point p to the set (if it is not already in the set)
    // proportional to logarithm of N in the worst case
    public void insert(Point2D p) {}

    // does the set contain the point p?
    // proportional to logarithm of N in the worst case
    public boolean contains(Point2D p) { return false; }

    // draw all of the points to standard draw
    public void draw() {}

    // all points in the set that are inside the rectangle
    // proportional to N in the worst case
    public Iterable<Point2D> range(RectHV rect) { return null; }

    // a nearest neighbor in the set to p: null if set is empty
    // proportional to N
    public Point2D nearest(Point2D p) { return null; }

    public static void main(String[] args) {}
}
