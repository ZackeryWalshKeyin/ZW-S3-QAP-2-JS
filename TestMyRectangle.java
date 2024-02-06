public class TestMyRectangle {
    public static void main(String[] args) {
        // Test constructor and toString()
        MyRectangle rectangle1 = new MyRectangle(1, 2, 3, 4);
        System.out.println(rectangle1);  // Output: MyRectangle[topLeft=(1,2),bottomRight=(3,4)]

        // Test getters and setters
        rectangle1.setTopLeftX(5);
        rectangle1.setTopLeftY(6);
        rectangle1.setBottomRight(new MyPoint(7, 8));
        System.out.println(rectangle1);  // Output: MyRectangle[topLeft=(5,6),bottomRight=(7,8)]

        // Test getTopLeft() and getBottomRight()
        MyPoint topLeft = rectangle1.getTopLeft();
        MyPoint bottomRight = rectangle1.getBottomRight();
        System.out.println("Top-left corner: " + topLeft);       // Output: Top-left corner: (5,6)
        System.out.println("Bottom-right corner: " + bottomRight); // Output: Bottom-right corner: (7,8)

        // Test other methods
        System.out.println("Width: " + rectangle1.getWidth());         // Output: Width: 2.0
        System.out.println("Height: " + rectangle1.getHeight());       // Output: Height: 2.0
        System.out.println("Area: " + rectangle1.getArea());           // Output: Area: 4.0
        System.out.println("Perimeter: " + rectangle1.getPerimeter()); // Output: Perimeter: 8.0
    }
}