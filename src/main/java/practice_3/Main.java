package practice_3;

public class Main {

    public static void main(String[] args) {
        Company.printCompanyName();
        Company firstEmpl = new Company(1, "N1");
        Company secondEmpl = new Company(2, "N2");
        Company.companyName = "MyName2";
        Company.printCompanyName();

        MathConstants mathConstants = new MathConstants();
        mathConstants.calculateCircleArea(4);
        mathConstants.calculateCircumference(4);

        University university1 = new University(1, "Student1");
        university1.printStudentInfo();
        University university2 = new University(2, "Student2");
        University university3 = new University(3, "Student3");
        System.out.println(University.universityName);
        University.changeUniversityName("MGU");
        System.out.println(University.universityName);

        university1.printStudentInfo();
        university3.printStudentInfo();


        System.out.println(GameSettings.maxPlayers);
        GameSettings gameSettings1 = new GameSettings(18, "LastOfUS");
        GameSettings.setMaxPlayers(19);
        gameSettings1.addPlayer();
        gameSettings1.addPlayer();
        System.out.println(GameSettings.maxPlayers);
        GameSettings gameSettings2 = new GameSettings(15, "Diablo");

        gameSettings1.printGameStatus();

        gameSettings2.printGameStatus();

        Person person1 = new Person("Name1", "LastName1", "11-111");
        Person person2 = new Person("Name2", "LastName2", "11-112");
        Person person3 = new Person("Name3", "LastName3", "11-113");

        person1.setFirstName("Dima");
        person1.setLastName("Malyshev");

        person1.printPersonInfo();
        person2.printPersonInfo();
        person3.printPersonInfo();
    }
}
