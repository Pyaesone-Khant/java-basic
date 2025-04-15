public class Main {

    public static void main(String[] args) {

//        Composition = represents a "part-of" relationship between objects.
//                      for eg: an engine is a "part-of" the car.
//                      Allows complex objects to be constructed from smaller objects.

        Car car = new Car("FORD", "Ranger", 2020, "NAVY", 20000, "V8");

        System.out.println(car.getModel());
        System.out.println(car.engine.type);
        car.start();
    }
}
