public class TestMyLine {
    public static void main(String[] args) {
        // Test constructor and toString()
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1);  // Output: MyLine[begin=(1,2),end=(3,4)]

        // Test getters and setters
        line1.setBeginX(5);
        line1.setBeginY(6);
        line1.setEnd(new MyPoint(7, 8));
        System.out.println(line1);  // Output: MyLine[begin=(5,6),end=(7,8)]

        // Test getBegin() and getEnd()
        MyPoint beginPoint = line1.getBegin();
        MyPoint endPoint = line1.getEnd();
        System.out.println("Begin point: " + beginPoint);  // Output: Begin point: (5,6)
        System.out.println("End point: " + endPoint);      // Output: End point: (7,8)

        // Test other methods
        System.out.println("Line length: " + line1.getLength());   // Output: Line length: 2.8284271247461903
        System.out.println("Line gradient: " + line1.getGradient()); // Output: Line gradient: 0.9272952180016122
    }
}