package car.example.autowire.byName;

public class Car {
    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displaySpecification() {
        System.out.println("Specification: " + specification.toString());
    }
}
