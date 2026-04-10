class Shape {
    void display() {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape {
    double r = 4;

    void area() {
        double a = 3.14 * r * r;
        System.out.println("Circle Area = " + a);
    }
}

class Rectangle extends Shape {
    int l = 5, b = 3;

    void area() {
        int a = l * b;
        System.out.println("Rectangle Area = " + a);
    }
}

public class Main4 {
    public static void main(String[] args) {

        Circle c = new Circle();
        Rectangle r = new Rectangle();

        c.display();
        c.area();

        r.display();
        r.area();
    }
}