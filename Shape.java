abstract class Shape {
    abstract void area();
}

class Circle extends Shape {
    void area() {
        System.out.println("Circle area = 78.5");
    }
}

class Square extends Shape {
    void area() {
        System.out.println("Square area = 25");
    }
}

class Main {
    public static void main(String[] args) {
        new Circle().area();
        new Square().area();
    }
}
