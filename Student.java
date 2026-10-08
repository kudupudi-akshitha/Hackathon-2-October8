import java.util.Scanner;

class Student {
String studentName, courseName;
int rollNumber, courseCredits;
double marks;

Student(String name, int roll, double m, String course, int credits) {
studentName = name;
rollNumber = roll;
marks = m;
courseName = course;
courseCredits = credits;
}

double calculateFee() {
return courseCredits * 1500;
}

boolean checkEligibility() {
return marks >= 50;
}

double calculateScholarship() {
if(marks >= 90) {
return calculateFee() * 0.20;
}
else if(marks >= 75) {
return calculateFee() * 0.10;
}
else {
return 0;
}
}

void display() {
System.out.println("Student Name: " + studentName);
System.out.println("Roll Number: " + rollNumber);
System.out.println("Marks: " + marks);
System.out.println("Course: " + courseName);
System.out.println("Course Credits: " + courseCredits);
System.out.println("Fee: " + calculateFee());
System.out.println("Eligible: " + checkEligibility());
System.out.println("Scholarship: " + calculateScholarship());
}

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

System.out.print("Enter student name: ");
String name = sc.nextLine();

System.out.print("Enter roll number: ");
int roll = sc.nextInt();

System.out.print("Enter marks: ");
double marks = sc.nextDouble();

System.out.print("Enter course name: ");
sc.nextLine();
String course = sc.nextLine();

System.out.print("Enter course credits: ");
int credits = sc.nextInt();

Student s = new Student(name, roll, marks, course, credits);

s.display();
}
}