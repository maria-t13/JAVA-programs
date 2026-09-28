class Marks {
    String name;
    int marks;

    Marks(String n, int m) {
        name = n;
        marks = m;
    }

    void display() {
        System.out.println(name + " " + marks);
    }
}

class Demo {
    public static void main(String[] args) {
        Marks a = new Marks("John", 85);
        Marks b = new Marks("Mary", 90);

        a.display();
        b.display();
    }
}
