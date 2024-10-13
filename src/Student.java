import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int rating;
    private static List<Student> studentList = new ArrayList<>();

    // Конструктор за замовчуванням
    public Student() {
        this.name = "Unknown";
        this.rating = 0;
    }

    // Конструктор з параметрами
    public Student(String name) {
        this.name = name;
        this.rating = 0;
        studentList.add(this);
    }

    // Метод для отримання середнього рейтингу
    public static double getAvgRating() {
        if (studentList.isEmpty()) {
            return 0.0;
        }

        double totalRating = 0.0;
        for (Student student : studentList) {
            totalRating += student.getRating();
        }
        return totalRating / studentList.size();
    }

    // Геттери і сеттери
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    // Метод для визначення кращого студента
    public boolean betterStudent(Student student) {
        return this.rating > student.getRating();
    }

    // Метод для зміни рейтингу
    public void changeRating(int rating) {
        this.rating = rating;
    }

    // Метод для видалення студента
    public static void removeStudent(Student student) {
        studentList.remove(student);
    }

    // Метод для виводу інформації про студента
    @Override
    public String toString() {
        return "Student{name='" + name + "', rating=" + rating + "}";
    }
}
