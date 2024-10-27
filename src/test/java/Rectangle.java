public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String name, double length) {
        super(name);
        this.length = length;

    }

    public void area(double length, double width) {
        double area = length * width;
        System.out.println(area);
    }

    public void area(double length) {
        double area = length * length;
        System.out.println(area);
    }
}
