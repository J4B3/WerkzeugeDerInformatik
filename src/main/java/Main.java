public class Main {
    //This is a line from Merge_conflict
    public static void main(String[] args) {
        Factory factory = new Factory();

        Car car = new Car("red", "VW", 5);
        Car car1 = new Car("blue", "Audi", 3);

        factory.buildCar(car);
        factory.buildCar(car1);
    }
}
