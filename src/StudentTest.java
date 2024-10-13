import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class StudentTest {
    List<Student> students = new ArrayList<>();

    @Test
    public void testGetAvgRating() {
        System.out.println("Starting testGetAvgRating...");

        // Перевірка початкового середнього рейтингу
        assertEquals(Student.getAvgRating(), 0.0d, "Average rating is wrong");

        // Створення студентів та встановлення рейтингу
        Student student1 = new Student("Petro");
        student1.setRating(15);
        Student student2 = new Student("Volodymyr");
        student2.setRating(30);

        students.add(student1);
        students.add(student2);

        // Перевірка середнього рейтингу
        System.out.println("Average rating after adding students: " + Student.getAvgRating());
        assertEquals(Student.getAvgRating(), 22.5d, "Average rating is wrong");
        System.out.println("Finished testGetAvgRating.");
    }

    @Test
    public void testGetName() {
        System.out.println("Starting testGetName...");

        Student student = new Student("Petro");
        students.add(student);

        assertEquals(student.getName(), "Petro", "Student's name is wrong");
        System.out.println("Finished testGetName.");
    }

    @Test
    public void testSetName() {
        System.out.println("Starting testSetName...");

        Student student = new Student("Petro");
        student.setName("Volodymyr");
        students.add(student);

        assertEquals(student.getName(), "Volodymyr", "Student's name is wrong");
        System.out.println("Finished testSetName.");
    }

    @Test
    public void testGetRating() {
        System.out.println("Starting testGetRating...");

        Student student1 = new Student("Volodymyr");
        students.add(student1);

        assertEquals(student1.getRating(), 0, "Student's rating is wrong");

        Student student2 = new Student("Petro");
        student2.setRating(51);
        students.add(student2);

        System.out.println("Rating of student " + student2.getName() + ": " + student2.getRating());
        assertEquals(student2.getRating(), 51, "Student's rating is wrong");
        System.out.println("Finished testGetRating.");
    }

    @Test
    public void testSetRating() {
        System.out.println("Starting testSetRating...");

        Student student = new Student("Volodymyr");
        student.setRating(30);
        students.add(student);

        assertEquals(student.getRating(), 30, "Student's rating is wrong");
        System.out.println("Finished testSetRating.");
    }

    @Test
    public void testBetterStudent() {
        System.out.println("Starting testBetterStudent...");

        Student student1 = new Student("Petro");
        student1.setRating(15);
        students.add(student1);

        Student student2 = new Student("Volodymyr");
        student2.setRating(30);
        students.add(student2);

        boolean isBetter = student1.betterStudent(student2);
        System.out.println(student1.getName() + " better than " + student2.getName() + ": " + isBetter);
        assertFalse(isBetter, student1 + " is not better than " + student2);

        Student student3 = new Student("Oksana");
        student3.setRating(51);
        students.add(student3);

        boolean isBetter2 = student3.betterStudent(student2);
        System.out.println(student3.getName() + " better than " + student2.getName() + ": " + isBetter2);
        assertTrue(isBetter2, student3 + " is not better than " + student2);

        System.out.println("Finished testBetterStudent.");
    }

    @Test
    public void testChangeRating() {
        System.out.println("Starting testChangeRating...");

        assertEquals(Student.getAvgRating(), 0.0d, "Average rating is wrong");

        Student student1 = new Student("Petro");
        student1.setRating(15);
        students.add(student1);

        Student student2 = new Student("Volodymyr");
        student2.setRating(30);
        students.add(student2);

        System.out.println("Average rating before change: " + Student.getAvgRating());
        assertEquals(Student.getAvgRating(), 22.5d, "Average rating is wrong");

        student2.changeRating(51);
        System.out.println("New rating of student " + student2.getName() + ": " + student2.getRating());
        assertEquals(Student.getAvgRating(), 33.0d, "Average rating is wrong");
        System.out.println("Average rating after change: " + Student.getAvgRating());
        System.out.println("Finished testChangeRating.");
    }

    @Test
    public void testToString() {
        System.out.println("Starting testToString...");

        Student student = new Student("Petro");
        student.setRating(51);
        students.add(student);

        assertTrue(student.toString().contains("Petro"),
                "toString method does not contain student's name");

        assertTrue(student.toString().contains("51"),
                "toString method does not contain student's rating");
        System.out.println("Finished testToString.");
    }

    @AfterMethod
    public void tearDown() {
        for (Student student : students) {
            Student.removeStudent(student);
            System.out.println("Removing student: " + student.getName());
        }
        students.clear();
    }
}
