public class empBonus extends Employee implements Increment{
    double bonus;
    empBonus(int id, String name, double salary, double b){
        super(id, name, salary);
        bonus = b;
    }

    public double totalSalary() {

        return salary + (salary*(bonus/100));

    }

    public void incrementSalary() {
        double total;
        total = totalSalary() + 500;
        System.out.println("Increment Salary is: " + total);
    }
}
