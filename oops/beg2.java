//Student Record
//Class Student with fields: rollNo, name, marks, grade
//Count how many students got a specific grade
//Find the student with the second lowest marks


package oops;

import java.util.Scanner;

class Student {
    private int rollNo;
    private String name;
    private int marks;
    private String grade;

    // Constructor
    public Student(int rollNo, String name, int marks, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.grade = grade;
    }

    // Getters
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }
}

class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        int n = Integer.parseInt(sc.nextLine());
        Student[] students = new Student[n];

        // Input student data
        for (int i = 0; i < n; i++) {
            int rollNo = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            int marks = Integer.parseInt(sc.nextLine());
            String grade = sc.nextLine();

            students[i] = new Student(rollNo, name, marks, grade);
        }

        // Grade to search
        String targetGrade = sc.nextLine();

        // Count students with that grade
        int count = 0;
        for (Student s : students) {
            if (s.getGrade().equalsIgnoreCase(targetGrade)) {
                count++;
            }
        }


        // Find student with second lowest marks
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (Student s : students) {
            int marks = s.getMarks();
            if (marks < min1) {
                min2 = min1;
                min1 = marks;
            } else if (marks < min2 && marks != min1) {
                min2 = marks;
            }
        }

        // Output
        System.out.println("Students with grade " + targetGrade + ": " + count);

        boolean found = false;
        for (Student s : students) {
            if (s.getMarks() == min2) {
                System.out.println("Second lowest marks:");
                System.out.println("Roll No: " + s.getRollNo());
                System.out.println("Name: " + s.getName());
                System.out.println("Marks: " + s.getMarks());
                System.out.println("Grade: " + s.getGrade());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Second lowest marks student not found (maybe all have same marks).");
        }

        sc.close();
    }
}
