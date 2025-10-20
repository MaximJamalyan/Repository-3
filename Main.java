public class Main {
    public static Car[] getCarByBrand(Car[] cars, String brand) {
        int count = 0;
        for (Car c : cars) {
            if (c.getBrand().equalsIgnoreCase(brand)) count++;
        }
        Car[] result = new Car[count];
        int i = 0;
        for (Car c : cars) {
            if (c.getBrand().equalsIgnoreCase(brand)) result[i++] = c;
        }
        return result;
    }
    public static Car[] getCarByBrandAndYearOperational(Car[] cars, String brand, int years) {
        int currentYear = java.time.Year.now().getValue();
        int count = 0;

        for (Car c : cars) {
            if (c.getBrand().equalsIgnoreCase(brand) && (currentYear - c.getYear() > years)) count++;
        }

        Car[] result = new Car[count];
        int i = 0;
        for (Car c : cars) {
            if (c.getBrand().equalsIgnoreCase(brand) && (currentYear - c.getYear() > years)) {
                result[i++] = c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2017, "White", 25000, "AA123"),
            new Car(2, "BMW", "X5", 2015, "Black", 40000, "BB456"),
            new Car(3, "Toyota", "Corolla", 2012, "Gray", 15000, "CC789")
        };

        Car[] toyotas = getCarByBrand(cars, "Toyota");
        System.out.println("Количество машин марки Toyota: " + toyotas.length);

        Car[] oldToyotas = getCarByBrandAndYearOperational(cars, "Toyota", 5);
        System.out.println("Количество машин Toyota старше 5 лет: " + oldToyotas.length);
    }
}
