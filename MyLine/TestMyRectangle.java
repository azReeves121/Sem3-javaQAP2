public class TestMyRectangle {
    public static void main(String[] args) {
        
        MyPoint topLeft = new MyPoint(1, 5);       
        MyPoint bottomRight = new MyPoint(5, 1);   

        
        MyRectangle myRectangle = new MyRectangle(topLeft, bottomRight);

        
        System.out.println("Rectangle Details: " + myRectangle);

        
        System.out.println("Width: " + myRectangle.getWidth());          
        System.out.println("Height: " + myRectangle.getHeight());        
        System.out.println("Area: " + myRectangle.getArea());            
        System.out.println("Perimeter: " + myRectangle.getPerimeter());  

        
        myRectangle.setTopLeft(new MyPoint(0, 6));
        myRectangle.setBottomRight(new MyPoint(4, 2));

        
        System.out.println("\nUpdated Rectangle Details: " + myRectangle);
    }
}
