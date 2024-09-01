package car.example.autowire.constructor;

public class Car {
    private Specification specification;

    public Car(Specification specification) {
        this.specification = specification;
    }

    public void displaySpecification() {
        System.out.println("Specification: " + specification.toString());
    }
}
