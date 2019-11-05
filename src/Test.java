public class Test {
    public static void main (String[] args)
    {
        Triangle tri = new Triangle(4, 4);
        System.out.println("Triangle area is: " + tri.area());

        Employee emp = new Employee(12345,"John",100000);
        emp.display();

        empBonus eb = new empBonus(12345,"John", 100000, 20);
        System.out.println("Total Salary after bonus: "+ eb.totalSalary());

        eb.incrementSalary();

        empVP ev = new empVP(12345,"John",100000, 20);
        ev.incrementSalary();


    }
}
