import java.util.*;

class Student
{
    int roll; // Instance variable
    String name;
    static int count; // Static variable

    public Student(int a, String s)
    {
        this.roll = a;
        this.name = s;
        count++;
    }

    static void show()
    {
        System.out.println("Count value is "+count);
    }
}

class Lecture10
{
    public static void main(String o[])
    {
        Student obj1 = new Student(10,"Alice");
        Student obj2 = new Student(15,"Bob");
        Student obj3 = new Student(20,"Eve");

        System.out.println(Student.count);
        Student.show();

    }
}
