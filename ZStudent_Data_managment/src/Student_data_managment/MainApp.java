package Student_data_managment;

import java.util.List;
import java.util.Scanner;

public class MainApp {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Student Data Management System ===");
        int mapChoice = chooseMapImplementation();
        StudentManager manager = new StudentManager(mapChoice);

        boolean running = true;
        while (running) {
            printMenu();
            int choice = readInt("Enter choice: ");
            switch (choice) {
                case 1:
                    addStudentFlow(manager);
                    break;
                case 2:
                    displayAllFlow(manager);
                    break;
                case 3:
                    searchFlow(manager);
                    break;
                case 4:
                    updateFlow(manager);
                    break;
                case 5:
                    removeFlow(manager);
                    break;
                case 6:
                    System.out.println("Exiting... goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            System.out.println();
        }
        scanner.close();
    }

    private static int chooseMapImplementation() {
        System.out.println("Choose Map implementation to use:");
        System.out.println("1. HashMap (fast, unordered)");
        System.out.println("2. LinkedHashMap (insertion order)");
        System.out.println("3. TreeMap (sorted keys)");
        while (true) {
            int c = readInt("Enter 1, 2 or 3: ");
            if (c >= 1 && c <= 3) return c;
            System.out.println("Please enter a valid option (1-3).");
        }
    }

    private static void printMenu() {
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Student by ID");
        System.out.println("4. Update Student");
        System.out.println("5. Remove Student");
        System.out.println("6. Exit");
        
        
        
        
        
    }

    private static void addStudentFlow(StudentManager manager) {
        System.out.println("-- Add Student --");
        int id = readInt("Enter ID (integer): ");
        String name = readLine("Enter name: ");
        int age = readInt("Enter age: ");
        String course = readLine("Enter course: ");

        Student s = new Student(id, name, age, course);
        boolean added = manager.addStudent(s);
        if (added) System.out.println("Student added successfully.");
        else System.out.println("Student with ID " + id + " already exists.");
    }

    private static void displayAllFlow(StudentManager manager) {
        System.out.println("-- All Students --");
        if (manager.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        List<Student> list = manager.getAllStudents();
        for (Student s : list) {
            System.out.println(s);
        }
        System.out.println("Total: " + manager.size());
    }

    private static void searchFlow(StudentManager manager) {
        System.out.println("-- Search Student --");
        int id = readInt("Enter ID to search: ");
        Student s = manager.getStudent(id);
        if (s == null) System.out.println("Student not found.");
        else System.out.println(s);
    }

    private static void updateFlow(StudentManager manager) {
        System.out.println("-- Update Student --");
        int id = readInt("Enter ID to update: ");
        Student s = manager.getStudent(id);
        if (s == null) {
            System.out.println("Student not found.");
            return;
        }
        System.out.println("Leave fields empty if you don't want to change them.");
        String name = readLine("Enter new name (or press Enter to skip): ");
        String ageStr = readLine("Enter new age (or press Enter to skip): ");
        Integer age = null;
        if (!ageStr.trim().isEmpty()) {
            try { age = Integer.parseInt(ageStr.trim()); } catch (NumberFormatException e) { System.out.println("Invalid age, skipping age update."); }
        }
        String course = readLine("Enter new course (or press Enter to skip): ");

        boolean updated = manager.updateStudent(id, name.isEmpty() ? null : name, age, course.isEmpty() ? null : course);
        if (updated) System.out.println("Student updated.");
        else System.out.println("Update failed.");
    }

    private static void removeFlow(StudentManager manager) {
        System.out.println("-- Remove Student --");
        int id = readInt("Enter ID to remove: ");
        boolean removed = manager.removeStudent(id);
        if (removed) System.out.println("Student removed.");
        else System.out.println("Student not found.");
    }

    // helper methods for safe input
    private static int readInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            String line = scanner.nextLine();
            try {
                return Integer.parseInt(line.trim());
            } catch (NumberFormatException e) {
                System.out.println("Invalid integer. Try again.");
            }
        }
    }

    private static String readLine(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
