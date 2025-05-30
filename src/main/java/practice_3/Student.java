package practice_3;

public class Student {
    final static int maxYears;
    static int studentCount;

    static {
        maxYears = 11;
        studentCount = 0;
    }
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        studentCount++;
    }

    public int getAge() {
        return age;
    }

    static void printMaxYears() {
        System.out.println(maxYears);
    }
}
