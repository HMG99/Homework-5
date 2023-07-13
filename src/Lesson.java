import model.Student;
import service.StudentService;

public class Lesson {
    public static void main(String[] args) {

        StudentService studentService = new StudentService();

//        Student student1 = new Student();
//        student1.setName("Anna");
//        student1.setSurname("Manukyan");
//        student1.setMark(100);
//        student1.setGender('f');
//        student1.setArmenian(true);
//        student1.setYear(1998);
//        studentService.setFemaleCount(studentService.getFemaleCount() + 1);
//
//        Student student2 = new Student();
//        student2.setName("Karine");
//        student2.setSurname("Gevorgyan");
//        student2.setMark(90);
//        student2.setGender('f');
//        student2.setArmenian(true);
//        student2.setYear(2000);
//        studentService.setFemaleCount(studentService.getFemaleCount() + 1);
//
//        Student student3 = new Student();
//        student3.setName("Tatev");
//        student3.setSurname("Musheghyan");
//        student3.setMark(94);
//        student3.setGender('f');
//        student3.setArmenian(true);
//        student3.setYear(2001);
//        studentService.setFemaleCount(studentService.getFemaleCount() + 1);
//
//        Student student4 = new Student();
//        student4.setName("Karen");
//        student4.setSurname("Baghdasaryan");
//        student4.setMark(75);
//        student4.setGender('m');
//        student4.setArmenian(true);
//        student4.setYear(1997);
//        studentService.setMaleCount(studentService.getMaleCount() + 1);

        Student student1 = studentService.createStudent();
        System.out.println();
        Student student2 = studentService.createStudent();
        System.out.println();
        Student student3 = studentService.createStudent();
        System.out.println();
        Student student4 = studentService.createStudent();
        System.out.println();

        Student[] studentList = new Student[]{student1, student2, student3, student4};

        Student youngestGirl = studentService.theYoungestGirl(studentList);

        System.out.println("\nThe youngest girl: ");
        youngestGirl.studentInfo();

        Student highestMark = studentService.highestMarkGirl(studentList);
        System.out.println("\nThe highest mark girl: ");
        highestMark.studentInfo();

        Student[] ordered = studentService.orderStudentsByMark(studentList);

        System.out.println();
        for(Student st : studentList) {
            System.out.println(st.getName() + " " + st.getSurname() + " " + st.getMark());
        }

    }
}