package oops;

public class Student {
    int id;
    String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class Shyam extends Student{
    public static void main(String[] args) {
        Student student = new Student(1,"Shyam");

        System.out.println(student.toString());
    }
}
