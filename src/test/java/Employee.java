public class Employee {
    public String name;
    public double salary;
    public Employee(String name, double salary){
        this.name = name;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name:" + name + "salary: " + salary);
    }
}
