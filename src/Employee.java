public class Employee {
    int id;
    String name;
    double salary;
    public Employee(int id, String name, double salary) {
        this.id = 12345;
        this.name = "John";
        this.salary = 10000;
    }
    public void display(){
        System.out.println("ID: "+id + "\n" + "Name: " + name + "\n" + "Salary: " + salary);
    }
}
