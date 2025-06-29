package homework_8.Employees;

public class MyMain {
    public static void main(String[] args) {
        Employees[] Employee = new Employees[3];
        Employee[0] = new Director("\t|Stanislaw", " Holovnev|", "5 years|");
        Employee[1] = new Accountant("|Alice", " Shnider|", "7 years|");
        Employee[2] = new Worker("\t|Simon", " Lindeman|", "2 years|");

        for (Employees Employees : Employee) {
            Employees.outputData();
        }
    }
}
