class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ThisKeyword {
    public static void main(String[] args) {

        Student student = new Student("John", 20);

        student.displayDetails();
    }
}
