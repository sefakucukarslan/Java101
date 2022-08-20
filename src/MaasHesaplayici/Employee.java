package MaasHesaplayici;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    int year = 2021;
    int howYear;
    double raise = 0.0;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void tax(){
        if (this.salary > 1000){
            tax = this.salary * 0.03;
        }else{
            tax = 0;
        }
    }

    void bonus(){
        if (this.workHours > 40){
            bonus = (workHours - 40) * 30;
        }else{
            bonus = 0;
        }
    }

    void raiseSalary(){
        howYear = year - hireYear;
        if (howYear < 10){
            raise = this.salary * 0.05;
        } else if (howYear >= 10 && howYear < 20) {
            raise = this.salary * 0.10;
        } else if (howYear >= 20) {
            raise = this.salary * 0.15;
        }
    }

    void toPrint(){
        System.out.println("Adı: " + this.name);
        System.out.println("Maas: " + this.salary);
        System.out.println("Çalışma saati: " + this.workHours);
        System.out.println("Başlangıç yılı: " + this.hireYear);
        System.out.println("Vergisi:" + tax);
        System.out.println("Bonus:" + bonus);
        System.out.println("zam:" + raise);
        System.out.println("Toplam maas:"+(salary+bonus+raise-tax));
        System.out.println("=============================================");
    }
}
