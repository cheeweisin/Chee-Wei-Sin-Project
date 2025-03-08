public class ShapeA {
    private double radius;
    private String color;

    public ShapeA() {
        this(1.0, "red");
    }

    public ShapeA(double radius) {
        this(radius, "red");
    }

    public ShapeA(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * 1.25;
    }

    @Override
    public String toString() {
        return String.format("ShapeA[radius=%.2f, color=%s, area=%.2f]", radius, color, getArea());
    }

    public void checkColor(ShapeA other) {
        String message = this.color.equalsIgnoreCase(other.color) ?
            "Both shapes have the same color: " + this.color :
            "The shapes have different colors: " + this.color + " and " + other.color;
        System.out.println(message);
    }

    public void compareSize(ShapeA other) {
        if (this.getArea() > other.getArea()) {
            System.out.println("This ShapeA is larger than the other shape.");
        } else if (this.getArea() < other.getArea()) {
            System.out.println("This ShapeA is smaller than the other shape.");
        } else {
            System.out.println("Both shapes are of equal size.");
        }
    }
}

class ShapeB {
    private double side;
    private String color;

    public ShapeB() {
        this(1.0, "blue");
    }

    public ShapeB(double side) {
        this(side, "blue");
    }

    public ShapeB(double side, String color) {
        this.side = side;
        this.color = color;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("ShapeB[side=%.2f, color=%s, area=%.2f]", side, color, getArea());
    }

    public void checkColor(ShapeB other) {
        String message = this.color.equalsIgnoreCase(other.color) ?
            "Both shapes have the same color: " + this.color :
            "The shapes have different colors: " + this.color + " and " + other.color;
        System.out.println(message);
    }

    public void compareSize(ShapeB other) {
        if (this.getArea() > other.getArea()) {
            System.out.println("This ShapeB is larger than the other shape.");
        } else if (this.getArea() < other.getArea()) {
            System.out.println("This ShapeB is smaller than the other shape.");
        } else {
            System.out.println("Both shapes are of equal size.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        ShapeA shapeA1 = new ShapeA();
        ShapeA shapeA2 = new ShapeA(3.5);
        ShapeB shapeB1 = new ShapeB();
        ShapeB shapeB2 = new ShapeB(4.0);

        System.out.println(shapeA1);
        System.out.println(shapeA2);
        System.out.println(shapeB1);
        System.out.println(shapeB2);

        shapeA1.compareSize(shapeA2);
        shapeB1.compareSize(shapeB2);
    }
}