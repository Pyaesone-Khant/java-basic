public class Car implements Vehicle {

    private final String make;
    private final String model;
    private final int year;
    Engine engine;
    private int price;
    private String color;

    Car(String make, String model, int year, String color, int price, String engineType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
        this.engine = new Engine(engineType);
    }

    void start() {
        this.engine.start();
        System.out.printf("The %s is running!", this.model);
    }

    String getModel() {
        return this.model;
    }

    String getMake() {
        return this.make;
    }

    String getColor() {
        return this.color;
    }

    void setColor(String color) {
        this.color = color;
    }

    Integer getYear() {
        return this.year;
    }

    String getPrice() {
        return "$" + this.price;
    }

    void setPrice(int price) {
        if (price < 0) {
            System.out.println("Price can't be less than zero!");
        } else {
            this.price = price;
        }
    }

//	.toString() => method inherited from the object class.
//	               used to return a string representation for an object.
//	               by default, it returns a hash code as a unique identifier.
//	               it can be overridden to provide meaningful details.

    @Override
    public String toString() {
        return this.make + " " + this.model + " " + this.year + " " + this.color;
    }

    @Override
    public void go() {
        System.out.println("The car is going!");
    }
}

