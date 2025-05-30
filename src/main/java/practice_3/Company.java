package practice_3;

public class Company {
    static String companyName = "MyName";
    final int employeeId;
    String employeeName;

    public Company(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(companyName);
    }
}
