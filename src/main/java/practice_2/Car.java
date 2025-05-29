package practice_2;

public class Car {
    String brand;
    int year;

    public Car(String someBrand, int someYear) {
        this.brand = someBrand;
        this.year = someYear;
    }

    String getBrand() {
        return this.brand;
    }

    public int getYear() {
        return this.year;
    }

    void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    void setYear(int newYear) {
        this.year = newYear;
    }

    public void print() {
        System.out.println("Brand is " + brand + ", " +  "Year is " + year);
    }

}
