package StudentInformationSystem;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "TRH", "0850");
        Teacher t2 = new Teacher("graham", "FZK", "000");
        Teacher t3 = new Teacher("Kulyutmaz","BIO","1111");

        Course tarih = new Course("Tarih", "101", "TRH");
        tarih.addTeacher(t1);

        Course fizik = new Course("Fizik", "102", "FZK");
        fizik.addTeacher(t2);

        Course bio = new Course("Biyoloji","101","BIO");
        bio.addTeacher(t3);

        Student s1 = new Student("Ahmet","123","4", tarih,fizik,bio);
        s1.addBulkExamNote(100,80,70,80,50,90);
        s1.isPass();

        Student s2 = new Student("Mehmet","444","4",tarih,fizik,bio);
        s2.addBulkExamNote(50,70,70,60,50,80);
        s2.isPass();
    }
}
