package MaasHesaplayici;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Sefa", 3000, 45, 1996);
        Employee e2 = new Employee("Bilge", 1000, 35, 2015);

        e1.tax();
        e2.tax();

        e1.bonus();
        e2.bonus();

        e1.raiseSalary();
        e2.raiseSalary();

        e1.toPrint();
        e2.toPrint();
    }
}
