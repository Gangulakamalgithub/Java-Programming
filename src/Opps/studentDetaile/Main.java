package Opps.studentDetaile;

public class Main {
    public static void main(String[] args) {
        Student student1;
        student1 = new Student();

        System.out.println("Name: " + student1.name);
        System.out.println("Id: " + student1.id);
        System.out.println("Fees: " + student1.fees);
        System.out.println("Age: " + student1.age);
        System.out.println("Contact: " + student1.contact);
        System.out.println("Grade: " + student1.grade);

        student1.name = "Ranjith";
        student1.id = 1234;
        student1.fees = "30000";
        student1.age = 18;
        student1.contact = "345267899";
        student1.grade = 'A';


        System.out.println("Name: " + student1.name);
        System.out.println("Id: " + student1.id);
        System.out.println("Fees: " + student1.fees);
        System.out.println("Age: " + student1.age);
        System.out.println("Contact: " + student1.contact);

        Student student2;
        student2 = new Student();

        student2.name = "Raju";
        student2.id = 1235;
        student2.fees = "35000";
        student2.age = 20;
        student2.contact = "998855663";
        student2.grade = 'B';


        System.out.println("Name: " + student2.name);
        System.out.println("Id: " + student2.id);
        System.out.println("Fees: " + student2.fees);
        System.out.println("Age: " + student2.age);
        System.out.println("Contact: " + student2.contact);
        System.out.println("Grade: " + student2.grade);

        Student student3;
        student3 = new Student();

        student3.name = "Raui";
        student3.id = 1236;
        student3.fees = "40000";
        student3.age = 19;
        student3.contact = "9876543892";
        student3.grade = 'C';


        System.out.println("Name: " + student3.name);
        System.out.println("Id: " + student3.id);
        System.out.println("Fees: " + student3.fees);
        System.out.println("Age: " + student3.age);
        System.out.println("Contact: " + student3.contact);
        System.out.println("Grade: " + student3.grade);

    }
}
