class Student {
     String name;
     int marks;
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return name + " has scored " + marks + " marks";
    }
 }
public class Stu{
    public static void main(String[] args) {
        Student student = new Student("Manju", 50);
        System.out.println(student.toString());
    }
}
 