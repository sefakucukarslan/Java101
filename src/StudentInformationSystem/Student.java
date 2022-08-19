package StudentInformationSystem;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double average;
    boolean isPass;

    Student(String name,String stuNo,String classes, Course c1,Course c2,Course c3){
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }
    void addBulkExamNote(double note1,double snote1, double note2, double snote2, double note3,double snote3){
        if (note1 >= 0 && note1 <=100){
            if (snote1 >= 0 && snote1 <= 100){
                c1.note = (note1*0.8) + (snote1*0.2);
            }
        }
        if (note2 >= 0 && note2 <=100){
            if (snote1 >= 0 && snote1 <= 100){
                c2.note = (note2*0.8) + (snote2*0.2);
            }
        }
        if (note3 >= 0 && note3 <=100){
            if (snote1 >= 0 && snote1 <= 100){
                c3.note = (note3*0.8) + (snote3*0.2);
            }
        }
    }

    void isPass(){
        System.out.println("***************************");
        this.average = (this.c1.note + this.c2.note + this.c3.note) / 3.0;
        if (this.average > 55){
            System.out.println("Tebrikler sinifi gectiniz !");
            this.isPass = true;
        }else {
            System.out.println("UzgUnUz sinifta kaldiniz !");
            this.isPass = false;
        }
        printNote();
    }
    void printNote(){
        System.out.println(c1.name +" Notu\t:"+this.c1.note);
        System.out.println(c2.name +" Notu\t:"+this.c2.note);
        System.out.println(c3.name +" Notu\t:"+this.c3.note);
        System.out.println("Ortalamaniz :"+this.average);
    }
}
