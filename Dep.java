import java.util.*;
class Department {
    public int id;
    public String name;
    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public String toString() {
        return "Department [id=" + id + ", name=" + name + "]";
    }
}
public class Dep {
    public static void main(String[] args) {
        List<Department> a = new ArrayList<>();
        a.add(new Department(1, "civil"));
        a.add(new Department(2, "ece"));
        a.add(new Department(3, "cse"));
        Collections.sort(a, new Comparator<Department>() {
            public int compare(Department a1, Department a2) {
                return a1.name.compareTo(a2.name);
            }
        });
        System.out.println("Sorted by Name:");
        for (Department b : a) {
            System.out.println(b);
        }
        Collections.sort(a, new Comparator<Department>() {
            public int compare(Department a1, Department a2) {
                return Integer.compare(a1.id, a2.id);
            }
        });
        for (Department b : a) {
            System.out.println(b);
        }
    }
}
