package T3;

class Car implements Comparable<Car> {
    String model;
    Integer priceInRubles;

    public Car(String model, Integer priceInRubles) {
        this.model = model;
        this.priceInRubles = priceInRubles;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return model.equals(car.model);
    }

    public int hashCode() {
        return model.hashCode();
    }

    @Override
    public int compareTo(Car o) {
        return this.priceInRubles - o.priceInRubles;
    }

    public String toString() {
        return "Car{model=" + model + ", priceInRubles=" + priceInRubles + "}";
    }
}
