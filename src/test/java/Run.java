public class Run {
    public static void main(String[] args) {
        Car car = new Car("BMW", 2000, 15000 );
        Car car1 = new Car("TOYOTA",2005,7000);//Invalid year
        Car car2 = new Car("MERCEDES",2003,-5000);//Invalid price
        Car car3 = new Car("HOWO",2002, 20000);
        Car car4 = new Car ("Ford");
        Dog dog = new Dog("canine", "meat", "pudel");
        dog.DogBreed();
        Rectangle rectangle = new Rectangle("Rectangle", 5.0d, 2.1d);
        rectangle.area();
        rectangle.area(5.0d, 2.1d);
        rectangle.area(5.0d);
        Employee employee = new Employee("Nino ", 1600.25);
        employee.displayDetails();
        Manager manager = new Manager("Mari ", 1000.00 ,  " QA");
        manager.displayDetails();

    }
}

