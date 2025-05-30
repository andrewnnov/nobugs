package practice_3;

public class University {
    static String universityName = "Lobach";
    final int studentID;
    String studentName;

    public University(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    void printStudentInfo() {
        System.out.println("Student name " + studentName);
        System.out.println("Student ID " + studentID);
        System.out.println(universityName);
    }
}
