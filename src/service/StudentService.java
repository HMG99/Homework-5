package service;

import model.Student;

import java.util.Scanner;

public class StudentService {

    private int femaleCount = 0;
    private int maleCount = 0;

    public int getFemaleCount() {
        return femaleCount;
    }

    public int getMaleCount() {
        return maleCount;
    }

    public void setMaleCount(int maleCount) {
        this.maleCount = maleCount;
    }

    public void setFemaleCount(int femaleCount) {
        this.femaleCount = femaleCount;
    }

    public Student createStudent() {

        Student newStudent = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("surname: ");
        String surname = scanner.next();
        System.out.print("year: ");
        int year = scanner.nextInt();
        System.out.print("mark: ");
        int mark = scanner.nextInt();
        System.out.print("IsArmenian: ");
        boolean armenian = scanner.nextBoolean();
        System.out.print("Gender: ");
        char gender = scanner.next().charAt(0);
        if (gender == 'f') {
            femaleCount++;
        } else {
            maleCount++;
        }

        newStudent.setName(name);
        newStudent.setSurname(surname);
        newStudent.setArmenian(armenian);
        newStudent.setYear(year);
        newStudent.setGender(gender);
        newStudent.setMark(mark);

        return newStudent;
    }

    public Student olderStudent(Student s1, Student s2) {
        if (s1.getYear() < s2.getYear()) {
            return s1;
        } else {
            return s2;
        }
    }

    public Student higherScoreStudent(Student s1, Student s2) {
        if (s1.getMark() > s2.getMark()) {
            return s1;
        } else {
            return s2;
        }
    }

    public void printArmenian(Student s) {
        if (s.isArmenian()) {
            System.out.println(s.getName() + " " + s.getSurname() + " is Armenian");
        }
    }

    public String whichGender(Student s) {
        return s.getGender() == 'm' ? "male" : "female";
    }

    public Student highestMarkGirl(Student[] students) {


        Student[] girls = new Student[femaleCount];
        int girlNumber = 0;

        for (Student st : students) {
            if (st.getGender() == 'f') girls[girlNumber++] = st;
        }


        if (femaleCount == 0) {
            return null;
        } else {
            Student max = girls[0];
            for (int i = 1; i < girls.length; i++) {
                if (girls[i].getMark() > max.getMark()) {
                    max = girls[i];
                }
            }
            return max;
        }


    }

    public Student theYoungestGirl(Student[] students) {

        // I declared an int femaleCount variable
        // to store the count of female students,
        // to create separate array for females and
        // to find the female who's the youngest one.


        Student[] girls = new Student[femaleCount];
        int girlNumber = 0;

        for (Student st : students) {
            if (st.getGender() == 'f') girls[girlNumber++] = st;
        }


        if (femaleCount == 0) {
            return null;
        } else {
            Student min = girls[0];
            for (int i = 1; i < girls.length; i++) {
                if (girls[i].getYear() > min.getYear()) {
                    min = girls[i];
                }
            }
            return min;
        }


    }


    public Student[] orderStudentsByMark(Student[] students) {

        // Should I change the original array or create a new one
        // sort it and return afterwards?

        for (int i = 0; i < students.length; i++) {
            for (int j = 1; j < students.length - i; j++) {
                if (students[j].getMark() < students[j - 1].getMark()) {
                    Student temp = students[j];
                    students[j] = students[j - 1];
                    students[j - 1] = temp;
                }
            }
        }

        return students;

    }


}
