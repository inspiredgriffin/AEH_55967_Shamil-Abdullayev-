import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class Main {

    public static class Student {
        private String indexNumber;
        private String firstName;
        private String lastName;
        private List<Integer> grades;

        public Student(String indexNumber, String firstName, String lastName, List<Integer> grades) {
            this.indexNumber = indexNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.grades = grades;
        }

        public String getIndexNumber() {
            return indexNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public List<Integer> getGrades() {
            return grades;
        }

        public double calculateAverageGrade() {
            return grades.stream().mapToDouble(a -> a).average().orElse(0);
        }
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // Find student with the highest average grade
        Student topStudent = students.stream()
                .max(Comparator.comparing(Student::calculateAverageGrade))
                .orElse(null);

        if (topStudent != null) {
            System.out.println("Student with the highest average: " + topStudent.getFirstName() + " " + topStudent.getLastName() +
                    " (" + topStudent.getIndexNumber() + ") - Average: " + topStudent.calculateAverageGrade());
        }

        // Calculate the average grade of all students
        double overallAverage = students.stream()
                .flatMapToDouble(s -> s.getGrades().stream().mapToDouble(g -> g))
                .average().orElse(0);
        System.out.println("Overall average grade: " + overallAverage);

        // Sort students by last name and print
        students.sort(Comparator.comparing(Student::getLastName));
        System.out.println("Students sorted by last names:");
        for (Student s : students) {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " (" + s.getIndexNumber() +
                    ") - Average: " + s.calculateAverageGrade());
        }
    }
}