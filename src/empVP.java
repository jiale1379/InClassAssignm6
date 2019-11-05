public class empVP extends Employee implements Increment{
    double bonus;
    empVP(int id, String name, double salary, double b){
        super(id, name, salary);
        bonus = b;
    }
    public double totalSalary() {

        return salary + (salary*(bonus/100));

    }
    public void incrementSalary() {
        double total;
        total = totalSalary() + 1000;
        System.out.println("After EmpVP Salary is: " + total);
    }
}
