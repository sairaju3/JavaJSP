package Student_data_managment;

import java.util.*;

public class StudentManager {
    private Map<Integer, Student> students;

    /**
     * mapType: 1 = HashMap, 2 = LinkedHashMap, 3 = TreeMap
     */
    public StudentManager(int mapType) {
        switch (mapType) {
            case 2:
                students = new LinkedHashMap<>();
                break;
            case 3:
                students = new TreeMap<>();
                break;
            case 1:
            default:
                students = new HashMap<>();
                break;
        }
    }

    public boolean addStudent(Student s) {
        if (students.containsKey(s.getId())) {
            return false; // already exists
        }
        students.put(s.getId(), s);
        return true;
    }

    public Student getStudent(int id) {
        return students.get(id);
    }

    public boolean removeStudent(int id) {
        return students.remove(id) != null;
    }

    public boolean updateStudent(int id, String name, Integer age, String course) {
        Student s = students.get(id);
        if (s == null) return false;
        if (name != null && !name.trim().isEmpty()) s.setName(name);
        if (age != null) s.setAge(age);
        if (course != null && !course.trim().isEmpty()) s.setCourse(course);
        return true;
    }

    public List<Student> getAllStudents() {
        return new ArrayList<>(students.values());
    }

    public int size() {
        return students.size();
    }

    public boolean isEmpty() {
        return students.isEmpty();
    }
}

