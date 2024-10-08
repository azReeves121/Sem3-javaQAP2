public class TestMyLine {
    public static void main(String[] args) {
        // Create two MyPoint objects
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        // Create a MyLine object using MyPoint instances
        MyLine line1 = new MyLine(p1, p2);

        // Create another MyLine object using coordinates
        MyLine line2 = new MyLine(0, 0, 3, 4);

        // Test toString method
        System.out.println("Line 1: " + line1); // Expected output: MyLine[begin=(1, 2), end=(4, 6)]
        System.out.println("Line 2: " + line2); // Expected output: MyLine[begin=(0, 0), end=(3, 4)]

        // Test getLength method
        System.out.println("Length of line1: " + line1.getLength()); // Expected: ~5.0
        System.out.println("Length of line2: " + line2.getLength()); // Expected: 5.0

        // Test getSlope method
        System.out.println("Slope of line1: " + line1.getSlope());   // Expected: 1.333...
        System.out.println("Slope of line2: " + line2.getSlope());   // Expected: 1.333...

        // Test setting new coordinates for begin and end points
        line1.setBeginXY(5, 8);
        line1.setEndXY(9, 10);
        System.out.println("Updated Line 1: " + line1); // Expected output: MyLine[begin=(5, 8), end=(9, 10)]

        // Test get individual coordinates
        System.out.println("Begin X of line1: " + line1.getBeginX()); // Expected: 5
        System.out.println("End Y of line1: " + line1.getEndY());     // Expected: 10
    }
}
