package practice_2;

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Ford", 2025);
        carOne.setYear(2000);
        carOne.print();

        Book book = new Book("Martin Iden", "London");
        book.setAuthor("Marshak");
        book.printInfo();

        Rectangle rectangle = new Rectangle(5, 4);
        rectangle.setWidth(4);
        rectangle.calculateArea();

        BankAccount bankAccount = new BankAccount("Petr", 2000);
        bankAccount.deposit(500);
        bankAccount.withdraw(2400);
        bankAccount.printBalance();

        Point point = new Point(5, 6);
        point.setX(6);
        point.print();

        StudentGroup studentGroup = new StudentGroup("Class A", 30);
        studentGroup.setStudentCount(50);
        studentGroup.printInfo();

        Circle circle = new Circle(5);
        circle.setRadius(6);
        circle.calculateArea();
        circle.calculateCircumference();

        Teacher teacher = new Teacher("Alex", "Math");
        teacher.setSubject("Biol");
        teacher.printInfo();

        Product product = new Product("Cucumber", 200);
        product.setPrice(100);
        product.applyDiscount(25);
        product.printInfo();

        Laptop laptop = new Laptop("Dell", 20000);
        laptop.setPrice(10000);
        laptop.printInfo();
    }
}
