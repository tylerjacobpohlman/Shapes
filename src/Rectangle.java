/**
 * @author Tyler Pohlman
 * @version 1.0
 * @since 04/04/2023
 */
public class Rectangle extends Shape{
    /**
     * Default Rectangle Constructor
     */
    //super() is implicitly called, so it's not need
    Rectangle() {}

    /**
     * Rectangle Constructor
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    //length is stored as "height" attribute in the class
    Rectangle(double length, double width) {
        super(length, width);
    }

    /**
     * Returns the perimeter of the rectangle.
     * @return double
     */
    @Override
    public double getPerimeter() {
        return (2 * height) + (2 * width);
    }

    /**
     * Returns the area of the rectangle.
     * @return double
     */
    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
