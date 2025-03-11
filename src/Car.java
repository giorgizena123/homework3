class Car implements Comparable<Car> {
    String brand, model;
    int year, mileage;
    Engine engine;

    public Car(String brand, String model, int year, int mileage, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.engine = engine;
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(this.year, o.year);
    }

    @Override
    public String toString() {
        return brand + " " + model + " - Year: " + year + ", Mileage: " + mileage + ", Engine: " + engine.capacity + "L";
    }
}
