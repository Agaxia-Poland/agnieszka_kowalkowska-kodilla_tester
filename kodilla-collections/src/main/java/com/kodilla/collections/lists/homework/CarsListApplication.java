import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Ford("f1", 22, 3));
        cars.add(new Ford("f2", 1, 45));
        cars.add(new Ford("f21", 1, 415));
        cars.add(new Ford("f5", 15, 425));
        cars.add(new Ford("f21234", 1231, 451));
        cars.add(new Opel("o1", 22, 3));
        cars.add(new Opel("o2", 23, 4));
        cars.add(new Opel("o3", 34, 235));
        cars.add(new Toyota("t1", 78, 89));
        cars.add(new Toyota("t2", 320, 48));
        cars.add(new Toyota("t3", 240, 60));

        System.out.println(cars.size());

        cars.remove(1);
        System.out.println(cars.size());

        Ford carToRemove = new Ford("f5", 15, 425);
        cars.remove(carToRemove);
        System.out.println(cars.size());

        for (Car car : cars) {
            if (car.getSpeed() > 200) {
                car.describeCar();
            }
        }
    }
}




