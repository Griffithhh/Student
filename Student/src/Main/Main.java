package Main;
import Model.Student;
import uslugiservisowe.ServisStudenta;

public class Main {
        public static void main(String[] args) {
            // Tworzenie instancji studenta
            Student student1 = new Student("Wojciech", "19345", "Grupa C3");
            Student student2 = new Student("Ivan", "62790", "Grupa C1");

            ServisStudenta studentService = new ServisStudenta();
            studentService.addStudent(student1);
            studentService.addStudent(student2);

            // Wyświetlanie studentów
            studentService.wyswietlStudenta(student1);
            studentService.wyswietlStudenta(student2);
        }
    }
