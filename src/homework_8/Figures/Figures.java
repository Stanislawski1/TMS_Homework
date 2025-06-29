package homework_8.Figures;

abstract class Figures {
    abstract double area();

    abstract double perimeter();
}

class Tringle extends Figures {
    private double sideOne;
    private double sideTwo;
    private double sideThree;

    public Tringle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    double area() {
        double semiperimeter = perimeter() / 2;
        return Math.sqrt(semiperimeter * (semiperimeter - sideOne) * (semiperimeter - sideTwo) * (semiperimeter - sideThree));
    }

    @Override
    double perimeter() {
        return sideOne + sideTwo + sideThree;
    }
}

class Rectangle extends Figures {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }

    @Override
    double perimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Figures {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}






