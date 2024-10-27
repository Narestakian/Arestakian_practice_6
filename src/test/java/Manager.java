public class Manager extends Employee {
    private String department;
    public Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }
    @Override
    public void displayDetails(){
        System.out.println("Name:" + name + "salary: " + salary + " department:" + department);
    }

}
