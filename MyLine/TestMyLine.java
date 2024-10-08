public class TestMyLine {
    public static void main(String[] args) {
        
        MyPoint p1 = new MyPoint(1, 2);
        MyPoint p2 = new MyPoint(4, 6);

        
        MyLine line1 = new MyLine(p1, p2);

      
        MyLine line2 = new MyLine(0, 0, 3, 4);

      
        System.out.println("Line 1: " + line1);
        System.out.println("Line 2: " + line2);

      
        System.out.println("Length of line1: " + line1.getLength());
        System.out.println("Length of line2: " + line2.getLength());

      
        System.out.println("Gradient of line1 (radians): " + line1.getGradient());   
        System.out.println("Gradient of line2 (radians): " + line2.getGradient());
      
        line1.setBeginXY(5, 8);
        line1.setEndXY(9, 10);
        System.out.println("Updated Line 1: " + line1); 

      
        System.out.println("Begin X of line1: " + line1.getBeginX());
        System.out.println("End Y of line1: " + line1.getEndY());  
    }
}
