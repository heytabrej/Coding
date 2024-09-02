import java.util.Scanner;

// class Student {
//     String name;
//     int age;
//     int rollno;

//     public void printInfo() {
//         System.out.println(this.name);
//         System.out.println(this.age);
//         System.out.println(this.rollno);
//     }

//     Student(String name, int age, int rollno) {
//         this.name = name;
//         this.age = age;
//         this.rollno = rollno;
//     }
// }

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the student's name:");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Enter the student's age:");
        int age = sc.nextInt();
        System.out.println(age);

        System.out.println("Enter the student's roll number:");
        int rollno = sc.nextInt();
        System.out.println(rollno);

        // Student student = new Student(name, age, rollno);

        // student.printInfo();

        // sc.close();
    }
}
