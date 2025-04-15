public class Main {

    public static void main(String[] args) {
//      they help product object data and rules for accessing or modifying them.
//        GETTER = methods that make a field READABLE.
//        SETTER = methods that make a field WRITEABLE.

        Car car = new Car("FORD", "Ranger", 2021, "Navy", 10000);

        car.setColor("RED");
        car.setPrice(-20000); // this gonna throw an err msg

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

    }
}
