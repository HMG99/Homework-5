package model;

public class Student {
    private String name;
    private String surname;
    private int year;
    private int mark;

    private boolean armenian;
    private char gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1920 && year < 2023) {
            this.year = year;
        }

    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public boolean isArmenian() {
        return armenian;
    }

    public void setArmenian(boolean armenian) {
        this.armenian = armenian;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void studentInfo() {
        System.out.println("name " + name);
        System.out.println("surname " + surname);
        System.out.println("year " + year);
        System.out.println("mark " + mark);
        System.out.println("Is Armenian " + (armenian ? "YES" : "NO"));
        System.out.println("Gender " + (gender == 'f' ? "female" : "male"));

    }


}
